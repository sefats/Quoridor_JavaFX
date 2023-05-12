package model;

import boardifier.model.GameStageModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class QuoridorPawnUnitTest {
    @Mock
    GameStageModel gameStageModel;

    private QuoridorPawn pawn;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        pawn = new QuoridorPawn(1, 4, 4, gameStageModel);
    }

    @Test
    public void testGetPlayerID() {
        assertEquals(1, pawn.getPlayerID());
    }

    @Test
    public void testGetCol() {
        assertEquals(4, pawn.getCol());
    }

    @Test
    public void testGetLine() {
        assertEquals(4, pawn.getLine());
    }
}
