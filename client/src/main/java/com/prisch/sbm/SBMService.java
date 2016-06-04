package com.prisch.sbm;

import com.prisch.collections.Lists;
import com.prisch.domain.TicketState;
import com.prisch.sbm.stubs.*;
import com.prisch.util.Result;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

public class SBMService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SBMService.class);

    private static final String UNAUTHORIZED_MESSAGE_PORTION = "does not have the privilege";

    private final ObjectFactory factory = new ObjectFactory();
    private final Sbmappservices72 service = new Sbmappservices72(Sbmappservices72.SBMAPPSERVICES72_WSDL_LOCATION, Sbmappservices72.SBMAPPSERVICES72_QNAME);
    private final Sbmappservices72PortType port = service.getSbmappservices72();
    private final Auth auth;

    private TableIdentifier tableIdentifier;
    private Map<TicketState, StateIdentifier> stateMap;


    // ===== Interface =====

    public SBMService(String username, String password) {
        BindingProvider bindingProvider = (BindingProvider)port;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://sbm.alm.slb.com/gsoap/gsoap_ssl.dll?sbmappservices72");

        auth = factory.createAuth();
        auth.setUserId(factory.createAuthUserId(username));
        auth.setPassword(factory.createAuthPassword(password));
    }

    public void initialise() throws Exception {
        SolutionIdentifier solutionIdentifier = getChangeRequestSolutionIdentifier();
        tableIdentifier = getChangeRequestsTableIdentifier(solutionIdentifier);

        ProjectIdentifier projectIdentifier = getChangeRequestsProjectIdentifier(tableIdentifier);
        stateMap = getTicketStateMap(projectIdentifier);

        LOGGER.info("Successfully initialized the SBM service for table " + tableIdentifier.getDisplayName().getValue());
    }

    public Result<TTItem> getTicketDetails(String ticketNumber) {
        final String QUERY = "(ts_issueid = '%s')";

        String query = String.format(QUERY, ticketNumber.substring(3)); // SBM only cares about the number, not the designator (for example ENH)
        try {
            TTItemList items = port.getItemsByQuery(auth, tableIdentifier, query, null, null, null, null);
            if (items.getItem().size() != 1) {
                return Result.failure("Sorry, I could not find a ticket with ID " + ticketNumber);
            }

            return Result.success(items.getItem().get(0));
        } catch (AEWebservicesFaultFault ex) {
            if (ex.getMessage().contains(UNAUTHORIZED_MESSAGE_PORTION)) {
                return Result.failure("Sorry, I do not have access to ticket with ID" + ticketNumber);
            }

            LOGGER.error(ex.getMessage(), ex);
            return Result.failure("Sorry, I can't talk to SBM at this moment.");
        }
    }

    public Result<TTItemList> getTicketsFor(long userId) {
        final String QUERY = "(ts_l3_primary_contact_user = '%d' and ts_state not in (%s))";

        String excludedStates = stateMap.entrySet().stream().filter(entry -> !entry.getKey().isRelevantForL3())
                                        .map(entry -> String.format("'%s'", entry.getValue().getId().toString()))
                                        .collect(Collectors.joining(","));

        String query = String.format(QUERY, userId, excludedStates);
        try {
            TTItemList items = port.getItemsByQuery(auth, tableIdentifier, query, null, null, null, getOptionsToRestrictTicketToBasic());
            return Result.success(items);
        } catch (AEWebservicesFaultFault ex) {
            LOGGER.error(ex.getMessage(), ex);
            return Result.failure("Sorry, I can't talk to SBM at this moment.");
        }
    }

    // ===== Helpers =====

    private SolutionIdentifier getChangeRequestSolutionIdentifier() throws Exception {
        final String SOLUTION_NAME = "CHANGE_REQUESTS";

        Optional<SolutionIdentifier> identifier = port.getSolutions(auth, null).stream()
                                                      .map(result -> result.getSolution().getValue())
                                                      .filter(solution -> solution.getUniqueName().getValue().equals(SOLUTION_NAME))
                                                      .findAny();

        return identifier.orElseThrow(() -> new IllegalStateException("Could not find the " + SOLUTION_NAME + " solution."));
    }

    private TableIdentifier getChangeRequestsTableIdentifier(SolutionIdentifier solutionIdentifier) throws Exception {
        final String TABLE_NAME = "USR_CHANGE_REQUESTS";

        Optional<TableIdentifier> identifier = port.getTables(auth, solutionIdentifier, null, null).stream()
                                                   .map(result -> result.getTable().getValue())
                                                   .filter(table -> table.getDbName().getValue().equals(TABLE_NAME))
                                                   .findAny();

        return identifier.orElseThrow(() -> new IllegalStateException("Could not find the " + TABLE_NAME + " table."));
    }

    private ProjectIdentifier getChangeRequestsProjectIdentifier(TableIdentifier tableIdentifier) throws Exception {
        final String PROJECT_NAME = "LOADCHART";

        Optional<ProjectIdentifier> identifier = port.getSubmitProjects(auth, tableIdentifier, null).stream()
                                                     .map(result -> result.getProject().getValue())
                                                     .filter(project -> project.getDisplayName().getValue().equals(PROJECT_NAME))
                                                     .findAny();

        return identifier.orElseThrow(() -> new IllegalStateException("Could not find the " + PROJECT_NAME + " project."));
    }

    private Map<TicketState, StateIdentifier> getTicketStateMap(ProjectIdentifier projectIdentifier) throws Exception {
        List<StateIdentifier> stateIdentifiers = port.getWorkflows(auth, Lists.of(projectIdentifier)).stream()
                                                     .flatMap(result -> result.getWorkflow().getValue().getState().stream())
                                                     .map(state -> state.getId().getValue())
                                                     .collect(Collectors.toList());

        return stateIdentifiers.stream().filter(identifier -> TicketState.matching(identifier.getInternalName().getValue()).isPresent())
                                        .collect(Collectors.toMap(identifier -> TicketState.matching(identifier.getInternalName().getValue()).get(), identity()));

    }

    private MultipleResponseItemOptions getOptionsToRestrictTicketToBasic() {
        MultipleResponseItemOptions options = new MultipleResponseItemOptions();

        options.setSections(SectionsOption.SECTIONS_SPECIFIED);
        options.setSpecifiedSections(factory.createResponseItemOptionsSpecifiedSections("SECTION:FIXED"));

        return options;
    }

}
