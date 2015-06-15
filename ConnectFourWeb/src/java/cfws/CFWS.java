/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author yashar
 */
@WebService(serviceName = "CFWS")
public class CFWS {

    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private int board[][] = new int[ROWS][COLUMNS];
    private int playerTurn = 1;
    private String[] player = {"player0", "player1", "player2"};
    private int connectedNumber = 0;

    /**
     * create new Connection
     *
     * @param playerName
     */
    @WebMethod
    public int newConnection(@WebParam(name = "playerName") String playerName) {
        if (true) {
            connectedNumber++;
            player[connectedNumber] = playerName;
        }
        return 1;
    }
    
    @WebMethod
    public int removeConnection(){
        connectedNumber--;
        return 1;
    }
    
    @WebMethod
    public int getConnectedNumber() {
        return this.connectedNumber;
    }

    @WebMethod
    public int getRow() {
        return ROWS;
    }

    @WebMethod
    public int getColumn() {
        return COLUMNS;
    }

    @WebMethod
    public String getPlayerName(@WebParam(name = "playerNumber") int playerNumber) {
        return this.player[playerNumber];
    }

    @WebMethod
    public void setPlayerName(@WebParam(name = "playerNumber") int playerNumber, @WebParam(name = "playerName") String playerName) {
        this.player[playerNumber] = playerName;
    }

    @WebMethod
    public int getPlayerTurn() {
        return this.playerTurn;
    }

    @WebMethod
    public void setPlayerTurn(@WebParam(name = "playerTurn") int playerTurn) {
        this.playerTurn = playerTurn;
    }

    @WebMethod
    public boolean addMove(@WebParam(name = "column") int column, @WebParam(name = "playerNo") int playerNo) {

        if (column >= board[0].length || column < 0) {
            return false;
        }
        if (playerNo != 1 && playerNo != 2) {
            return false;
        }
        for (int row = board.length - 1; row >= 0; row--) {
            if (board[row][column] == 0) {
                board[row][column] = playerNo;
                return true;
            }
        }
        return true;
    }

    @WebMethod
    public boolean checkDraw() {
        for (int j = 0; j < COLUMNS; j++) {
            if (board[0][j] == 0) {
                return false;
            }
        }
        return true;
    }

    @WebMethod
    public int getCell(@WebParam(name = "row") int row, @WebParam(name = "col") int col) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLUMNS) {
            return 0;
        }
        return board[row][col];
    }

    @WebMethod
    public int checkBoard() {
        // Row Wise
        for (int r = ROWS - 1; r >= 0; r--) {
            for (int c = 0; c < COLUMNS - 3; c++) {

                if (board[r][c] == 1
                        && board[r][c + 1] == 1
                        && board[r][c + 2] == 1
                        && board[r][c + 3] == 1) {
                    return 1;
                }
                if (board[r][c] == 2
                        && board[r][c + 1] == 2
                        && board[r][c + 2] == 2
                        && board[r][c + 3] == 2) {
                    return 2;
                }
            }
        }
        // Column Wise

        for (int c = 0; c < COLUMNS; c++) {

            for (int r = ROWS - 1 - 3; r >= 0; r--) {

                if (board[r][c] == 1
                        && board[r + 1][c] == 1
                        && board[r + 2][c] == 1
                        && board[r + 3][c] == 1) {

                    return 1;
                }
                if (board[r][c] == 2
                        && board[r + 1][c] == 2
                        && board[r + 2][c] == 2
                        && board[r + 3][c] == 2) {

                    return 2;
                }
            }
        }
        // Diagonals
        for (int r = ROWS - 1 - 3; r >= 0; r--) {

            for (int c = 0; c < COLUMNS - 1 - 3; c++) {

                if (board[r][c] == 1
                        && board[r + 1][c + 1] == 1
                        && board[r + 2][c + 2] == 1
                        && board[r + 3][c + 3] == 1) {
                    return 1;
                }
                if (board[r][c] == 2
                        && board[r + 1][c + 1] == 2
                        && board[r + 2][c + 2] == 2
                        && board[r + 3][c + 3] == 2) {
                    return 2;
                }
            }
        }
        for (int r = ROWS - 1; r >= 3; r--) {

            for (int c = 3; c < COLUMNS; c++) {

                if (board[r][c] == 1
                        && board[r - 1][c - 1] == 1
                        && board[r - 2][c - 2] == 1
                        && board[r - 3][c - 3] == 1) {
                    return 1;
                }
                if (board[r][c] == 2
                        && board[r - 1][c - 1] == 2
                        && board[r - 2][c - 2] == 2
                        && board[r - 3][c - 3] == 2) {
                    return 2;
                }
            }
        }
        for (int r = ROWS - 1; r >= 3; r--) {

            for (int c = 0; c < COLUMNS - 3; c++) {

                if (board[r][c] == 1
                        && board[r - 1][c + 1] == 1
                        && board[r - 2][c + 2] == 1
                        && board[r - 3][c + 3] == 1) {
                    return 1;
                }
                if (board[r][c] == 2
                        && board[r - 1][c + 1] == 2
                        && board[r - 2][c + 2] == 2
                        && board[r - 3][c + 3] == 2) {
                    return 2;
                }
            }
        }
        for (int r = ROWS - 1 - 3; r >= 0; r--) {

            for (int c = 3; c < COLUMNS; c++) {

                if (board[r][c] == 1
                        && board[r + 1][c - 1] == 1
                        && board[r + 2][c - 2] == 1
                        && board[r + 3][c - 3] == 1) {
                    return 1;
                }
                if (board[r][c] == 2
                        && board[r + 1][c - 1] == 2
                        && board[r + 2][c - 2] == 2
                        && board[r + 3][c - 3] == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }

    @WebMethod
    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;

            }

        }

    }
}
