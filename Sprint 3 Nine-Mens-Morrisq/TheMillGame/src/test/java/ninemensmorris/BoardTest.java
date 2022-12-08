package ninemensmorris;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board p1 = new Board() ;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void board() {

    }

    @Test
    void getPosition() {

    }

    @Test
    void getCurrentTurn() {
        p1.setCurrentTurn("player_1");
        Assertions.assertEquals(p1.getCurrentTurn() ,"player_1" );
    }

    @Test
    void setCurrentTurn() {
        p1.setCurrentTurn("player_2");
        Assertions.assertEquals(p1.getCurrentTurn() , "player_2");
    }

    @Test
    void madeMill() {
    }

    @Test
    void getMillCombination() {
    }

    @Test
    void getNumberOfRemainingPlayerPiecesOutBoard() {
    }

    @Test
    void getNumberOfRemainingPlayerPiecesInBoard() {
    }

    @Test
    void getPlayerInBoardPosition() {
    }

    @Test
    void initBoard() {
    }

    @Test
    void initMillCombinations() {
    }

    @Test
    void testGetPosition() {
    }

    @Test
    void testGetCurrentTurn() {
    }

    @Test
    void testSetCurrentTurn() {
    }

    @Test
    void testMadeMill() {
    }

    @Test
    void testGetMillCombination() {
    }

    @Test
    void increaseNumberOfTotalPiecesPlaced() {
    }

    @Test
    void increaseNumberOfPiecesOfPlayer() {
    }

    @Test
    void decreaseNumPiecesOfPlayer() {
    }

    @Test
    void testGetNumberOfRemainingPlayerPiecesInBoard() {
    }

    @Test
    void testGetPlayerInBoardPosition() {
    }
}