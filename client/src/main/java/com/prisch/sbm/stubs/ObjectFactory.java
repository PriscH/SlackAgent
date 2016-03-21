
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.prisch.sbm.stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SerenaDiagnostics_QNAME = new QName("urn:SerenaDiagnostics", "SerenaDiagnostics");
    private final static QName _AEWebservicesFault_QNAME = new QName("urn:sbmappservices72", "AEWebservicesFault");
    private final static QName _XId_QNAME = new QName("urn:SerenaDiagnostics", "XId");
    private final static QName _TTItemCreatedBy_QNAME = new QName("urn:sbmappservices72", "createdBy");
    private final static QName _TTItemModifiedDate_QNAME = new QName("urn:sbmappservices72", "modifiedDate");
    private final static QName _TTItemId_QNAME = new QName("urn:sbmappservices72", "id");
    private final static QName _TTItemState_QNAME = new QName("urn:sbmappservices72", "state");
    private final static QName _TTItemModifiedBy_QNAME = new QName("urn:sbmappservices72", "modifiedBy");
    private final static QName _TTItemActiveInactive_QNAME = new QName("urn:sbmappservices72", "activeInactive");
    private final static QName _TTItemCreateDate_QNAME = new QName("urn:sbmappservices72", "createDate");
    private final static QName _TTItemExtendedData_QNAME = new QName("urn:sbmappservices72", "extendedData");
    private final static QName _TTItemOwner_QNAME = new QName("urn:sbmappservices72", "owner");
    private final static QName _TTItemItemType_QNAME = new QName("urn:sbmappservices72", "itemType");
    private final static QName _TTItemSubtasks_QNAME = new QName("urn:sbmappservices72", "subtasks");
    private final static QName _TTItemProject_QNAME = new QName("urn:sbmappservices72", "project");
    private final static QName _TTItemDescription_QNAME = new QName("urn:sbmappservices72", "description");
    private final static QName _TTItemTitle_QNAME = new QName("urn:sbmappservices72", "title");
    private final static QName _TTItemUrl_QNAME = new QName("urn:sbmappservices72", "url");
    private final static QName _GetItemAuth_QNAME = new QName("urn:sbmappservices72", "auth");
    private final static QName _GetItemOptions_QNAME = new QName("urn:sbmappservices72", "options");
    private final static QName _ExtraValueName_QNAME = new QName("urn:sbmappservices72", "name");
    private final static QName _ExtraValueValue_QNAME = new QName("urn:sbmappservices72", "value");
    private final static QName _NoteNote_QNAME = new QName("urn:sbmappservices72", "note");
    private final static QName _NoteAuthor_QNAME = new QName("urn:sbmappservices72", "author");
    private final static QName _TransitionItemsTransition_QNAME = new QName("urn:sbmappservices72", "transition");
    private final static QName _UserInfoEmailCC_QNAME = new QName("urn:sbmappservices72", "emailCC");
    private final static QName _UserInfoPhoneNumber_QNAME = new QName("urn:sbmappservices72", "phoneNumber");
    private final static QName _UserInfoContact_QNAME = new QName("urn:sbmappservices72", "contact");
    private final static QName _UserInfoTimezone_QNAME = new QName("urn:sbmappservices72", "timezone");
    private final static QName _UserInfoLocale_QNAME = new QName("urn:sbmappservices72", "locale");
    private final static QName _UserInfoPreferredSolution_QNAME = new QName("urn:sbmappservices72", "preferredSolution");
    private final static QName _UserInfoEmail_QNAME = new QName("urn:sbmappservices72", "email");
    private final static QName _UserInfoNamespaceName_QNAME = new QName("urn:sbmappservices72", "namespaceName");
    private final static QName _RunReportSolution_QNAME = new QName("urn:sbmappservices72", "solution");
    private final static QName _RunReportReport_QNAME = new QName("urn:sbmappservices72", "report");
    private final static QName _RunReportQueryRange_QNAME = new QName("urn:sbmappservices72", "queryRange");
    private final static QName _RunReportTable_QNAME = new QName("urn:sbmappservices72", "table");
    private final static QName _ReportResultItem_QNAME = new QName("urn:sbmappservices72", "item");
    private final static QName _ReportResultItemURL_QNAME = new QName("urn:sbmappservices72", "itemURL");
    private final static QName _PrivilegeInfoProjectId_QNAME = new QName("urn:sbmappservices72", "projectId");
    private final static QName _PrivilegeInfoObjectId_QNAME = new QName("urn:sbmappservices72", "objectId");
    private final static QName _OrderBySecondFieldName_QNAME = new QName("urn:sbmappservices72", "secondFieldName");
    private final static QName _OrderByFirstFieldName_QNAME = new QName("urn:sbmappservices72", "firstFieldName");
    private final static QName _FileContentsContentsBase64_QNAME = new QName("urn:sbmappservices72", "contentsBase64");
    private final static QName _GetUsersSearchByName_QNAME = new QName("urn:sbmappservices72", "searchByName");
    private final static QName _RunReportXmlResultResult_QNAME = new QName("urn:sbmappservices72", "result");
    private final static QName _UpdateFileAttachmentAttachmentContents_QNAME = new QName("urn:sbmappservices72", "attachmentContents");
    private final static QName _StateChangeHistoryUser_QNAME = new QName("urn:sbmappservices72", "user");
    private final static QName _StateChangeHistoryNewState_QNAME = new QName("urn:sbmappservices72", "newState");
    private final static QName _FieldIdentifierDbName_QNAME = new QName("urn:sbmappservices72", "dbName");
    private final static QName _ResponseItemOptionsSpecifiedSections_QNAME = new QName("urn:sbmappservices72", "specifiedSections");
    private final static QName _NameValueSetValueMethod_QNAME = new QName("urn:sbmappservices72", "setValueMethod");
    private final static QName _NameValueSetValueBy_QNAME = new QName("urn:sbmappservices72", "setValueBy");
    private final static QName _CreatePrimaryItemSubmitTransition_QNAME = new QName("urn:sbmappservices72", "submitTransition");
    private final static QName _CreatePrimaryItemParentItem_QNAME = new QName("urn:sbmappservices72", "parentItem");
    private final static QName _UserSolutionDataHomeReport_QNAME = new QName("urn:sbmappservices72", "homeReport");
    private final static QName _RunReportXmlResponseReturn_QNAME = new QName("urn:sbmappservices72", "return");
    private final static QName _SolutionDataPrefix_QNAME = new QName("urn:sbmappservices72", "prefix");
    private final static QName _ReportDefinitionOrderBy_QNAME = new QName("urn:sbmappservices72", "orderBy");
    private final static QName _WorkflowTransitionLabelPosition_QNAME = new QName("urn:sbmappservices72", "labelPosition");
    private final static QName _WorkflowTransitionStyleClass_QNAME = new QName("urn:sbmappservices72", "styleClass");
    private final static QName _ProjectIdentifierInternalName_QNAME = new QName("urn:sbmappservices72", "internalName");
    private final static QName _ProjectIdentifierFullyQualifiedName_QNAME = new QName("urn:sbmappservices72", "fullyQualifiedName");
    private final static QName _GroupHolderGroup_QNAME = new QName("urn:sbmappservices72", "group");
    private final static QName _FieldField_QNAME = new QName("urn:sbmappservices72", "field");
    private final static QName _FieldValueDisplayValue_QNAME = new QName("urn:sbmappservices72", "displayValue");
    private final static QName _FieldValueInternalValue_QNAME = new QName("urn:sbmappservices72", "internalValue");
    private final static QName _FieldValueUuid_QNAME = new QName("urn:sbmappservices72", "uuid");
    private final static QName _FailedItemItemId_QNAME = new QName("urn:sbmappservices72", "itemId");
    private final static QName _FailedItemStatus_QNAME = new QName("urn:sbmappservices72", "status");
    private final static QName _ItemIdentifierIssueId_QNAME = new QName("urn:sbmappservices72", "issueId");
    private final static QName _ItemIdentifierTableIdItemId_QNAME = new QName("urn:sbmappservices72", "tableIdItemId");
    private final static QName _WorkflowBandStyleOverride_QNAME = new QName("urn:sbmappservices72", "styleOverride");
    private final static QName _SubTasksParentItemId_QNAME = new QName("urn:sbmappservices72", "parentItemId");
    private final static QName _GetAvailableSubmitTransitionsAttributeName_QNAME = new QName("urn:sbmappservices72", "attributeName");
    private final static QName _FileAttachmentFileName_QNAME = new QName("urn:sbmappservices72", "fileName");
    private final static QName _PrivilegeIdentifierType_QNAME = new QName("urn:sbmappservices72", "type");
    private final static QName _ReportDataReportReference_QNAME = new QName("urn:sbmappservices72", "reportReference");
    private final static QName _UserIdentifierLoginId_QNAME = new QName("urn:sbmappservices72", "loginId");
    private final static QName _ItemLinkItemID_QNAME = new QName("urn:sbmappservices72", "itemID");
    private final static QName _NoteLoggerInfoEmailAddress_QNAME = new QName("urn:sbmappservices72", "emailAddress");
    private final static QName _ApplicationDataAppDefUUID_QNAME = new QName("urn:sbmappservices72", "appDefUUID");
    private final static QName _ApplicationDataApplication_QNAME = new QName("urn:sbmappservices72", "application");
    private final static QName _ApplicationDataRevision_QNAME = new QName("urn:sbmappservices72", "revision");
    private final static QName _GetItemsByQueryQueryWhereClause_QNAME = new QName("urn:sbmappservices72", "queryWhereClause");
    private final static QName _GetItemsByQueryOrderByClause_QNAME = new QName("urn:sbmappservices72", "orderByClause");
    private final static QName _GroupInfoMemo_QNAME = new QName("urn:sbmappservices72", "memo");
    private final static QName _WorkflowStateSize_QNAME = new QName("urn:sbmappservices72", "size");
    private final static QName _WorkflowStateCenter_QNAME = new QName("urn:sbmappservices72", "center");
    private final static QName _IdentifierDisplayName_QNAME = new QName("urn:sbmappservices72", "displayName");
    private final static QName _WorkflowHolderWorkflow_QNAME = new QName("urn:sbmappservices72", "workflow");
    private final static QName _NoteAttachmentContentsBody_QNAME = new QName("urn:sbmappservices72", "body");
    private final static QName _WorkflowCommentOwnerState_QNAME = new QName("urn:sbmappservices72", "ownerState");
    private final static QName _WorkflowCommentText_QNAME = new QName("urn:sbmappservices72", "text");
    private final static QName _WorkflowCommentOwnerTransition_QNAME = new QName("urn:sbmappservices72", "ownerTransition");
    private final static QName _CreateNoteAttachmentNoteContents_QNAME = new QName("urn:sbmappservices72", "noteContents");
    private final static QName _SolutionIdentifierUniqueName_QNAME = new QName("urn:sbmappservices72", "uniqueName");
    private final static QName _SolutionIdentifierTabName_QNAME = new QName("urn:sbmappservices72", "tabName");
    private final static QName _AuthLoginAsUserId_QNAME = new QName("urn:sbmappservices72", "loginAsUserId");
    private final static QName _AuthPassword_QNAME = new QName("urn:sbmappservices72", "password");
    private final static QName _AuthHostname_QNAME = new QName("urn:sbmappservices72", "hostname");
    private final static QName _AuthUserId_QNAME = new QName("urn:sbmappservices72", "userId");
    private final static QName _GetReportsReportsFilter_QNAME = new QName("urn:sbmappservices72", "reportsFilter");
    private final static QName _TransitionFromState_QNAME = new QName("urn:sbmappservices72", "fromState");
    private final static QName _TransitionToState_QNAME = new QName("urn:sbmappservices72", "toState");
    private final static QName _StatusCode_QNAME = new QName("urn:sbmappservices72", "code");
    private final static QName _StatusMessage_QNAME = new QName("urn:sbmappservices72", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.prisch.sbm.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SerenaDiagnostics }
     * 
     */
    public SerenaDiagnostics createSerenaDiagnostics() {
        return new SerenaDiagnostics();
    }

    /**
     * Create an instance of {@link GetWorkflowsResponse }
     * 
     */
    public GetWorkflowsResponse createGetWorkflowsResponse() {
        return new GetWorkflowsResponse();
    }

    /**
     * Create an instance of {@link WorkflowHolder }
     * 
     */
    public WorkflowHolder createWorkflowHolder() {
        return new WorkflowHolder();
    }

    /**
     * Create an instance of {@link DeleteItemsByQueryResponse }
     * 
     */
    public DeleteItemsByQueryResponse createDeleteItemsByQueryResponse() {
        return new DeleteItemsByQueryResponse();
    }

    /**
     * Create an instance of {@link GetSubmitProjectsResponse }
     * 
     */
    public GetSubmitProjectsResponse createGetSubmitProjectsResponse() {
        return new GetSubmitProjectsResponse();
    }

    /**
     * Create an instance of {@link ProjectData }
     * 
     */
    public ProjectData createProjectData() {
        return new ProjectData();
    }

    /**
     * Create an instance of {@link UpdateFileAttachmentResponse }
     * 
     */
    public UpdateFileAttachmentResponse createUpdateFileAttachmentResponse() {
        return new UpdateFileAttachmentResponse();
    }

    /**
     * Create an instance of {@link FileAttachment }
     * 
     */
    public FileAttachment createFileAttachment() {
        return new FileAttachment();
    }

    /**
     * Create an instance of {@link DeleteItemsResponse }
     * 
     */
    public DeleteItemsResponse createDeleteItemsResponse() {
        return new DeleteItemsResponse();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link RunReport }
     * 
     */
    public RunReport createRunReport() {
        return new RunReport();
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link QueryRange }
     * 
     */
    public QueryRange createQueryRange() {
        return new QueryRange();
    }

    /**
     * Create an instance of {@link ReportIdentifier }
     * 
     */
    public ReportIdentifier createReportIdentifier() {
        return new ReportIdentifier();
    }

    /**
     * Create an instance of {@link SolutionIdentifier }
     * 
     */
    public SolutionIdentifier createSolutionIdentifier() {
        return new SolutionIdentifier();
    }

    /**
     * Create an instance of {@link ProjectIdentifier }
     * 
     */
    public ProjectIdentifier createProjectIdentifier() {
        return new ProjectIdentifier();
    }

    /**
     * Create an instance of {@link TableIdentifier }
     * 
     */
    public TableIdentifier createTableIdentifier() {
        return new TableIdentifier();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link CreateAuxItemResponse }
     * 
     */
    public CreateAuxItemResponse createCreateAuxItemResponse() {
        return new CreateAuxItemResponse();
    }

    /**
     * Create an instance of {@link TTItemHolder }
     * 
     */
    public TTItemHolder createTTItemHolder() {
        return new TTItemHolder();
    }

    /**
     * Create an instance of {@link GetAvailableSubmitTransitions }
     * 
     */
    public GetAvailableSubmitTransitions createGetAvailableSubmitTransitions() {
        return new GetAvailableSubmitTransitions();
    }

    /**
     * Create an instance of {@link GetApplications }
     * 
     */
    public GetApplications createGetApplications() {
        return new GetApplications();
    }

    /**
     * Create an instance of {@link IsUserValid }
     * 
     */
    public IsUserValid createIsUserValid() {
        return new IsUserValid();
    }

    /**
     * Create an instance of {@link UserIdentifier }
     * 
     */
    public UserIdentifier createUserIdentifier() {
        return new UserIdentifier();
    }

    /**
     * Create an instance of {@link CreateAuxItem }
     * 
     */
    public CreateAuxItem createCreateAuxItem() {
        return new CreateAuxItem();
    }

    /**
     * Create an instance of {@link TTItem }
     * 
     */
    public TTItem createTTItem() {
        return new TTItem();
    }

    /**
     * Create an instance of {@link ResponseItemOptions }
     * 
     */
    public ResponseItemOptions createResponseItemOptions() {
        return new ResponseItemOptions();
    }

    /**
     * Create an instance of {@link RunReportResponse }
     * 
     */
    public RunReportResponse createRunReportResponse() {
        return new RunReportResponse();
    }

    /**
     * Create an instance of {@link RunReportResult }
     * 
     */
    public RunReportResult createRunReportResult() {
        return new RunReportResult();
    }

    /**
     * Create an instance of {@link DeleteItemsByQuery }
     * 
     */
    public DeleteItemsByQuery createDeleteItemsByQuery() {
        return new DeleteItemsByQuery();
    }

    /**
     * Create an instance of {@link MultipleOptions }
     * 
     */
    public MultipleOptions createMultipleOptions() {
        return new MultipleOptions();
    }

    /**
     * Create an instance of {@link GetItemsResponse }
     * 
     */
    public GetItemsResponse createGetItemsResponse() {
        return new GetItemsResponse();
    }

    /**
     * Create an instance of {@link DeleteAttachmentResponse }
     * 
     */
    public DeleteAttachmentResponse createDeleteAttachmentResponse() {
        return new DeleteAttachmentResponse();
    }

    /**
     * Create an instance of {@link GetStateChangeHistoryResponse }
     * 
     */
    public GetStateChangeHistoryResponse createGetStateChangeHistoryResponse() {
        return new GetStateChangeHistoryResponse();
    }

    /**
     * Create an instance of {@link GetStateChangeHistoryResult }
     * 
     */
    public GetStateChangeHistoryResult createGetStateChangeHistoryResult() {
        return new GetStateChangeHistoryResult();
    }

    /**
     * Create an instance of {@link GetReportsResponse }
     * 
     */
    public GetReportsResponse createGetReportsResponse() {
        return new GetReportsResponse();
    }

    /**
     * Create an instance of {@link GetReportsResult }
     * 
     */
    public GetReportsResult createGetReportsResult() {
        return new GetReportsResult();
    }

    /**
     * Create an instance of {@link CreatePrimaryItemsResponse }
     * 
     */
    public CreatePrimaryItemsResponse createCreatePrimaryItemsResponse() {
        return new CreatePrimaryItemsResponse();
    }

    /**
     * Create an instance of {@link UpdateFileAttachment }
     * 
     */
    public UpdateFileAttachment createUpdateFileAttachment() {
        return new UpdateFileAttachment();
    }

    /**
     * Create an instance of {@link ItemIdentifier }
     * 
     */
    public ItemIdentifier createItemIdentifier() {
        return new ItemIdentifier();
    }

    /**
     * Create an instance of {@link FileAttachmentContents }
     * 
     */
    public FileAttachmentContents createFileAttachmentContents() {
        return new FileAttachmentContents();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link CreateNoteAttachmentResponse }
     * 
     */
    public CreateNoteAttachmentResponse createCreateNoteAttachmentResponse() {
        return new CreateNoteAttachmentResponse();
    }

    /**
     * Create an instance of {@link IsUserValidResponse }
     * 
     */
    public IsUserValidResponse createIsUserValidResponse() {
        return new IsUserValidResponse();
    }

    /**
     * Create an instance of {@link TransitionItemsResponse }
     * 
     */
    public TransitionItemsResponse createTransitionItemsResponse() {
        return new TransitionItemsResponse();
    }

    /**
     * Create an instance of {@link GetApplicationsResponse }
     * 
     */
    public GetApplicationsResponse createGetApplicationsResponse() {
        return new GetApplicationsResponse();
    }

    /**
     * Create an instance of {@link ApplicationData }
     * 
     */
    public ApplicationData createApplicationData() {
        return new ApplicationData();
    }

    /**
     * Create an instance of {@link LinkSubtask }
     * 
     */
    public LinkSubtask createLinkSubtask() {
        return new LinkSubtask();
    }

    /**
     * Create an instance of {@link GetTables }
     * 
     */
    public GetTables createGetTables() {
        return new GetTables();
    }

    /**
     * Create an instance of {@link GetSubmitProjects }
     * 
     */
    public GetSubmitProjects createGetSubmitProjects() {
        return new GetSubmitProjects();
    }

    /**
     * Create an instance of {@link GetFieldSelections }
     * 
     */
    public GetFieldSelections createGetFieldSelections() {
        return new GetFieldSelections();
    }

    /**
     * Create an instance of {@link FieldIdentifier }
     * 
     */
    public FieldIdentifier createFieldIdentifier() {
        return new FieldIdentifier();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link UserHolder }
     * 
     */
    public UserHolder createUserHolder() {
        return new UserHolder();
    }

    /**
     * Create an instance of {@link CreateNoteAttachment }
     * 
     */
    public CreateNoteAttachment createCreateNoteAttachment() {
        return new CreateNoteAttachment();
    }

    /**
     * Create an instance of {@link NoteAttachmentContents }
     * 
     */
    public NoteAttachmentContents createNoteAttachmentContents() {
        return new NoteAttachmentContents();
    }

    /**
     * Create an instance of {@link RunReportXml }
     * 
     */
    public RunReportXml createRunReportXml() {
        return new RunReportXml();
    }

    /**
     * Create an instance of {@link ReportData }
     * 
     */
    public ReportData createReportData() {
        return new ReportData();
    }

    /**
     * Create an instance of {@link CreatePrimaryItems }
     * 
     */
    public CreatePrimaryItems createCreatePrimaryItems() {
        return new CreatePrimaryItems();
    }

    /**
     * Create an instance of {@link TransitionIdentifier }
     * 
     */
    public TransitionIdentifier createTransitionIdentifier() {
        return new TransitionIdentifier();
    }

    /**
     * Create an instance of {@link MultipleResponseItemOptions }
     * 
     */
    public MultipleResponseItemOptions createMultipleResponseItemOptions() {
        return new MultipleResponseItemOptions();
    }

    /**
     * Create an instance of {@link TransitionItemResponse }
     * 
     */
    public TransitionItemResponse createTransitionItemResponse() {
        return new TransitionItemResponse();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link CreatePrimaryItem }
     * 
     */
    public CreatePrimaryItem createCreatePrimaryItem() {
        return new CreatePrimaryItem();
    }

    /**
     * Create an instance of {@link RunReportXmlResponse }
     * 
     */
    public RunReportXmlResponse createRunReportXmlResponse() {
        return new RunReportXmlResponse();
    }

    /**
     * Create an instance of {@link RunReportXmlResult }
     * 
     */
    public RunReportXmlResult createRunReportXmlResult() {
        return new RunReportXmlResult();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link CreateAuxItems }
     * 
     */
    public CreateAuxItems createCreateAuxItems() {
        return new CreateAuxItems();
    }

    /**
     * Create an instance of {@link GetTablesResponse }
     * 
     */
    public GetTablesResponse createGetTablesResponse() {
        return new GetTablesResponse();
    }

    /**
     * Create an instance of {@link TableData }
     * 
     */
    public TableData createTableData() {
        return new TableData();
    }

    /**
     * Create an instance of {@link GetAvailableTransitionsResponse }
     * 
     */
    public GetAvailableTransitionsResponse createGetAvailableTransitionsResponse() {
        return new GetAvailableTransitionsResponse();
    }

    /**
     * Create an instance of {@link Transition }
     * 
     */
    public Transition createTransition() {
        return new Transition();
    }

    /**
     * Create an instance of {@link DeleteAttachment }
     * 
     */
    public DeleteAttachment createDeleteAttachment() {
        return new DeleteAttachment();
    }

    /**
     * Create an instance of {@link CreateFileAttachment }
     * 
     */
    public CreateFileAttachment createCreateFileAttachment() {
        return new CreateFileAttachment();
    }

    /**
     * Create an instance of {@link GetSolutionsResponse }
     * 
     */
    public GetSolutionsResponse createGetSolutionsResponse() {
        return new GetSolutionsResponse();
    }

    /**
     * Create an instance of {@link SolutionData }
     * 
     */
    public SolutionData createSolutionData() {
        return new SolutionData();
    }

    /**
     * Create an instance of {@link CreatePrimaryItemResponse }
     * 
     */
    public CreatePrimaryItemResponse createCreatePrimaryItemResponse() {
        return new CreatePrimaryItemResponse();
    }

    /**
     * Create an instance of {@link GetItems }
     * 
     */
    public GetItems createGetItems() {
        return new GetItems();
    }

    /**
     * Create an instance of {@link GetFieldSelectionsResponse }
     * 
     */
    public GetFieldSelectionsResponse createGetFieldSelectionsResponse() {
        return new GetFieldSelectionsResponse();
    }

    /**
     * Create an instance of {@link FieldSelectionsHolder }
     * 
     */
    public FieldSelectionsHolder createFieldSelectionsHolder() {
        return new FieldSelectionsHolder();
    }

    /**
     * Create an instance of {@link DeleteItems }
     * 
     */
    public DeleteItems createDeleteItems() {
        return new DeleteItems();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetWorkflows }
     * 
     */
    public GetWorkflows createGetWorkflows() {
        return new GetWorkflows();
    }

    /**
     * Create an instance of {@link GetAvailableSubmitTransitionsResponse }
     * 
     */
    public GetAvailableSubmitTransitionsResponse createGetAvailableSubmitTransitionsResponse() {
        return new GetAvailableSubmitTransitionsResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link UserResponseOptions }
     * 
     */
    public UserResponseOptions createUserResponseOptions() {
        return new UserResponseOptions();
    }

    /**
     * Create an instance of {@link CreateAuxItemsResponse }
     * 
     */
    public CreateAuxItemsResponse createCreateAuxItemsResponse() {
        return new CreateAuxItemsResponse();
    }

    /**
     * Create an instance of {@link GetItemsByQuery }
     * 
     */
    public GetItemsByQuery createGetItemsByQuery() {
        return new GetItemsByQuery();
    }

    /**
     * Create an instance of {@link GetNoteLoggerInfo }
     * 
     */
    public GetNoteLoggerInfo createGetNoteLoggerInfo() {
        return new GetNoteLoggerInfo();
    }

    /**
     * Create an instance of {@link GetSolutions }
     * 
     */
    public GetSolutions createGetSolutions() {
        return new GetSolutions();
    }

    /**
     * Create an instance of {@link GetFileAttachmentResponse }
     * 
     */
    public GetFileAttachmentResponse createGetFileAttachmentResponse() {
        return new GetFileAttachmentResponse();
    }

    /**
     * Create an instance of {@link TransitionItems }
     * 
     */
    public TransitionItems createTransitionItems() {
        return new TransitionItems();
    }

    /**
     * Create an instance of {@link GetItemsByQueryResponse }
     * 
     */
    public GetItemsByQueryResponse createGetItemsByQueryResponse() {
        return new GetItemsByQueryResponse();
    }

    /**
     * Create an instance of {@link TTItemList }
     * 
     */
    public TTItemList createTTItemList() {
        return new TTItemList();
    }

    /**
     * Create an instance of {@link GetReports }
     * 
     */
    public GetReports createGetReports() {
        return new GetReports();
    }

    /**
     * Create an instance of {@link ReportsFilter }
     * 
     */
    public ReportsFilter createReportsFilter() {
        return new ReportsFilter();
    }

    /**
     * Create an instance of {@link LinkSubtaskResponse }
     * 
     */
    public LinkSubtaskResponse createLinkSubtaskResponse() {
        return new LinkSubtaskResponse();
    }

    /**
     * Create an instance of {@link CreateFileAttachmentResponse }
     * 
     */
    public CreateFileAttachmentResponse createCreateFileAttachmentResponse() {
        return new CreateFileAttachmentResponse();
    }

    /**
     * Create an instance of {@link GetNoteLoggerInfoResponse }
     * 
     */
    public GetNoteLoggerInfoResponse createGetNoteLoggerInfoResponse() {
        return new GetNoteLoggerInfoResponse();
    }

    /**
     * Create an instance of {@link NoteLoggerInfo }
     * 
     */
    public NoteLoggerInfo createNoteLoggerInfo() {
        return new NoteLoggerInfo();
    }

    /**
     * Create an instance of {@link GetFileAttachment }
     * 
     */
    public GetFileAttachment createGetFileAttachment() {
        return new GetFileAttachment();
    }

    /**
     * Create an instance of {@link GetAvailableTransitions }
     * 
     */
    public GetAvailableTransitions createGetAvailableTransitions() {
        return new GetAvailableTransitions();
    }

    /**
     * Create an instance of {@link GetItemResponse }
     * 
     */
    public GetItemResponse createGetItemResponse() {
        return new GetItemResponse();
    }

    /**
     * Create an instance of {@link TransitionItem }
     * 
     */
    public TransitionItem createTransitionItem() {
        return new TransitionItem();
    }

    /**
     * Create an instance of {@link GetStateChangeHistory }
     * 
     */
    public GetStateChangeHistory createGetStateChangeHistory() {
        return new GetStateChangeHistory();
    }

    /**
     * Create an instance of {@link ContactIdentifier }
     * 
     */
    public ContactIdentifier createContactIdentifier() {
        return new ContactIdentifier();
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link SubTasks }
     * 
     */
    public SubTasks createSubTasks() {
        return new SubTasks();
    }

    /**
     * Create an instance of {@link FieldValue }
     * 
     */
    public FieldValue createFieldValue() {
        return new FieldValue();
    }

    /**
     * Create an instance of {@link WorkflowComment }
     * 
     */
    public WorkflowComment createWorkflowComment() {
        return new WorkflowComment();
    }

    /**
     * Create an instance of {@link StateChangeHistory }
     * 
     */
    public StateChangeHistory createStateChangeHistory() {
        return new StateChangeHistory();
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link ApplicationIdentifier }
     * 
     */
    public ApplicationIdentifier createApplicationIdentifier() {
        return new ApplicationIdentifier();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link FailedItemResponse }
     * 
     */
    public FailedItemResponse createFailedItemResponse() {
        return new FailedItemResponse();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link FieldWithValue }
     * 
     */
    public FieldWithValue createFieldWithValue() {
        return new FieldWithValue();
    }

    /**
     * Create an instance of {@link FailedItem }
     * 
     */
    public FailedItem createFailedItem() {
        return new FailedItem();
    }

    /**
     * Create an instance of {@link GroupIdentifier }
     * 
     */
    public GroupIdentifier createGroupIdentifier() {
        return new GroupIdentifier();
    }

    /**
     * Create an instance of {@link WorkflowBand }
     * 
     */
    public WorkflowBand createWorkflowBand() {
        return new WorkflowBand();
    }

    /**
     * Create an instance of {@link GroupHolder }
     * 
     */
    public GroupHolder createGroupHolder() {
        return new GroupHolder();
    }

    /**
     * Create an instance of {@link PrivilegeIdentifier }
     * 
     */
    public PrivilegeIdentifier createPrivilegeIdentifier() {
        return new PrivilegeIdentifier();
    }

    /**
     * Create an instance of {@link WorkflowTransition }
     * 
     */
    public WorkflowTransition createWorkflowTransition() {
        return new WorkflowTransition();
    }

    /**
     * Create an instance of {@link SelectionOption }
     * 
     */
    public SelectionOption createSelectionOption() {
        return new SelectionOption();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link RoleInfo }
     * 
     */
    public RoleInfo createRoleInfo() {
        return new RoleInfo();
    }

    /**
     * Create an instance of {@link UserSolutionData }
     * 
     */
    public UserSolutionData createUserSolutionData() {
        return new UserSolutionData();
    }

    /**
     * Create an instance of {@link ExtendedData }
     * 
     */
    public ExtendedData createExtendedData() {
        return new ExtendedData();
    }

    /**
     * Create an instance of {@link GroupInfo }
     * 
     */
    public GroupInfo createGroupInfo() {
        return new GroupInfo();
    }

    /**
     * Create an instance of {@link StateIdentifier }
     * 
     */
    public StateIdentifier createStateIdentifier() {
        return new StateIdentifier();
    }

    /**
     * Create an instance of {@link ReportResult }
     * 
     */
    public ReportResult createReportResult() {
        return new ReportResult();
    }

    /**
     * Create an instance of {@link PauseItemsResponse }
     * 
     */
    public PauseItemsResponse createPauseItemsResponse() {
        return new PauseItemsResponse();
    }

    /**
     * Create an instance of {@link FileContents }
     * 
     */
    public FileContents createFileContents() {
        return new FileContents();
    }

    /**
     * Create an instance of {@link ExtraValue }
     * 
     */
    public ExtraValue createExtraValue() {
        return new ExtraValue();
    }

    /**
     * Create an instance of {@link RoleIdentifier }
     * 
     */
    public RoleIdentifier createRoleIdentifier() {
        return new RoleIdentifier();
    }

    /**
     * Create an instance of {@link URLAttachment }
     * 
     */
    public URLAttachment createURLAttachment() {
        return new URLAttachment();
    }

    /**
     * Create an instance of {@link ReportInfo }
     * 
     */
    public ReportInfo createReportInfo() {
        return new ReportInfo();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link PrivilegeHolder }
     * 
     */
    public PrivilegeHolder createPrivilegeHolder() {
        return new PrivilegeHolder();
    }

    /**
     * Create an instance of {@link ItemLink }
     * 
     */
    public ItemLink createItemLink() {
        return new ItemLink();
    }

    /**
     * Create an instance of {@link PrivilegeInfo }
     * 
     */
    public PrivilegeInfo createPrivilegeInfo() {
        return new PrivilegeInfo();
    }

    /**
     * Create an instance of {@link UserSingleResponseOptions }
     * 
     */
    public UserSingleResponseOptions createUserSingleResponseOptions() {
        return new UserSingleResponseOptions();
    }

    /**
     * Create an instance of {@link RoleHolder }
     * 
     */
    public RoleHolder createRoleHolder() {
        return new RoleHolder();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link WorkflowIdentifier }
     * 
     */
    public WorkflowIdentifier createWorkflowIdentifier() {
        return new WorkflowIdentifier();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link FileBufferBase64 }
     * 
     */
    public FileBufferBase64 createFileBufferBase64() {
        return new FileBufferBase64();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link WorkflowState }
     * 
     */
    public WorkflowState createWorkflowState() {
        return new WorkflowState();
    }

    /**
     * Create an instance of {@link ReportDefinition }
     * 
     */
    public ReportDefinition createReportDefinition() {
        return new ReportDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerenaDiagnostics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:SerenaDiagnostics", name = "SerenaDiagnostics")
    public JAXBElement<SerenaDiagnostics> createSerenaDiagnostics(SerenaDiagnostics value) {
        return new JAXBElement<SerenaDiagnostics>(_SerenaDiagnostics_QNAME, SerenaDiagnostics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "AEWebservicesFault")
    public JAXBElement<String> createAEWebservicesFault(String value) {
        return new JAXBElement<String>(_AEWebservicesFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:SerenaDiagnostics", name = "XId")
    public JAXBElement<String> createXId(String value) {
        return new JAXBElement<String>(_XId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "createdBy", scope = TTItem.class)
    public JAXBElement<UserIdentifier> createTTItemCreatedBy(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_TTItemCreatedBy_QNAME, UserIdentifier.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "modifiedDate", scope = TTItem.class)
    public JAXBElement<XMLGregorianCalendar> createTTItemModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TTItemModifiedDate_QNAME, XMLGregorianCalendar.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = TTItem.class)
    public JAXBElement<ItemIdentifier> createTTItemId(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_TTItemId_QNAME, ItemIdentifier.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "state", scope = TTItem.class)
    public JAXBElement<StateIdentifier> createTTItemState(StateIdentifier value) {
        return new JAXBElement<StateIdentifier>(_TTItemState_QNAME, StateIdentifier.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "modifiedBy", scope = TTItem.class)
    public JAXBElement<UserIdentifier> createTTItemModifiedBy(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_TTItemModifiedBy_QNAME, UserIdentifier.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "activeInactive", scope = TTItem.class)
    public JAXBElement<String> createTTItemActiveInactive(String value) {
        return new JAXBElement<String>(_TTItemActiveInactive_QNAME, String.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "createDate", scope = TTItem.class)
    public JAXBElement<XMLGregorianCalendar> createTTItemCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TTItemCreateDate_QNAME, XMLGregorianCalendar.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = TTItem.class)
    public JAXBElement<ExtendedData> createTTItemExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "owner", scope = TTItem.class)
    public JAXBElement<UserIdentifier> createTTItemOwner(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_TTItemOwner_QNAME, UserIdentifier.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "itemType", scope = TTItem.class)
    public JAXBElement<String> createTTItemItemType(String value) {
        return new JAXBElement<String>(_TTItemItemType_QNAME, String.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "subtasks", scope = TTItem.class)
    public JAXBElement<SubTasks> createTTItemSubtasks(SubTasks value) {
        return new JAXBElement<SubTasks>(_TTItemSubtasks_QNAME, SubTasks.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = TTItem.class)
    public JAXBElement<ProjectIdentifier> createTTItemProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "description", scope = TTItem.class)
    public JAXBElement<String> createTTItemDescription(String value) {
        return new JAXBElement<String>(_TTItemDescription_QNAME, String.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "title", scope = TTItem.class)
    public JAXBElement<String> createTTItemTitle(String value) {
        return new JAXBElement<String>(_TTItemTitle_QNAME, String.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "url", scope = TTItem.class)
    public JAXBElement<String> createTTItemUrl(String value) {
        return new JAXBElement<String>(_TTItemUrl_QNAME, String.class, TTItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetItem.class)
    public JAXBElement<Auth> createGetItemAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetItem.class)
    public JAXBElement<ResponseItemOptions> createGetItemOptions(ResponseItemOptions value) {
        return new JAXBElement<ResponseItemOptions>(_GetItemOptions_QNAME, ResponseItemOptions.class, GetItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "name", scope = ExtraValue.class)
    public JAXBElement<String> createExtraValueName(String value) {
        return new JAXBElement<String>(_ExtraValueName_QNAME, String.class, ExtraValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "value", scope = ExtraValue.class)
    public JAXBElement<String> createExtraValueValue(String value) {
        return new JAXBElement<String>(_ExtraValueValue_QNAME, String.class, ExtraValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "note", scope = Note.class)
    public JAXBElement<String> createNoteNote(String value) {
        return new JAXBElement<String>(_NoteNote_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "author", scope = Note.class)
    public JAXBElement<UserIdentifier> createNoteAuthor(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_NoteAuthor_QNAME, UserIdentifier.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "title", scope = Note.class)
    public JAXBElement<String> createNoteTitle(String value) {
        return new JAXBElement<String>(_TTItemTitle_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Note.class)
    public JAXBElement<ExtendedData> createNoteExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = TransitionItems.class)
    public JAXBElement<Auth> createTransitionItemsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, TransitionItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = TransitionItems.class)
    public JAXBElement<MultipleResponseItemOptions> createTransitionItemsOptions(MultipleResponseItemOptions value) {
        return new JAXBElement<MultipleResponseItemOptions>(_GetItemOptions_QNAME, MultipleResponseItemOptions.class, TransitionItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "transition", scope = TransitionItems.class)
    public JAXBElement<TransitionIdentifier> createTransitionItemsTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_TransitionItemsTransition_QNAME, TransitionIdentifier.class, TransitionItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "emailCC", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoEmailCC(String value) {
        return new JAXBElement<String>(_UserInfoEmailCC_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "phoneNumber", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoPhoneNumber(String value) {
        return new JAXBElement<String>(_UserInfoPhoneNumber_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "contact", scope = UserInfo.class)
    public JAXBElement<ContactIdentifier> createUserInfoContact(ContactIdentifier value) {
        return new JAXBElement<ContactIdentifier>(_UserInfoContact_QNAME, ContactIdentifier.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "timezone", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoTimezone(String value) {
        return new JAXBElement<String>(_UserInfoTimezone_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = UserInfo.class)
    public JAXBElement<UserIdentifier> createUserInfoId(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_TTItemId_QNAME, UserIdentifier.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "locale", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoLocale(String value) {
        return new JAXBElement<String>(_UserInfoLocale_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "preferredSolution", scope = UserInfo.class)
    public JAXBElement<SolutionIdentifier> createUserInfoPreferredSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_UserInfoPreferredSolution_QNAME, SolutionIdentifier.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = UserInfo.class)
    public JAXBElement<ExtendedData> createUserInfoExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "email", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoEmail(String value) {
        return new JAXBElement<String>(_UserInfoEmail_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "namespaceName", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoNamespaceName(String value) {
        return new JAXBElement<String>(_UserInfoNamespaceName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = RunReport.class)
    public JAXBElement<Auth> createRunReportAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = RunReport.class)
    public JAXBElement<SolutionIdentifier> createRunReportSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = RunReport.class)
    public JAXBElement<ProjectIdentifier> createRunReportProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "report", scope = RunReport.class)
    public JAXBElement<ReportIdentifier> createRunReportReport(ReportIdentifier value) {
        return new JAXBElement<ReportIdentifier>(_RunReportReport_QNAME, ReportIdentifier.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = RunReport.class)
    public JAXBElement<Options> createRunReportOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "queryRange", scope = RunReport.class)
    public JAXBElement<QueryRange> createRunReportQueryRange(QueryRange value) {
        return new JAXBElement<QueryRange>(_RunReportQueryRange_QNAME, QueryRange.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = RunReport.class)
    public JAXBElement<TableIdentifier> createRunReportTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, RunReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = ReportResult.class)
    public JAXBElement<ItemIdentifier> createReportResultItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, ReportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ReportResult.class)
    public JAXBElement<ExtendedData> createReportResultExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ReportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "itemURL", scope = ReportResult.class)
    public JAXBElement<String> createReportResultItemURL(String value) {
        return new JAXBElement<String>(_ReportResultItemURL_QNAME, String.class, ReportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = GetFileAttachment.class)
    public JAXBElement<ItemIdentifier> createGetFileAttachmentItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, GetFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetFileAttachment.class)
    public JAXBElement<Auth> createGetFileAttachmentAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetFileAttachment.class)
    public JAXBElement<Options> createGetFileAttachmentOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Size.class)
    public JAXBElement<ExtendedData> createSizeExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Size.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "projectId", scope = PrivilegeInfo.class)
    public JAXBElement<ProjectIdentifier> createPrivilegeInfoProjectId(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_PrivilegeInfoProjectId_QNAME, ProjectIdentifier.class, PrivilegeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = PrivilegeInfo.class)
    public JAXBElement<ExtendedData> createPrivilegeInfoExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, PrivilegeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "objectId", scope = PrivilegeInfo.class)
    public JAXBElement<Identifier> createPrivilegeInfoObjectId(Identifier value) {
        return new JAXBElement<Identifier>(_PrivilegeInfoObjectId_QNAME, Identifier.class, PrivilegeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "secondFieldName", scope = OrderBy.class)
    public JAXBElement<String> createOrderBySecondFieldName(String value) {
        return new JAXBElement<String>(_OrderBySecondFieldName_QNAME, String.class, OrderBy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "firstFieldName", scope = OrderBy.class)
    public JAXBElement<String> createOrderByFirstFieldName(String value) {
        return new JAXBElement<String>(_OrderByFirstFieldName_QNAME, String.class, OrderBy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileBufferBase64 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "contentsBase64", scope = FileContents.class)
    public JAXBElement<FileBufferBase64> createFileContentsContentsBase64(FileBufferBase64 value) {
        return new JAXBElement<FileBufferBase64>(_FileContentsContentsBase64_QNAME, FileBufferBase64 .class, FileContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetUsers.class)
    public JAXBElement<Auth> createGetUsersAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "searchByName", scope = GetUsers.class)
    public JAXBElement<String> createGetUsersSearchByName(String value) {
        return new JAXBElement<String>(_GetUsersSearchByName_QNAME, String.class, GetUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetUsers.class)
    public JAXBElement<UserResponseOptions> createGetUsersOptions(UserResponseOptions value) {
        return new JAXBElement<UserResponseOptions>(_GetItemOptions_QNAME, UserResponseOptions.class, GetUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "result", scope = RunReportXmlResult.class)
    public JAXBElement<String> createRunReportXmlResultResult(String value) {
        return new JAXBElement<String>(_RunReportXmlResultResult_QNAME, String.class, RunReportXmlResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = RunReportXmlResult.class)
    public JAXBElement<ExtendedData> createRunReportXmlResultExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, RunReportXmlResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = UpdateFileAttachment.class)
    public JAXBElement<ItemIdentifier> createUpdateFileAttachmentItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, UpdateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = UpdateFileAttachment.class)
    public JAXBElement<Auth> createUpdateFileAttachmentAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, UpdateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = UpdateFileAttachment.class)
    public JAXBElement<Options> createUpdateFileAttachmentOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, UpdateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "attachmentContents", scope = UpdateFileAttachment.class)
    public JAXBElement<FileAttachmentContents> createUpdateFileAttachmentAttachmentContents(FileAttachmentContents value) {
        return new JAXBElement<FileAttachmentContents>(_UpdateFileAttachmentAttachmentContents_QNAME, FileAttachmentContents.class, UpdateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "owner", scope = StateChangeHistory.class)
    public JAXBElement<UserIdentifier> createStateChangeHistoryOwner(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_TTItemOwner_QNAME, UserIdentifier.class, StateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "user", scope = StateChangeHistory.class)
    public JAXBElement<UserIdentifier> createStateChangeHistoryUser(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_StateChangeHistoryUser_QNAME, UserIdentifier.class, StateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = StateChangeHistory.class)
    public JAXBElement<ExtendedData> createStateChangeHistoryExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, StateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "newState", scope = StateChangeHistory.class)
    public JAXBElement<StateIdentifier> createStateChangeHistoryNewState(StateIdentifier value) {
        return new JAXBElement<StateIdentifier>(_StateChangeHistoryNewState_QNAME, StateIdentifier.class, StateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "transition", scope = StateChangeHistory.class)
    public JAXBElement<TransitionIdentifier> createStateChangeHistoryTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_TransitionItemsTransition_QNAME, TransitionIdentifier.class, StateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Point.class)
    public JAXBElement<ExtendedData> createPointExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Point.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "dbName", scope = FieldIdentifier.class)
    public JAXBElement<String> createFieldIdentifierDbName(String value) {
        return new JAXBElement<String>(_FieldIdentifierDbName_QNAME, String.class, FieldIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "specifiedSections", scope = ResponseItemOptions.class)
    public JAXBElement<String> createResponseItemOptionsSpecifiedSections(String value) {
        return new JAXBElement<String>(_ResponseItemOptionsSpecifiedSections_QNAME, String.class, ResponseItemOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetValueMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "setValueMethod", scope = NameValue.class)
    public JAXBElement<SetValueMethod> createNameValueSetValueMethod(SetValueMethod value) {
        return new JAXBElement<SetValueMethod>(_NameValueSetValueMethod_QNAME, SetValueMethod.class, NameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = NameValue.class)
    public JAXBElement<FieldIdentifier> createNameValueId(FieldIdentifier value) {
        return new JAXBElement<FieldIdentifier>(_TTItemId_QNAME, FieldIdentifier.class, NameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetValueBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "setValueBy", scope = NameValue.class)
    public JAXBElement<SetValueBy> createNameValueSetValueBy(SetValueBy value) {
        return new JAXBElement<SetValueBy>(_NameValueSetValueBy_QNAME, SetValueBy.class, NameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = CreatePrimaryItem.class)
    public JAXBElement<Auth> createCreatePrimaryItemAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, CreatePrimaryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "submitTransition", scope = CreatePrimaryItem.class)
    public JAXBElement<TransitionIdentifier> createCreatePrimaryItemSubmitTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_CreatePrimaryItemSubmitTransition_QNAME, TransitionIdentifier.class, CreatePrimaryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = CreatePrimaryItem.class)
    public JAXBElement<ProjectIdentifier> createCreatePrimaryItemProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, CreatePrimaryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "parentItem", scope = CreatePrimaryItem.class)
    public JAXBElement<ItemIdentifier> createCreatePrimaryItemParentItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_CreatePrimaryItemParentItem_QNAME, ItemIdentifier.class, CreatePrimaryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = CreatePrimaryItem.class)
    public JAXBElement<ResponseItemOptions> createCreatePrimaryItemOptions(ResponseItemOptions value) {
        return new JAXBElement<ResponseItemOptions>(_GetItemOptions_QNAME, ResponseItemOptions.class, CreatePrimaryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = UserSolutionData.class)
    public JAXBElement<SolutionIdentifier> createUserSolutionDataSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, UserSolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "homeReport", scope = UserSolutionData.class)
    public JAXBElement<ReportIdentifier> createUserSolutionDataHomeReport(ReportIdentifier value) {
        return new JAXBElement<ReportIdentifier>(_UserSolutionDataHomeReport_QNAME, ReportIdentifier.class, UserSolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = UserSolutionData.class)
    public JAXBElement<ExtendedData> createUserSolutionDataExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, UserSolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunReportXmlResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = RunReportXmlResponse.class)
    public JAXBElement<RunReportXmlResult> createRunReportXmlResponseReturn(RunReportXmlResult value) {
        return new JAXBElement<RunReportXmlResult>(_RunReportXmlResponseReturn_QNAME, RunReportXmlResult.class, RunReportXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetSolutions.class)
    public JAXBElement<Auth> createGetSolutionsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetSolutions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetSolutions.class)
    public JAXBElement<Options> createGetSolutionsOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetSolutions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = SelectionOption.class)
    public JAXBElement<Identifier> createSelectionOptionId(Identifier value) {
        return new JAXBElement<Identifier>(_TTItemId_QNAME, Identifier.class, SelectionOption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = SelectionOption.class)
    public JAXBElement<ExtendedData> createSelectionOptionExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, SelectionOption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = SolutionData.class)
    public JAXBElement<SolutionIdentifier> createSolutionDataSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, SolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "prefix", scope = SolutionData.class)
    public JAXBElement<String> createSolutionDataPrefix(String value) {
        return new JAXBElement<String>(_SolutionDataPrefix_QNAME, String.class, SolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "description", scope = SolutionData.class)
    public JAXBElement<String> createSolutionDataDescription(String value) {
        return new JAXBElement<String>(_TTItemDescription_QNAME, String.class, SolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = SolutionData.class)
    public JAXBElement<ExtendedData> createSolutionDataExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, SolutionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "user", scope = UserHolder.class)
    public JAXBElement<UserInfo> createUserHolderUser(UserInfo value) {
        return new JAXBElement<UserInfo>(_StateChangeHistoryUser_QNAME, UserInfo.class, UserHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = UserHolder.class)
    public JAXBElement<ExtendedData> createUserHolderExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, UserHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = Logout.class)
    public JAXBElement<Auth> createLogoutAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, Logout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = Logout.class)
    public JAXBElement<Options> createLogoutOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, Logout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = CreatePrimaryItems.class)
    public JAXBElement<Auth> createCreatePrimaryItemsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, CreatePrimaryItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "submitTransition", scope = CreatePrimaryItems.class)
    public JAXBElement<TransitionIdentifier> createCreatePrimaryItemsSubmitTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_CreatePrimaryItemSubmitTransition_QNAME, TransitionIdentifier.class, CreatePrimaryItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = CreatePrimaryItems.class)
    public JAXBElement<ProjectIdentifier> createCreatePrimaryItemsProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, CreatePrimaryItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "parentItem", scope = CreatePrimaryItems.class)
    public JAXBElement<ItemIdentifier> createCreatePrimaryItemsParentItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_CreatePrimaryItemParentItem_QNAME, ItemIdentifier.class, CreatePrimaryItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = CreatePrimaryItems.class)
    public JAXBElement<MultipleResponseItemOptions> createCreatePrimaryItemsOptions(MultipleResponseItemOptions value) {
        return new JAXBElement<MultipleResponseItemOptions>(_GetItemOptions_QNAME, MultipleResponseItemOptions.class, CreatePrimaryItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "orderBy", scope = ReportDefinition.class)
    public JAXBElement<OrderBy> createReportDefinitionOrderBy(OrderBy value) {
        return new JAXBElement<OrderBy>(_ReportDefinitionOrderBy_QNAME, OrderBy.class, ReportDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ReportDefinition.class)
    public JAXBElement<ExtendedData> createReportDefinitionExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ReportDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Point }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "labelPosition", scope = WorkflowTransition.class)
    public JAXBElement<Point> createWorkflowTransitionLabelPosition(Point value) {
        return new JAXBElement<Point>(_WorkflowTransitionLabelPosition_QNAME, Point.class, WorkflowTransition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = WorkflowTransition.class)
    public JAXBElement<TransitionIdentifier> createWorkflowTransitionId(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_TTItemId_QNAME, TransitionIdentifier.class, WorkflowTransition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "styleClass", scope = WorkflowTransition.class)
    public JAXBElement<String> createWorkflowTransitionStyleClass(String value) {
        return new JAXBElement<String>(_WorkflowTransitionStyleClass_QNAME, String.class, WorkflowTransition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = WorkflowTransition.class)
    public JAXBElement<ExtendedData> createWorkflowTransitionExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, WorkflowTransition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = CreateFileAttachment.class)
    public JAXBElement<ItemIdentifier> createCreateFileAttachmentItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, CreateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = CreateFileAttachment.class)
    public JAXBElement<Auth> createCreateFileAttachmentAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, CreateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = CreateFileAttachment.class)
    public JAXBElement<Options> createCreateFileAttachmentOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, CreateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "attachmentContents", scope = CreateFileAttachment.class)
    public JAXBElement<FileAttachmentContents> createCreateFileAttachmentAttachmentContents(FileAttachmentContents value) {
        return new JAXBElement<FileAttachmentContents>(_UpdateFileAttachmentAttachmentContents_QNAME, FileAttachmentContents.class, CreateFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "specifiedSections", scope = UserSingleResponseOptions.class)
    public JAXBElement<String> createUserSingleResponseOptionsSpecifiedSections(String value) {
        return new JAXBElement<String>(_ResponseItemOptionsSpecifiedSections_QNAME, String.class, UserSingleResponseOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "internalName", scope = ProjectIdentifier.class)
    public JAXBElement<String> createProjectIdentifierInternalName(String value) {
        return new JAXBElement<String>(_ProjectIdentifierInternalName_QNAME, String.class, ProjectIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "fullyQualifiedName", scope = ProjectIdentifier.class)
    public JAXBElement<String> createProjectIdentifierFullyQualifiedName(String value) {
        return new JAXBElement<String>(_ProjectIdentifierFullyQualifiedName_QNAME, String.class, ProjectIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "group", scope = GroupHolder.class)
    public JAXBElement<GroupInfo> createGroupHolderGroup(GroupInfo value) {
        return new JAXBElement<GroupInfo>(_GroupHolderGroup_QNAME, GroupInfo.class, GroupHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = GroupHolder.class)
    public JAXBElement<ExtendedData> createGroupHolderExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, GroupHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = GetVersionResponse.class)
    public JAXBElement<String> createGetVersionResponseReturn(String value) {
        return new JAXBElement<String>(_RunReportXmlResponseReturn_QNAME, String.class, GetVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetSubmitProjects.class)
    public JAXBElement<Auth> createGetSubmitProjectsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetSubmitProjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetSubmitProjects.class)
    public JAXBElement<Options> createGetSubmitProjectsOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetSubmitProjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = GetSubmitProjects.class)
    public JAXBElement<TableIdentifier> createGetSubmitProjectsTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, GetSubmitProjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "field", scope = Field.class)
    public JAXBElement<FieldIdentifier> createFieldField(FieldIdentifier value) {
        return new JAXBElement<FieldIdentifier>(_FieldField_QNAME, FieldIdentifier.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Field.class)
    public JAXBElement<ExtendedData> createFieldExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = CreateAuxItems.class)
    public JAXBElement<Auth> createCreateAuxItemsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, CreateAuxItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = CreateAuxItems.class)
    public JAXBElement<MultipleResponseItemOptions> createCreateAuxItemsOptions(MultipleResponseItemOptions value) {
        return new JAXBElement<MultipleResponseItemOptions>(_GetItemOptions_QNAME, MultipleResponseItemOptions.class, CreateAuxItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = CreateAuxItems.class)
    public JAXBElement<TableIdentifier> createCreateAuxItemsTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, CreateAuxItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = ProjectData.class)
    public JAXBElement<ProjectIdentifier> createProjectDataProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, ProjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "description", scope = ProjectData.class)
    public JAXBElement<String> createProjectDataDescription(String value) {
        return new JAXBElement<String>(_TTItemDescription_QNAME, String.class, ProjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ProjectData.class)
    public JAXBElement<ExtendedData> createProjectDataExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ProjectData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "searchByName", scope = ReportsFilter.class)
    public JAXBElement<String> createReportsFilterSearchByName(String value) {
        return new JAXBElement<String>(_GetUsersSearchByName_QNAME, String.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = ReportsFilter.class)
    public JAXBElement<SolutionIdentifier> createReportsFilterSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "author", scope = ReportsFilter.class)
    public JAXBElement<UserIdentifier> createReportsFilterAuthor(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_NoteAuthor_QNAME, UserIdentifier.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = ReportsFilter.class)
    public JAXBElement<ProjectIdentifier> createReportsFilterProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "report", scope = ReportsFilter.class)
    public JAXBElement<ReportIdentifier> createReportsFilterReport(ReportIdentifier value) {
        return new JAXBElement<ReportIdentifier>(_RunReportReport_QNAME, ReportIdentifier.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ReportsFilter.class)
    public JAXBElement<ExtendedData> createReportsFilterExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = ReportsFilter.class)
    public JAXBElement<TableIdentifier> createReportsFilterTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, ReportsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "internalName", scope = TransitionIdentifier.class)
    public JAXBElement<String> createTransitionIdentifierInternalName(String value) {
        return new JAXBElement<String>(_ProjectIdentifierInternalName_QNAME, String.class, TransitionIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = GetStateChangeHistoryResult.class)
    public JAXBElement<ExtendedData> createGetStateChangeHistoryResultExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, GetStateChangeHistoryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "internalName", scope = FieldValue.class)
    public JAXBElement<String> createFieldValueInternalName(String value) {
        return new JAXBElement<String>(_ProjectIdentifierInternalName_QNAME, String.class, FieldValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "displayValue", scope = FieldValue.class)
    public JAXBElement<String> createFieldValueDisplayValue(String value) {
        return new JAXBElement<String>(_FieldValueDisplayValue_QNAME, String.class, FieldValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "internalValue", scope = FieldValue.class)
    public JAXBElement<String> createFieldValueInternalValue(String value) {
        return new JAXBElement<String>(_FieldValueInternalValue_QNAME, String.class, FieldValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "uuid", scope = FieldValue.class)
    public JAXBElement<String> createFieldValueUuid(String value) {
        return new JAXBElement<String>(_FieldValueUuid_QNAME, String.class, FieldValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "dbName", scope = TableIdentifier.class)
    public JAXBElement<String> createTableIdentifierDbName(String value) {
        return new JAXBElement<String>(_FieldIdentifierDbName_QNAME, String.class, TableIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = ReportInfo.class)
    public JAXBElement<SolutionIdentifier> createReportInfoSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, ReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = ReportInfo.class)
    public JAXBElement<ProjectIdentifier> createReportInfoProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, ReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "report", scope = ReportInfo.class)
    public JAXBElement<ReportIdentifier> createReportInfoReport(ReportIdentifier value) {
        return new JAXBElement<ReportIdentifier>(_RunReportReport_QNAME, ReportIdentifier.class, ReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "modifiedBy", scope = ReportInfo.class)
    public JAXBElement<UserIdentifier> createReportInfoModifiedBy(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_TTItemModifiedBy_QNAME, UserIdentifier.class, ReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ReportInfo.class)
    public JAXBElement<ExtendedData> createReportInfoExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = ReportInfo.class)
    public JAXBElement<TableIdentifier> createReportInfoTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, ReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = GetStateChangeHistory.class)
    public JAXBElement<ItemIdentifier> createGetStateChangeHistoryItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, GetStateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetStateChangeHistory.class)
    public JAXBElement<Auth> createGetStateChangeHistoryAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetStateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetStateChangeHistory.class)
    public JAXBElement<Options> createGetStateChangeHistoryOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetStateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "queryRange", scope = GetStateChangeHistory.class)
    public JAXBElement<QueryRange> createGetStateChangeHistoryQueryRange(QueryRange value) {
        return new JAXBElement<QueryRange>(_RunReportQueryRange_QNAME, QueryRange.class, GetStateChangeHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "itemId", scope = FailedItem.class)
    public JAXBElement<ItemIdentifier> createFailedItemItemId(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_FailedItemItemId_QNAME, ItemIdentifier.class, FailedItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "status", scope = FailedItem.class)
    public JAXBElement<Status> createFailedItemStatus(Status value) {
        return new JAXBElement<Status>(_FailedItemStatus_QNAME, Status.class, FailedItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = CreateAuxItem.class)
    public JAXBElement<Auth> createCreateAuxItemAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, CreateAuxItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = CreateAuxItem.class)
    public JAXBElement<ResponseItemOptions> createCreateAuxItemOptions(ResponseItemOptions value) {
        return new JAXBElement<ResponseItemOptions>(_GetItemOptions_QNAME, ResponseItemOptions.class, CreateAuxItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = CreateAuxItem.class)
    public JAXBElement<TableIdentifier> createCreateAuxItemTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, CreateAuxItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "issueId", scope = ItemIdentifier.class)
    public JAXBElement<String> createItemIdentifierIssueId(String value) {
        return new JAXBElement<String>(_ItemIdentifierIssueId_QNAME, String.class, ItemIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "tableIdItemId", scope = ItemIdentifier.class)
    public JAXBElement<String> createItemIdentifierTableIdItemId(String value) {
        return new JAXBElement<String>(_ItemIdentifierTableIdItemId_QNAME, String.class, ItemIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = Workflow.class)
    public JAXBElement<WorkflowIdentifier> createWorkflowId(WorkflowIdentifier value) {
        return new JAXBElement<WorkflowIdentifier>(_TTItemId_QNAME, WorkflowIdentifier.class, Workflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Workflow.class)
    public JAXBElement<ExtendedData> createWorkflowExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Workflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateChangeHistoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = GetStateChangeHistoryResponse.class)
    public JAXBElement<GetStateChangeHistoryResult> createGetStateChangeHistoryResponseReturn(GetStateChangeHistoryResult value) {
        return new JAXBElement<GetStateChangeHistoryResult>(_RunReportXmlResponseReturn_QNAME, GetStateChangeHistoryResult.class, GetStateChangeHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "description", scope = WorkflowBand.class)
    public JAXBElement<String> createWorkflowBandDescription(String value) {
        return new JAXBElement<String>(_TTItemDescription_QNAME, String.class, WorkflowBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = WorkflowBand.class)
    public JAXBElement<Identifier> createWorkflowBandId(Identifier value) {
        return new JAXBElement<Identifier>(_TTItemId_QNAME, Identifier.class, WorkflowBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "styleOverride", scope = WorkflowBand.class)
    public JAXBElement<String> createWorkflowBandStyleOverride(String value) {
        return new JAXBElement<String>(_WorkflowBandStyleOverride_QNAME, String.class, WorkflowBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "styleClass", scope = WorkflowBand.class)
    public JAXBElement<String> createWorkflowBandStyleClass(String value) {
        return new JAXBElement<String>(_WorkflowTransitionStyleClass_QNAME, String.class, WorkflowBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = WorkflowBand.class)
    public JAXBElement<ExtendedData> createWorkflowBandExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, WorkflowBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "parentItemId", scope = SubTasks.class)
    public JAXBElement<ItemIdentifier> createSubTasksParentItemId(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_SubTasksParentItemId_QNAME, ItemIdentifier.class, SubTasks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = SubTasks.class)
    public JAXBElement<ExtendedData> createSubTasksExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, SubTasks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetAvailableSubmitTransitions.class)
    public JAXBElement<Auth> createGetAvailableSubmitTransitionsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetAvailableSubmitTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = GetAvailableSubmitTransitions.class)
    public JAXBElement<ProjectIdentifier> createGetAvailableSubmitTransitionsProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, GetAvailableSubmitTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetAvailableSubmitTransitions.class)
    public JAXBElement<Options> createGetAvailableSubmitTransitionsOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetAvailableSubmitTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "attributeName", scope = GetAvailableSubmitTransitions.class)
    public JAXBElement<String> createGetAvailableSubmitTransitionsAttributeName(String value) {
        return new JAXBElement<String>(_GetAvailableSubmitTransitionsAttributeName_QNAME, String.class, GetAvailableSubmitTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = UpdateFileAttachmentResponse.class)
    public JAXBElement<FileAttachment> createUpdateFileAttachmentResponseReturn(FileAttachment value) {
        return new JAXBElement<FileAttachment>(_RunReportXmlResponseReturn_QNAME, FileAttachment.class, UpdateFileAttachmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "fileName", scope = FileAttachment.class)
    public JAXBElement<String> createFileAttachmentFileName(String value) {
        return new JAXBElement<String>(_FileAttachmentFileName_QNAME, String.class, FileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "name", scope = FileAttachment.class)
    public JAXBElement<String> createFileAttachmentName(String value) {
        return new JAXBElement<String>(_ExtraValueName_QNAME, String.class, FileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = FileAttachment.class)
    public JAXBElement<ExtendedData> createFileAttachmentExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, FileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "url", scope = FileAttachment.class)
    public JAXBElement<String> createFileAttachmentUrl(String value) {
        return new JAXBElement<String>(_TTItemUrl_QNAME, String.class, FileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTItemHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = CreatePrimaryItemResponse.class)
    public JAXBElement<TTItemHolder> createCreatePrimaryItemResponseReturn(TTItemHolder value) {
        return new JAXBElement<TTItemHolder>(_RunReportXmlResponseReturn_QNAME, TTItemHolder.class, CreatePrimaryItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = RunReportResult.class)
    public JAXBElement<ExtendedData> createRunReportResultExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, RunReportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = DeleteItems.class)
    public JAXBElement<Auth> createDeleteItemsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, DeleteItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = DeleteItems.class)
    public JAXBElement<MultipleOptions> createDeleteItemsOptions(MultipleOptions value) {
        return new JAXBElement<MultipleOptions>(_GetItemOptions_QNAME, MultipleOptions.class, DeleteItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "type", scope = PrivilegeIdentifier.class)
    public JAXBElement<String> createPrivilegeIdentifierType(String value) {
        return new JAXBElement<String>(_PrivilegeIdentifierType_QNAME, String.class, PrivilegeIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = TableData.class)
    public JAXBElement<SolutionIdentifier> createTableDataSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, TableData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "description", scope = TableData.class)
    public JAXBElement<String> createTableDataDescription(String value) {
        return new JAXBElement<String>(_TTItemDescription_QNAME, String.class, TableData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = TableData.class)
    public JAXBElement<ExtendedData> createTableDataExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, TableData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = TableData.class)
    public JAXBElement<TableIdentifier> createTableDataTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, TableData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "name", scope = URLAttachment.class)
    public JAXBElement<String> createURLAttachmentName(String value) {
        return new JAXBElement<String>(_ExtraValueName_QNAME, String.class, URLAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = URLAttachment.class)
    public JAXBElement<ExtendedData> createURLAttachmentExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, URLAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "url", scope = URLAttachment.class)
    public JAXBElement<String> createURLAttachmentUrl(String value) {
        return new JAXBElement<String>(_TTItemUrl_QNAME, String.class, URLAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = TTItemHolder.class)
    public JAXBElement<TTItem> createTTItemHolderItem(TTItem value) {
        return new JAXBElement<TTItem>(_ReportResultItem_QNAME, TTItem.class, TTItemHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = TTItemHolder.class)
    public JAXBElement<ExtendedData> createTTItemHolderExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, TTItemHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "reportReference", scope = ReportData.class)
    public JAXBElement<String> createReportDataReportReference(String value) {
        return new JAXBElement<String>(_ReportDataReportReference_QNAME, String.class, ReportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "loginId", scope = UserIdentifier.class)
    public JAXBElement<String> createUserIdentifierLoginId(String value) {
        return new JAXBElement<String>(_UserIdentifierLoginId_QNAME, String.class, UserIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "itemID", scope = ItemLink.class)
    public JAXBElement<ItemIdentifier> createItemLinkItemID(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ItemLinkItemID_QNAME, ItemIdentifier.class, ItemLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ItemLink.class)
    public JAXBElement<ExtendedData> createItemLinkExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ItemLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "emailAddress", scope = NoteLoggerInfo.class)
    public JAXBElement<String> createNoteLoggerInfoEmailAddress(String value) {
        return new JAXBElement<String>(_NoteLoggerInfoEmailAddress_QNAME, String.class, NoteLoggerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = NoteLoggerInfo.class)
    public JAXBElement<ExtendedData> createNoteLoggerInfoExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, NoteLoggerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = RunReportXml.class)
    public JAXBElement<Auth> createRunReportXmlAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, RunReportXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "report", scope = RunReportXml.class)
    public JAXBElement<ReportData> createRunReportXmlReport(ReportData value) {
        return new JAXBElement<ReportData>(_RunReportReport_QNAME, ReportData.class, RunReportXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = RunReportXml.class)
    public JAXBElement<Options> createRunReportXmlOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, RunReportXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "appDefUUID", scope = ApplicationData.class)
    public JAXBElement<String> createApplicationDataAppDefUUID(String value) {
        return new JAXBElement<String>(_ApplicationDataAppDefUUID_QNAME, String.class, ApplicationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "application", scope = ApplicationData.class)
    public JAXBElement<ApplicationIdentifier> createApplicationDataApplication(ApplicationIdentifier value) {
        return new JAXBElement<ApplicationIdentifier>(_ApplicationDataApplication_QNAME, ApplicationIdentifier.class, ApplicationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "description", scope = ApplicationData.class)
    public JAXBElement<String> createApplicationDataDescription(String value) {
        return new JAXBElement<String>(_TTItemDescription_QNAME, String.class, ApplicationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "revision", scope = ApplicationData.class)
    public JAXBElement<String> createApplicationDataRevision(String value) {
        return new JAXBElement<String>(_ApplicationDataRevision_QNAME, String.class, ApplicationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = ApplicationData.class)
    public JAXBElement<ExtendedData> createApplicationDataExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, ApplicationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetItemsByQuery.class)
    public JAXBElement<Auth> createGetItemsByQueryAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "queryWhereClause", scope = GetItemsByQuery.class)
    public JAXBElement<String> createGetItemsByQueryQueryWhereClause(String value) {
        return new JAXBElement<String>(_GetItemsByQueryQueryWhereClause_QNAME, String.class, GetItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetItemsByQuery.class)
    public JAXBElement<MultipleResponseItemOptions> createGetItemsByQueryOptions(MultipleResponseItemOptions value) {
        return new JAXBElement<MultipleResponseItemOptions>(_GetItemOptions_QNAME, MultipleResponseItemOptions.class, GetItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "orderByClause", scope = GetItemsByQuery.class)
    public JAXBElement<String> createGetItemsByQueryOrderByClause(String value) {
        return new JAXBElement<String>(_GetItemsByQueryOrderByClause_QNAME, String.class, GetItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = GetItemsByQuery.class)
    public JAXBElement<TableIdentifier> createGetItemsByQueryTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, GetItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "memo", scope = GroupInfo.class)
    public JAXBElement<String> createGroupInfoMemo(String value) {
        return new JAXBElement<String>(_GroupInfoMemo_QNAME, String.class, GroupInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = GroupInfo.class)
    public JAXBElement<GroupIdentifier> createGroupInfoId(GroupIdentifier value) {
        return new JAXBElement<GroupIdentifier>(_TTItemId_QNAME, GroupIdentifier.class, GroupInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = GroupInfo.class)
    public JAXBElement<ExtendedData> createGroupInfoExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, GroupInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTItemHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = TransitionItemResponse.class)
    public JAXBElement<TTItemHolder> createTransitionItemResponseReturn(TTItemHolder value) {
        return new JAXBElement<TTItemHolder>(_RunReportXmlResponseReturn_QNAME, TTItemHolder.class, TransitionItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Size }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "size", scope = WorkflowState.class)
    public JAXBElement<Size> createWorkflowStateSize(Size value) {
        return new JAXBElement<Size>(_WorkflowStateSize_QNAME, Size.class, WorkflowState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Point }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "center", scope = WorkflowState.class)
    public JAXBElement<Point> createWorkflowStateCenter(Point value) {
        return new JAXBElement<Point>(_WorkflowStateCenter_QNAME, Point.class, WorkflowState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "id", scope = WorkflowState.class)
    public JAXBElement<StateIdentifier> createWorkflowStateId(StateIdentifier value) {
        return new JAXBElement<StateIdentifier>(_TTItemId_QNAME, StateIdentifier.class, WorkflowState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = WorkflowState.class)
    public JAXBElement<ExtendedData> createWorkflowStateExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, WorkflowState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetWorkflows.class)
    public JAXBElement<Auth> createGetWorkflowsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetWorkflows.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = GetFileAttachmentResponse.class)
    public JAXBElement<FileAttachmentContents> createGetFileAttachmentResponseReturn(FileAttachmentContents value) {
        return new JAXBElement<FileAttachmentContents>(_RunReportXmlResponseReturn_QNAME, FileAttachmentContents.class, GetFileAttachmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = DeleteItemsByQuery.class)
    public JAXBElement<Auth> createDeleteItemsByQueryAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, DeleteItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "queryWhereClause", scope = DeleteItemsByQuery.class)
    public JAXBElement<String> createDeleteItemsByQueryQueryWhereClause(String value) {
        return new JAXBElement<String>(_GetItemsByQueryQueryWhereClause_QNAME, String.class, DeleteItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = DeleteItemsByQuery.class)
    public JAXBElement<MultipleOptions> createDeleteItemsByQueryOptions(MultipleOptions value) {
        return new JAXBElement<MultipleOptions>(_GetItemOptions_QNAME, MultipleOptions.class, DeleteItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "table", scope = DeleteItemsByQuery.class)
    public JAXBElement<TableIdentifier> createDeleteItemsByQueryTable(TableIdentifier value) {
        return new JAXBElement<TableIdentifier>(_RunReportTable_QNAME, TableIdentifier.class, DeleteItemsByQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "displayName", scope = Identifier.class)
    public JAXBElement<String> createIdentifierDisplayName(String value) {
        return new JAXBElement<String>(_IdentifierDisplayName_QNAME, String.class, Identifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "uuid", scope = Identifier.class)
    public JAXBElement<String> createIdentifierUuid(String value) {
        return new JAXBElement<String>(_FieldValueUuid_QNAME, String.class, Identifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Workflow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "workflow", scope = WorkflowHolder.class)
    public JAXBElement<Workflow> createWorkflowHolderWorkflow(Workflow value) {
        return new JAXBElement<Workflow>(_WorkflowHolderWorkflow_QNAME, Workflow.class, WorkflowHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTItemHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = GetItemResponse.class)
    public JAXBElement<TTItemHolder> createGetItemResponseReturn(TTItemHolder value) {
        return new JAXBElement<TTItemHolder>(_RunReportXmlResponseReturn_QNAME, TTItemHolder.class, GetItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "internalName", scope = StateIdentifier.class)
    public JAXBElement<String> createStateIdentifierInternalName(String value) {
        return new JAXBElement<String>(_ProjectIdentifierInternalName_QNAME, String.class, StateIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = DeleteAttachment.class)
    public JAXBElement<Auth> createDeleteAttachmentAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, DeleteAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = DeleteAttachment.class)
    public JAXBElement<Options> createDeleteAttachmentOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, DeleteAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = TransitionItem.class)
    public JAXBElement<Auth> createTransitionItemAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, TransitionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = TransitionItem.class)
    public JAXBElement<ResponseItemOptions> createTransitionItemOptions(ResponseItemOptions value) {
        return new JAXBElement<ResponseItemOptions>(_GetItemOptions_QNAME, ResponseItemOptions.class, TransitionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "transition", scope = TransitionItem.class)
    public JAXBElement<TransitionIdentifier> createTransitionItemTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_TransitionItemsTransition_QNAME, TransitionIdentifier.class, TransitionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetItems.class)
    public JAXBElement<Auth> createGetItemsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetItems.class)
    public JAXBElement<MultipleResponseItemOptions> createGetItemsOptions(MultipleResponseItemOptions value) {
        return new JAXBElement<MultipleResponseItemOptions>(_GetItemOptions_QNAME, MultipleResponseItemOptions.class, GetItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "title", scope = NoteAttachmentContents.class)
    public JAXBElement<String> createNoteAttachmentContentsTitle(String value) {
        return new JAXBElement<String>(_TTItemTitle_QNAME, String.class, NoteAttachmentContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "body", scope = NoteAttachmentContents.class)
    public JAXBElement<String> createNoteAttachmentContentsBody(String value) {
        return new JAXBElement<String>(_NoteAttachmentContentsBody_QNAME, String.class, NoteAttachmentContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = NoteAttachmentContents.class)
    public JAXBElement<ExtendedData> createNoteAttachmentContentsExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, NoteAttachmentContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetApplications.class)
    public JAXBElement<Auth> createGetApplicationsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetApplications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetApplications.class)
    public JAXBElement<Options> createGetApplicationsOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetApplications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "ownerState", scope = WorkflowComment.class)
    public JAXBElement<StateIdentifier> createWorkflowCommentOwnerState(StateIdentifier value) {
        return new JAXBElement<StateIdentifier>(_WorkflowCommentOwnerState_QNAME, StateIdentifier.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Size }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "size", scope = WorkflowComment.class)
    public JAXBElement<Size> createWorkflowCommentSize(Size value) {
        return new JAXBElement<Size>(_WorkflowStateSize_QNAME, Size.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Point }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "center", scope = WorkflowComment.class)
    public JAXBElement<Point> createWorkflowCommentCenter(Point value) {
        return new JAXBElement<Point>(_WorkflowStateCenter_QNAME, Point.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "text", scope = WorkflowComment.class)
    public JAXBElement<String> createWorkflowCommentText(String value) {
        return new JAXBElement<String>(_WorkflowCommentText_QNAME, String.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "ownerTransition", scope = WorkflowComment.class)
    public JAXBElement<TransitionIdentifier> createWorkflowCommentOwnerTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_WorkflowCommentOwnerTransition_QNAME, TransitionIdentifier.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "styleOverride", scope = WorkflowComment.class)
    public JAXBElement<String> createWorkflowCommentStyleOverride(String value) {
        return new JAXBElement<String>(_WorkflowBandStyleOverride_QNAME, String.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "styleClass", scope = WorkflowComment.class)
    public JAXBElement<String> createWorkflowCommentStyleClass(String value) {
        return new JAXBElement<String>(_WorkflowTransitionStyleClass_QNAME, String.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = WorkflowComment.class)
    public JAXBElement<ExtendedData> createWorkflowCommentExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, WorkflowComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "field", scope = FieldSelectionsHolder.class)
    public JAXBElement<FieldIdentifier> createFieldSelectionsHolderField(FieldIdentifier value) {
        return new JAXBElement<FieldIdentifier>(_FieldField_QNAME, FieldIdentifier.class, FieldSelectionsHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = FieldSelectionsHolder.class)
    public JAXBElement<ExtendedData> createFieldSelectionsHolderExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, FieldSelectionsHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteAttachmentContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "noteContents", scope = CreateNoteAttachment.class)
    public JAXBElement<NoteAttachmentContents> createCreateNoteAttachmentNoteContents(NoteAttachmentContents value) {
        return new JAXBElement<NoteAttachmentContents>(_CreateNoteAttachmentNoteContents_QNAME, NoteAttachmentContents.class, CreateNoteAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = CreateNoteAttachment.class)
    public JAXBElement<ItemIdentifier> createCreateNoteAttachmentItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, CreateNoteAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = CreateNoteAttachment.class)
    public JAXBElement<Auth> createCreateNoteAttachmentAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, CreateNoteAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "author", scope = CreateNoteAttachment.class)
    public JAXBElement<UserIdentifier> createCreateNoteAttachmentAuthor(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_NoteAuthor_QNAME, UserIdentifier.class, CreateNoteAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = IsUserValid.class)
    public JAXBElement<Auth> createIsUserValidAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, IsUserValid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = IsUserValid.class)
    public JAXBElement<Options> createIsUserValidOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, IsUserValid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "user", scope = IsUserValid.class)
    public JAXBElement<UserIdentifier> createIsUserValidUser(UserIdentifier value) {
        return new JAXBElement<UserIdentifier>(_StateChangeHistoryUser_QNAME, UserIdentifier.class, IsUserValid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteLoggerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = GetNoteLoggerInfoResponse.class)
    public JAXBElement<NoteLoggerInfo> createGetNoteLoggerInfoResponseReturn(NoteLoggerInfo value) {
        return new JAXBElement<NoteLoggerInfo>(_RunReportXmlResponseReturn_QNAME, NoteLoggerInfo.class, GetNoteLoggerInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTItemHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = CreateAuxItemResponse.class)
    public JAXBElement<TTItemHolder> createCreateAuxItemResponseReturn(TTItemHolder value) {
        return new JAXBElement<TTItemHolder>(_RunReportXmlResponseReturn_QNAME, TTItemHolder.class, CreateAuxItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = GetItemsByQueryResponse.class)
    public JAXBElement<TTItemList> createGetItemsByQueryResponseReturn(TTItemList value) {
        return new JAXBElement<TTItemList>(_RunReportXmlResponseReturn_QNAME, TTItemList.class, GetItemsByQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = RoleInfo.class)
    public JAXBElement<ExtendedData> createRoleInfoExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, RoleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetFieldSelections.class)
    public JAXBElement<Auth> createGetFieldSelectionsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetFieldSelections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = GetFieldSelections.class)
    public JAXBElement<ProjectIdentifier> createGetFieldSelectionsProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, GetFieldSelections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "uniqueName", scope = SolutionIdentifier.class)
    public JAXBElement<String> createSolutionIdentifierUniqueName(String value) {
        return new JAXBElement<String>(_SolutionIdentifierUniqueName_QNAME, String.class, SolutionIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "tabName", scope = SolutionIdentifier.class)
    public JAXBElement<String> createSolutionIdentifierTabName(String value) {
        return new JAXBElement<String>(_SolutionIdentifierTabName_QNAME, String.class, SolutionIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetTables.class)
    public JAXBElement<Auth> createGetTablesAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetTables.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "solution", scope = GetTables.class)
    public JAXBElement<SolutionIdentifier> createGetTablesSolution(SolutionIdentifier value) {
        return new JAXBElement<SolutionIdentifier>(_RunReportSolution_QNAME, SolutionIdentifier.class, GetTables.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetTables.class)
    public JAXBElement<Options> createGetTablesOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetTables.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetNoteLoggerInfo.class)
    public JAXBElement<Auth> createGetNoteLoggerInfoAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetNoteLoggerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetNoteLoggerInfo.class)
    public JAXBElement<Options> createGetNoteLoggerInfoOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetNoteLoggerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = LinkSubtask.class)
    public JAXBElement<Auth> createLinkSubtaskAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, LinkSubtask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = LinkSubtask.class)
    public JAXBElement<Options> createLinkSubtaskOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, LinkSubtask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "loginAsUserId", scope = Auth.class)
    public JAXBElement<String> createAuthLoginAsUserId(String value) {
        return new JAXBElement<String>(_AuthLoginAsUserId_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "password", scope = Auth.class)
    public JAXBElement<String> createAuthPassword(String value) {
        return new JAXBElement<String>(_AuthPassword_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "hostname", scope = Auth.class)
    public JAXBElement<String> createAuthHostname(String value) {
        return new JAXBElement<String>(_AuthHostname_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "userId", scope = Auth.class)
    public JAXBElement<String> createAuthUserId(String value) {
        return new JAXBElement<String>(_AuthUserId_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Auth.class)
    public JAXBElement<ExtendedData> createAuthExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetReports.class)
    public JAXBElement<Auth> createGetReportsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportsFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "reportsFilter", scope = GetReports.class)
    public JAXBElement<ReportsFilter> createGetReportsReportsFilter(ReportsFilter value) {
        return new JAXBElement<ReportsFilter>(_GetReportsReportsFilter_QNAME, ReportsFilter.class, GetReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetReports.class)
    public JAXBElement<Options> createGetReportsOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "queryRange", scope = GetReports.class)
    public JAXBElement<QueryRange> createGetReportsQueryRange(QueryRange value) {
        return new JAXBElement<QueryRange>(_RunReportQueryRange_QNAME, QueryRange.class, GetReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = GetReportsResult.class)
    public JAXBElement<ExtendedData> createGetReportsResultExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, GetReportsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunReportResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = RunReportResponse.class)
    public JAXBElement<RunReportResult> createRunReportResponseReturn(RunReportResult value) {
        return new JAXBElement<RunReportResult>(_RunReportXmlResponseReturn_QNAME, RunReportResult.class, RunReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "return", scope = CreateFileAttachmentResponse.class)
    public JAXBElement<FileAttachment> createCreateFileAttachmentResponseReturn(FileAttachment value) {
        return new JAXBElement<FileAttachment>(_RunReportXmlResponseReturn_QNAME, FileAttachment.class, CreateFileAttachmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "item", scope = GetAvailableTransitions.class)
    public JAXBElement<ItemIdentifier> createGetAvailableTransitionsItem(ItemIdentifier value) {
        return new JAXBElement<ItemIdentifier>(_ReportResultItem_QNAME, ItemIdentifier.class, GetAvailableTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "auth", scope = GetAvailableTransitions.class)
    public JAXBElement<Auth> createGetAvailableTransitionsAuth(Auth value) {
        return new JAXBElement<Auth>(_GetItemAuth_QNAME, Auth.class, GetAvailableTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "options", scope = GetAvailableTransitions.class)
    public JAXBElement<Options> createGetAvailableTransitionsOptions(Options value) {
        return new JAXBElement<Options>(_GetItemOptions_QNAME, Options.class, GetAvailableTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "attributeName", scope = GetAvailableTransitions.class)
    public JAXBElement<String> createGetAvailableTransitionsAttributeName(String value) {
        return new JAXBElement<String>(_GetAvailableSubmitTransitionsAttributeName_QNAME, String.class, GetAvailableTransitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "fromState", scope = Transition.class)
    public JAXBElement<StateIdentifier> createTransitionFromState(StateIdentifier value) {
        return new JAXBElement<StateIdentifier>(_TransitionFromState_QNAME, StateIdentifier.class, Transition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "toState", scope = Transition.class)
    public JAXBElement<StateIdentifier> createTransitionToState(StateIdentifier value) {
        return new JAXBElement<StateIdentifier>(_TransitionToState_QNAME, StateIdentifier.class, Transition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "project", scope = Transition.class)
    public JAXBElement<ProjectIdentifier> createTransitionProject(ProjectIdentifier value) {
        return new JAXBElement<ProjectIdentifier>(_TTItemProject_QNAME, ProjectIdentifier.class, Transition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Transition.class)
    public JAXBElement<ExtendedData> createTransitionExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Transition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "transition", scope = Transition.class)
    public JAXBElement<TransitionIdentifier> createTransitionTransition(TransitionIdentifier value) {
        return new JAXBElement<TransitionIdentifier>(_TransitionItemsTransition_QNAME, TransitionIdentifier.class, Transition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = TTItemList.class)
    public JAXBElement<ExtendedData> createTTItemListExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, TTItemList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileBufferBase64 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "contentsBase64", scope = FileAttachmentContents.class)
    public JAXBElement<FileBufferBase64> createFileAttachmentContentsContentsBase64(FileBufferBase64 value) {
        return new JAXBElement<FileBufferBase64>(_FileContentsContentsBase64_QNAME, FileBufferBase64 .class, FileAttachmentContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "code", scope = Status.class)
    public JAXBElement<String> createStatusCode(String value) {
        return new JAXBElement<String>(_StatusCode_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "message", scope = Status.class)
    public JAXBElement<String> createStatusMessage(String value) {
        return new JAXBElement<String>(_StatusMessage_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sbmappservices72", name = "extendedData", scope = Status.class)
    public JAXBElement<ExtendedData> createStatusExtendedData(ExtendedData value) {
        return new JAXBElement<ExtendedData>(_TTItemExtendedData_QNAME, ExtendedData.class, Status.class, value);
    }

}
