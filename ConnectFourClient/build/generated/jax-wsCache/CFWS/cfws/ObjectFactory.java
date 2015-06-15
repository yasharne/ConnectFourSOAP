
package cfws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cfws package. 
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

    private final static QName _GetPlayerTurn_QNAME = new QName("http://cfws/", "getPlayerTurn");
    private final static QName _GetColumn_QNAME = new QName("http://cfws/", "getColumn");
    private final static QName _SetPlayerNameResponse_QNAME = new QName("http://cfws/", "setPlayerNameResponse");
    private final static QName _GetConnectedNumber_QNAME = new QName("http://cfws/", "getConnectedNumber");
    private final static QName _SetPlayerTurn_QNAME = new QName("http://cfws/", "setPlayerTurn");
    private final static QName _CheckDraw_QNAME = new QName("http://cfws/", "checkDraw");
    private final static QName _NewConnection_QNAME = new QName("http://cfws/", "newConnection");
    private final static QName _AddMove_QNAME = new QName("http://cfws/", "addMove");
    private final static QName _AddMoveResponse_QNAME = new QName("http://cfws/", "addMoveResponse");
    private final static QName _RemoveConnectionResponse_QNAME = new QName("http://cfws/", "removeConnectionResponse");
    private final static QName _GetColumnResponse_QNAME = new QName("http://cfws/", "getColumnResponse");
    private final static QName _SetPlayerName_QNAME = new QName("http://cfws/", "setPlayerName");
    private final static QName _CheckBoard_QNAME = new QName("http://cfws/", "checkBoard");
    private final static QName _CheckDrawResponse_QNAME = new QName("http://cfws/", "checkDrawResponse");
    private final static QName _ClearBoardResponse_QNAME = new QName("http://cfws/", "clearBoardResponse");
    private final static QName _GetPlayerTurnResponse_QNAME = new QName("http://cfws/", "getPlayerTurnResponse");
    private final static QName _SetPlayerTurnResponse_QNAME = new QName("http://cfws/", "setPlayerTurnResponse");
    private final static QName _GetCellResponse_QNAME = new QName("http://cfws/", "getCellResponse");
    private final static QName _RemoveConnection_QNAME = new QName("http://cfws/", "removeConnection");
    private final static QName _GetPlayerName_QNAME = new QName("http://cfws/", "getPlayerName");
    private final static QName _GetConnectedNumberResponse_QNAME = new QName("http://cfws/", "getConnectedNumberResponse");
    private final static QName _GetPlayerNameResponse_QNAME = new QName("http://cfws/", "getPlayerNameResponse");
    private final static QName _ClearBoard_QNAME = new QName("http://cfws/", "clearBoard");
    private final static QName _GetRow_QNAME = new QName("http://cfws/", "getRow");
    private final static QName _CheckBoardResponse_QNAME = new QName("http://cfws/", "checkBoardResponse");
    private final static QName _GetRowResponse_QNAME = new QName("http://cfws/", "getRowResponse");
    private final static QName _GetCell_QNAME = new QName("http://cfws/", "getCell");
    private final static QName _NewConnectionResponse_QNAME = new QName("http://cfws/", "newConnectionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cfws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetPlayerName }
     * 
     */
    public SetPlayerName createSetPlayerName() {
        return new SetPlayerName();
    }

    /**
     * Create an instance of {@link CheckBoard }
     * 
     */
    public CheckBoard createCheckBoard() {
        return new CheckBoard();
    }

    /**
     * Create an instance of {@link CheckDrawResponse }
     * 
     */
    public CheckDrawResponse createCheckDrawResponse() {
        return new CheckDrawResponse();
    }

    /**
     * Create an instance of {@link ClearBoardResponse }
     * 
     */
    public ClearBoardResponse createClearBoardResponse() {
        return new ClearBoardResponse();
    }

    /**
     * Create an instance of {@link RemoveConnectionResponse }
     * 
     */
    public RemoveConnectionResponse createRemoveConnectionResponse() {
        return new RemoveConnectionResponse();
    }

    /**
     * Create an instance of {@link AddMoveResponse }
     * 
     */
    public AddMoveResponse createAddMoveResponse() {
        return new AddMoveResponse();
    }

    /**
     * Create an instance of {@link GetColumnResponse }
     * 
     */
    public GetColumnResponse createGetColumnResponse() {
        return new GetColumnResponse();
    }

    /**
     * Create an instance of {@link SetPlayerTurn }
     * 
     */
    public SetPlayerTurn createSetPlayerTurn() {
        return new SetPlayerTurn();
    }

    /**
     * Create an instance of {@link GetConnectedNumber }
     * 
     */
    public GetConnectedNumber createGetConnectedNumber() {
        return new GetConnectedNumber();
    }

    /**
     * Create an instance of {@link AddMove }
     * 
     */
    public AddMove createAddMove() {
        return new AddMove();
    }

    /**
     * Create an instance of {@link CheckDraw }
     * 
     */
    public CheckDraw createCheckDraw() {
        return new CheckDraw();
    }

    /**
     * Create an instance of {@link NewConnection }
     * 
     */
    public NewConnection createNewConnection() {
        return new NewConnection();
    }

    /**
     * Create an instance of {@link GetPlayerTurn }
     * 
     */
    public GetPlayerTurn createGetPlayerTurn() {
        return new GetPlayerTurn();
    }

    /**
     * Create an instance of {@link GetColumn }
     * 
     */
    public GetColumn createGetColumn() {
        return new GetColumn();
    }

    /**
     * Create an instance of {@link SetPlayerNameResponse }
     * 
     */
    public SetPlayerNameResponse createSetPlayerNameResponse() {
        return new SetPlayerNameResponse();
    }

    /**
     * Create an instance of {@link CheckBoardResponse }
     * 
     */
    public CheckBoardResponse createCheckBoardResponse() {
        return new CheckBoardResponse();
    }

    /**
     * Create an instance of {@link GetRowResponse }
     * 
     */
    public GetRowResponse createGetRowResponse() {
        return new GetRowResponse();
    }

    /**
     * Create an instance of {@link GetCell }
     * 
     */
    public GetCell createGetCell() {
        return new GetCell();
    }

    /**
     * Create an instance of {@link NewConnectionResponse }
     * 
     */
    public NewConnectionResponse createNewConnectionResponse() {
        return new NewConnectionResponse();
    }

    /**
     * Create an instance of {@link GetConnectedNumberResponse }
     * 
     */
    public GetConnectedNumberResponse createGetConnectedNumberResponse() {
        return new GetConnectedNumberResponse();
    }

    /**
     * Create an instance of {@link GetPlayerNameResponse }
     * 
     */
    public GetPlayerNameResponse createGetPlayerNameResponse() {
        return new GetPlayerNameResponse();
    }

    /**
     * Create an instance of {@link GetPlayerName }
     * 
     */
    public GetPlayerName createGetPlayerName() {
        return new GetPlayerName();
    }

    /**
     * Create an instance of {@link GetRow }
     * 
     */
    public GetRow createGetRow() {
        return new GetRow();
    }

    /**
     * Create an instance of {@link ClearBoard }
     * 
     */
    public ClearBoard createClearBoard() {
        return new ClearBoard();
    }

    /**
     * Create an instance of {@link SetPlayerTurnResponse }
     * 
     */
    public SetPlayerTurnResponse createSetPlayerTurnResponse() {
        return new SetPlayerTurnResponse();
    }

    /**
     * Create an instance of {@link GetCellResponse }
     * 
     */
    public GetCellResponse createGetCellResponse() {
        return new GetCellResponse();
    }

    /**
     * Create an instance of {@link RemoveConnection }
     * 
     */
    public RemoveConnection createRemoveConnection() {
        return new RemoveConnection();
    }

    /**
     * Create an instance of {@link GetPlayerTurnResponse }
     * 
     */
    public GetPlayerTurnResponse createGetPlayerTurnResponse() {
        return new GetPlayerTurnResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerTurn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getPlayerTurn")
    public JAXBElement<GetPlayerTurn> createGetPlayerTurn(GetPlayerTurn value) {
        return new JAXBElement<GetPlayerTurn>(_GetPlayerTurn_QNAME, GetPlayerTurn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getColumn")
    public JAXBElement<GetColumn> createGetColumn(GetColumn value) {
        return new JAXBElement<GetColumn>(_GetColumn_QNAME, GetColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlayerNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "setPlayerNameResponse")
    public JAXBElement<SetPlayerNameResponse> createSetPlayerNameResponse(SetPlayerNameResponse value) {
        return new JAXBElement<SetPlayerNameResponse>(_SetPlayerNameResponse_QNAME, SetPlayerNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectedNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getConnectedNumber")
    public JAXBElement<GetConnectedNumber> createGetConnectedNumber(GetConnectedNumber value) {
        return new JAXBElement<GetConnectedNumber>(_GetConnectedNumber_QNAME, GetConnectedNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlayerTurn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "setPlayerTurn")
    public JAXBElement<SetPlayerTurn> createSetPlayerTurn(SetPlayerTurn value) {
        return new JAXBElement<SetPlayerTurn>(_SetPlayerTurn_QNAME, SetPlayerTurn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "checkDraw")
    public JAXBElement<CheckDraw> createCheckDraw(CheckDraw value) {
        return new JAXBElement<CheckDraw>(_CheckDraw_QNAME, CheckDraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "newConnection")
    public JAXBElement<NewConnection> createNewConnection(NewConnection value) {
        return new JAXBElement<NewConnection>(_NewConnection_QNAME, NewConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "addMove")
    public JAXBElement<AddMove> createAddMove(AddMove value) {
        return new JAXBElement<AddMove>(_AddMove_QNAME, AddMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "addMoveResponse")
    public JAXBElement<AddMoveResponse> createAddMoveResponse(AddMoveResponse value) {
        return new JAXBElement<AddMoveResponse>(_AddMoveResponse_QNAME, AddMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "removeConnectionResponse")
    public JAXBElement<RemoveConnectionResponse> createRemoveConnectionResponse(RemoveConnectionResponse value) {
        return new JAXBElement<RemoveConnectionResponse>(_RemoveConnectionResponse_QNAME, RemoveConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetColumnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getColumnResponse")
    public JAXBElement<GetColumnResponse> createGetColumnResponse(GetColumnResponse value) {
        return new JAXBElement<GetColumnResponse>(_GetColumnResponse_QNAME, GetColumnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlayerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "setPlayerName")
    public JAXBElement<SetPlayerName> createSetPlayerName(SetPlayerName value) {
        return new JAXBElement<SetPlayerName>(_SetPlayerName_QNAME, SetPlayerName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "checkBoard")
    public JAXBElement<CheckBoard> createCheckBoard(CheckBoard value) {
        return new JAXBElement<CheckBoard>(_CheckBoard_QNAME, CheckBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "checkDrawResponse")
    public JAXBElement<CheckDrawResponse> createCheckDrawResponse(CheckDrawResponse value) {
        return new JAXBElement<CheckDrawResponse>(_CheckDrawResponse_QNAME, CheckDrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "clearBoardResponse")
    public JAXBElement<ClearBoardResponse> createClearBoardResponse(ClearBoardResponse value) {
        return new JAXBElement<ClearBoardResponse>(_ClearBoardResponse_QNAME, ClearBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerTurnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getPlayerTurnResponse")
    public JAXBElement<GetPlayerTurnResponse> createGetPlayerTurnResponse(GetPlayerTurnResponse value) {
        return new JAXBElement<GetPlayerTurnResponse>(_GetPlayerTurnResponse_QNAME, GetPlayerTurnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlayerTurnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "setPlayerTurnResponse")
    public JAXBElement<SetPlayerTurnResponse> createSetPlayerTurnResponse(SetPlayerTurnResponse value) {
        return new JAXBElement<SetPlayerTurnResponse>(_SetPlayerTurnResponse_QNAME, SetPlayerTurnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCellResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getCellResponse")
    public JAXBElement<GetCellResponse> createGetCellResponse(GetCellResponse value) {
        return new JAXBElement<GetCellResponse>(_GetCellResponse_QNAME, GetCellResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "removeConnection")
    public JAXBElement<RemoveConnection> createRemoveConnection(RemoveConnection value) {
        return new JAXBElement<RemoveConnection>(_RemoveConnection_QNAME, RemoveConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getPlayerName")
    public JAXBElement<GetPlayerName> createGetPlayerName(GetPlayerName value) {
        return new JAXBElement<GetPlayerName>(_GetPlayerName_QNAME, GetPlayerName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectedNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getConnectedNumberResponse")
    public JAXBElement<GetConnectedNumberResponse> createGetConnectedNumberResponse(GetConnectedNumberResponse value) {
        return new JAXBElement<GetConnectedNumberResponse>(_GetConnectedNumberResponse_QNAME, GetConnectedNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getPlayerNameResponse")
    public JAXBElement<GetPlayerNameResponse> createGetPlayerNameResponse(GetPlayerNameResponse value) {
        return new JAXBElement<GetPlayerNameResponse>(_GetPlayerNameResponse_QNAME, GetPlayerNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "clearBoard")
    public JAXBElement<ClearBoard> createClearBoard(ClearBoard value) {
        return new JAXBElement<ClearBoard>(_ClearBoard_QNAME, ClearBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getRow")
    public JAXBElement<GetRow> createGetRow(GetRow value) {
        return new JAXBElement<GetRow>(_GetRow_QNAME, GetRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "checkBoardResponse")
    public JAXBElement<CheckBoardResponse> createCheckBoardResponse(CheckBoardResponse value) {
        return new JAXBElement<CheckBoardResponse>(_CheckBoardResponse_QNAME, CheckBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getRowResponse")
    public JAXBElement<GetRowResponse> createGetRowResponse(GetRowResponse value) {
        return new JAXBElement<GetRowResponse>(_GetRowResponse_QNAME, GetRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "getCell")
    public JAXBElement<GetCell> createGetCell(GetCell value) {
        return new JAXBElement<GetCell>(_GetCell_QNAME, GetCell.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfws/", name = "newConnectionResponse")
    public JAXBElement<NewConnectionResponse> createNewConnectionResponse(NewConnectionResponse value) {
        return new JAXBElement<NewConnectionResponse>(_NewConnectionResponse_QNAME, NewConnectionResponse.class, null, value);
    }

}
