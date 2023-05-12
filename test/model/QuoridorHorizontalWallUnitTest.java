package model;

import boardifier.model.GameStageModel;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class QuoridorHorizontalWallUnitTest {

    @Mock
    GameStageModel mockGameStageModel = Mockito.mock(GameStageModel.class);

    @Test
    public void testGetColor() {
        int color = QuoridorHorizontalWall.WALL_BLUE;
        QuoridorHorizontalWall wall = new QuoridorHorizontalWall(color, mockGameStageModel);
        assertEquals(color, wall.getColor());

        color = QuoridorHorizontalWall.WALL_RED;
        wall = new QuoridorHorizontalWall(color, mockGameStageModel);
        assertEquals(color, wall.getColor());
    }
}
