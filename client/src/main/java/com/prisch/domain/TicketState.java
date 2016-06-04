package com.prisch.domain;

import java.util.Arrays;
import java.util.Optional;

public enum TicketState {

    L3_ASSIGNED             ("CHANGE_REQUESTS_WORKFLOW.L3_ASSIGNED", true),
    L3_ESTIMATED            ("CHANGE_REQUESTS_WORKFLOW.L3_ESTIMATED", true),
    L3_SCHEDULED            ("CHANGE_REQUESTS_WORKFLOW.L3_SCHEDULED", true),
    QA_DEPLOY_REQUESTED     ("CHANGE_REQUESTS_WORKFLOW.QA_DEPLOY_REQUESTED", true),
    READY_FOR_TST           ("CHANGE_REQUESTS_WORKFLOW.READY_FOR_TST", true),
    READY_FOR_QA            ("CHANGE_REQUESTS_WORKFLOW.READY_FOR_QA", true),
    READY_FOR_QA_TESTING    ("CHANGE_REQUESTS_WORKFLOW.READY_FOR_QA_TESTING", true),
    REVIEW_FAILED           ("CHANGE_REQUESTS_WORKFLOW.REVIEW_FAILED", true),
    L2_FIXED                ("CHANGE_REQUESTS_WORKFLOW.L2_FIXED", false),
    RESOLVED                ("CHANGE_REQUESTS_WORKFLOW.RESOLVED", false),
    CLOSED                  ("CHANGE_REQUESTS_WORKFLOW.CLOSED", false),
    CANCELLED               ("CHANGE_REQUESTS_WORKFLOW.CANCELLED2", false),
    REJECTED                ("CHANGE_REQUESTS_WORKFLOW.REJECTED", false),
    PARKED                  ("CHANGE_REQUESTS_WORKFLOW.PARKED", false);

    private final String internalName;
    private final boolean relevantForL3;

    TicketState(String internalName, boolean relevantForL3) {
        this.internalName = internalName;
        this.relevantForL3 = relevantForL3;
    }

    public static Optional<TicketState> matching(String internalName) {
        return Arrays.stream(values()).filter(state -> state.getInternalName().equals(internalName))
                                      .findAny();
    }

    public String getInternalName() {
        return internalName;
    }

    public boolean isRelevantForL3() {
        return relevantForL3;
    }
}
