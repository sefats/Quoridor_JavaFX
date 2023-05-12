package model;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class QuoridorStageFactoryUnitTest {

    @Test
    public void testQuoridorStageFactory(){
        QuoridorStageModel gameStageModel = mock(QuoridorStageModel.class);
        QuoridorStageFactory quoridorStageFactory = new QuoridorStageFactory(gameStageModel);
        quoridorStageFactory.setup();
        verify(gameStageModel).setBoard(any(QuoridorBoard.class));
        verify(gameStageModel).setBluePot(any(QuoridorWallPot.class));
        verify(gameStageModel).setRedPot(any(QuoridorWallPot.class));
        verify(gameStageModel).setBluePawn(any(QuoridorPawn.class));
        verify(gameStageModel).setBlueWalls(any(Wall[].class));
        verify(gameStageModel).setRedWalls(any(Wall[].class));

    }
}