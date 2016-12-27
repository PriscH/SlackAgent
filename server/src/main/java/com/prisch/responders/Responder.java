package com.prisch.responders;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public interface Responder {

    void respond(SlackSession slackSession, SlackChannel slackChannel);
}
