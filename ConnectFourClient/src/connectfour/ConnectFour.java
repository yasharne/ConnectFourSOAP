/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
/**
 *
 * @author yashar
 */
public class ConnectFour extends Application{
    
    BoardController bc;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ConnectFour.class.getResource("Board.fxml"));
        
        Parent root = loader.load();
        
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        bc = loader.getController();
        bc.setMainApp(this);
        primaryStage.setResizable(false);
        primaryStage.show();
        scene.getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent event) {
                bc.isClosed = true;
                System.out.println(removeConnection());
                if (bc.getWin()) {
                    bc.addScore(50);
                }
                updateScore(bc.getPlayerName(), bc.getScore());
            }
        });
    }
    
     public static void main(String[] args) {
        launch(args);
    }

    private static int removeConnection() {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.removeConnection();
    }

    private static int updateScore(java.lang.String playerName, int score) {
        cfws.CFWS_Service service = new cfws.CFWS_Service();
        cfws.CFWS port = service.getCFWSPort();
        return port.updateScore(playerName, score);
    }
}
