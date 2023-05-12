package model ;

import boardifier.model.GameStageModel;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class QuoridorVerticalWallUnitTest {

    @Test
    public void testGetColor() {
        GameStageModel gameStageModel = Mockito.mock(GameStageModel.class);
        QuoridorVerticalWall verticalWall = new QuoridorVerticalWall(QuoridorVerticalWall.WALL_BLUE, gameStageModel);
        assertEquals(QuoridorVerticalWall.WALL_BLUE, verticalWall.getColor());
    }
}
