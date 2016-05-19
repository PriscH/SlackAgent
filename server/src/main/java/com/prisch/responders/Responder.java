package com.prisch.responders;

import com.prisch.slack.SlackSession;
import com.ullink.slack.simpleslackapi.SlackChannel;

public interface Responder {

    void respond(SlackSession slackSession, SlackChannel slackChannel);
}
