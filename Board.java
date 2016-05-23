/**
 * Created by Mia on 23.05.16.
 */
public class Board {
    String[][] board;
    public Board(){
        board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                board[i][p] = "-";
            }
        }
    }
    public void setMark(String mark, int x, int y) throws InvalidPositionException{
        if (x > 2 || y > 2) {
            throw new InvalidPositionException("Ungültige Eingabe");
        }
        else{
            board[x][y] = mark;
        }
    }
    public boolean hasWinner(){
        if( board[0][0]==board[1][0] && board[0][0] == board[2][0] && (board[0][0].equals("x") || board[0][0].equals("o"))) {
            return true;
        }
        else if( board[0][1]==board[1][1] && board[0][1] == board[2][1] && (board[0][1].equals("x") || board[0][1].equals("o"))){
            return true;
        }
        else if( board[0][2]==board[1][2] && board[0][2] == board[2][2] && (board[0][2].equals("x") || board[0][2].equals("o"))){
            return true;
        }
        else if( board[0][0]==board[0][1] && board[0][0] == board[0][2] && (board[0][0].equals("x") || board[0][0].equals("o"))) {
            return true;
        }
        else if( board[1][0]==board[1][1] && board[1][0] == board[1][2] && (board[1][0].equals("x") || board[1][0].equals("o"))) {
            return true;
        }
        else if( board[2][0]==board[2][1] && board[2][0] == board[2][2] && (board[2][0].equals("x") || board[2][0].equals("o"))) {
            return true;
        }
        else if( board[0][0]==board[1][1] && board[0][0] == board[2][2] && (board[0][0].equals("x") || board[0][0].equals("o"))) {
            return true;
        }
        else if( board [2][0]==board[1][1] && board[2][0] == board[0][2] && (board[2][0].equals("x") || board[2][0].equals("o"))) {
            return true;
        }
        else {
            return false;
        }
    }
}
