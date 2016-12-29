package com.prisch;

import fi.iki.elonen.NanoHTTPD;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

// TODO: Not quite thread-safe between serving a request and having new routes registered
public class RouterHTTPD extends NanoHTTPD {

    private Map<Route, RouteResponder> router = new HashMap<>();
    private RouteResponder defaultResponder;

    // === Constructors ===

    public RouterHTTPD(int port) {
        super(port);
    }

    public RouterHTTPD(String hostname, int port) {
        super(hostname, port);
    }

    // === Public API ===

    public void addRoute(String path, Method method, RouteResponder responder) {
        Route route = new Route(path, method);
        router.put(route, responder);
    }

    public void addDefaultResponder(RouteResponder responder) {
        this.defaultResponder = responder;
    }

    // === Inherited Operations ===

    @Override
    public Response serve(IHTTPSession session) {
        Route route = new Route(session.getUri(), session.getMethod());
        if (router.containsKey(route)) {
            return router.get(route).apply(session);
        } else if  (defaultResponder != null) {
            return defaultResponder.apply(session);
        } else {
            return newFixedLengthResponse(Response.Status.NOT_FOUND, MIME_PLAINTEXT, "Invalid path or method.");
        }
    }

    // === Helper Types ===

    public interface RouteResponder extends Function<IHTTPSession, Response> {}

    private final class Route {

        private final String path;
        private final Method method;

        Route(String path, Method method) {
            this.path = path;
            this.method = method;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route route = (Route) o;

            if (!path.equals(route.path)) return false;
            return method == route.method;
        }

        @Override
        public int hashCode() {
            int result = path.hashCode();
            result = 31 * result + (method != null ? method.hashCode() : 0);
            return result;
        }
    }
}
