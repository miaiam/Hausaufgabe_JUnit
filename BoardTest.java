/**
 * Created by Mia on 23.05.16.
 */
import org.junit.*;
import static org.junit.Assert.*;

public class BoardTest {
    Board board;

    @Before
    public void initialize(){
        board = new Board();
    }

    @Test
    public void emptyBoard(){
        assertFalse(board.hasWinner());
    }

    @Test
    public void setMark() throws InvalidPositionException{34
        board.setMark("x", 0, 1);
        assertFalse(board.hasWinner());
    }

    @Test
    public void setSeveralMarks() throws InvalidPositionException{
        board.setMark("x", 0, 0);
        board.setMark("x", 0, 1);
        board.setMark("x", 0, 2);
        assertTrue(board.hasWinner());
    }

    @Test(expected = InvalidPositionException.class)
    public void setFalseMark() throws InvalidPositionException{
        board.setMark("o", 0, 3);
    }
}
