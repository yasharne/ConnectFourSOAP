/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author yashar
 */
public class BoardController implements Initializable {

    private ConnectFour connectFour;
    private int id;
    public boolean isClosed;
    @FXML
    GridPane board;
    @FXML
    StackPane msgBoard;
    @FXML
    Label msgLable;
    @FXML
    Rectangle rectPanel;
    @FXML
    Label rectLabel;
    int rows = 6;
    int cols = 7;
    Circle circles[][];
    @FXML
    private InnerShadow x1;
    @FXML
    private Color x2;
    @FXML
    private Color x3;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        circles = new Circle[getRow()][getColumn()];
        TextInputDialog dialog = new TextInputDialog();
        dialog.setContentText("Enter Your Name");
        Optional<String> result = dialog.showAndWait();
        //setPlayerName(1, result.get());
        isClosed = false;
        id = newConnection(result.get());
        System.out.println(id);
        clearBoard();
        for (Node a : board.getChildren()) {

            if (a instanceof Circle) {
                ((Circle) a).setFill(Color.GRAY);
                circles[board.getRowIndex(a)][board.getColumnIndex(a)] = ((Circle) a);
            }
        }
        renderModel();
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (!isClosed) {
                    Platform.runLater(new Runnable() {

                        @Override
                        public void run() {
                            renderModel();
                        }
                    });
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }).start();

        board.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (getConnectedNumber() == 2) {
                    int dw = (int) board.getWidth() / cols;
                    if (addMove((int) (t.getX() / dw), getPlayerTurn())) {

                        setPlayerTurn((getPlayerTurn() == 1 ? 2 : 1));

                        renderModel();
                    }
                    t.consume();
                } else {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setTitle("Warning !");
                    alert.setContentText("Wait for other player to connect...");
                    alert.showAndWait();
                }
            }
        });

    }

    public void setMainApp(ConnectFour connectFour) {
        this.connectFour = connectFour;
    }

    public void renderModel() {
        rectLabel.setText(getPlayerName(getPlayerTurn()));
        rectPanel.setFill(getPlayerTurn() == 1 ? Color.GREEN.brighter().brighter() : Color.RED.brighter().brighter());

        int w = checkBoard();
        if (w == 1) {
            msgLable.setText(getPlayerName(w) + " Won!");
            msgLable.setTextFill(Color.GREEN.brighter().brighter());
            msgBoard.setVisible(true);
        } else if (w == 2) {
            msgLable.setText(getPlayerName(w) + " Won!");
            msgLable.setTextFill(Color.RED.brighter().brighter());
            msgBoard.setVisible(true);
        } else if (checkDraw()) {
            msgLable.setText("Draw");
            msgBoard.setVisible(true);
        }

        for (int row = 0; row < circles.length; row++) {
            for (int col = 0; col < circles[row].length; col++) {
                switch (getCell(row, col)) {
                    case 0:
                        circles[row][col].setFill(Color.GRAY.darker());
                        break;
                    case 1:
                        circles[row][col].setFill(Color.GREEN.brighter().brighter());
                        break;
                    case 2:
                        circles[row][col].setFill(Color.RED.brighter().brighter());

                }

            }

        }
    }

    private static boolean addMove(int column, int playerNo) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.addMove(column, playerNo);
    }

    private static int checkBoard() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.checkBoard();
    }

    private static boolean checkDraw() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.checkDraw();
    }

    private static void clearBoard() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        port.clearBoard();
    }

    private static int getCell(int row, int col) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.getCell(row, col);
    }

    private static int getColumn() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.getColumn();
    }

    private static int getConnectedNumber() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.getConnectedNumber();
    }

    private static String getPlayerName(int playerNumber) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.getPlayerName(playerNumber);
    }

    private static int getPlayerTurn() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.getPlayerTurn();
    }

    private static int getRow() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.getRow();
    }

    private static int newConnection(java.lang.String playerName) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.newConnection(playerName);
    }

    private static void setPlayerName(int playerNumber, java.lang.String playerName) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        port.setPlayerName(playerNumber, playerName);
    }

    private static void setPlayerTurn(int playerTurn) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        port.setPlayerTurn(playerTurn);
    }

}
