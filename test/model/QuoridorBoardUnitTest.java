package model;

import boardifier.model.GameStageModel;
import boardifier.model.GridElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class QuoridorBoardUnitTest {
    GameStageModel gameStageModel;
    QuoridorBoard board;
    GridElement pot;

    @BeforeEach
    public void setUp(){
        gameStageModel = mock(GameStageModel.class);
        board = new QuoridorBoard(1, 1, gameStageModel);
        pot = mock(GridElement.class);
    }

    @Test
    public void testComputeValideCellsWhenPawnIsFree(){
        when(pot.isEmptyAt(anyInt(), anyInt())).thenReturn(true);

        board.setValidCells(4);

        boolean[][] lst = board.getReachableCells();
        int trueInLst = 0;

        for(boolean[] boolLine : lst){
            for(boolean bool : boolLine){
                if(bool)
                    trueInLst++;
            }
        }

        assertEquals(trueInLst, 9);

    }

    @Test
    public void testComputeValideCellsWhenPawnInCornerTopLeft(){
        when(pot.isEmptyAt(anyInt(), anyInt())).thenReturn(true);

        board.setValidCells(0);

        boolean[][] lst = board.getReachableCells();
        int trueInLst = 0;

        for(boolean[] boolLine : lst){
            for(boolean bool : boolLine){
                if(bool)
                    trueInLst++;
            }
        }

        assertEquals(trueInLst, 9);

    }

    @Test
    public void testComputeValideCellsWhenPawnCollide(){

        when(pot.isEmptyAt(anyInt(), anyInt())).thenReturn(false);

        board.setValidCells(6);

        boolean[][] lst = board.getReachableCells();
        int trueInLst = 0;

        for(boolean[] boolLine : lst){
            for(boolean bool : boolLine){
                if(bool)
                    trueInLst++;
            }
        }

        assertEquals(trueInLst, 9);

    }


}
