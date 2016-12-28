
package com.prisch.sbm.stubs;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * SBM Application Web Services Version 7.2
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "sbmappservices72", targetNamespace = "http://alm.slb.com/gsoap/aewebservices71.wsdl", wsdlLocation = "http://sbm.alm.slb.com/gsoap/sbmappservices72.wsdl")
public class Sbmappservices72
    extends Service
{

    public final static URL SBMAPPSERVICES72_WSDL_LOCATION;
    public final static WebServiceException SBMAPPSERVICES72_EXCEPTION;
    public final static QName SBMAPPSERVICES72_QNAME = new QName("http://localhost:80/gsoap/sbmappservices72.wsdl", "sbmappservices72");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://sbm.alm.slb.com/gsoap/sbmappservices72.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SBMAPPSERVICES72_WSDL_LOCATION = url;
        SBMAPPSERVICES72_EXCEPTION = e;
    }

    public Sbmappservices72() {
        super(__getWsdlLocation(), SBMAPPSERVICES72_QNAME);
    }

    public Sbmappservices72(WebServiceFeature... features) {
        super(__getWsdlLocation(), SBMAPPSERVICES72_QNAME, features);
    }

    public Sbmappservices72(URL wsdlLocation) {
        super(wsdlLocation, SBMAPPSERVICES72_QNAME);
    }

    public Sbmappservices72(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SBMAPPSERVICES72_QNAME, features);
    }

    public Sbmappservices72(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Sbmappservices72(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Sbmappservices72PortType
     */
    @WebEndpoint(name = "sbmappservices72")
    public Sbmappservices72PortType getSbmappservices72() {
        return super.getPort(new QName("http://localhost:80/gsoap/sbmappservices72.wsdl", "sbmappservices72"), Sbmappservices72PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sbmappservices72PortType
     */
    @WebEndpoint(name = "sbmappservices72")
    public Sbmappservices72PortType getSbmappservices72(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:80/gsoap/sbmappservices72.wsdl", "sbmappservices72"), Sbmappservices72PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SBMAPPSERVICES72_EXCEPTION!= null) {
            throw SBMAPPSERVICES72_EXCEPTION;
        }
        return SBMAPPSERVICES72_WSDL_LOCATION;
    }

}
