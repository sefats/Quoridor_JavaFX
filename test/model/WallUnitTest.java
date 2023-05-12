package model;

import boardifier.model.GameStageModel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class WallUnitTest {

    @Test
    public void testGetNumber() {
        GameStageModel mockGameStageModel = mock(GameStageModel.class);
        Wall wall = new Wall(1, Wall.WALL_BLUE, mockGameStageModel);
        assertEquals(1, wall.getNumber());
    }

    @Test
    public void testGetColor() {
        GameStageModel mockGameStageModel = mock(GameStageModel.class);
        Wall wall = new Wall(1, Wall.WALL_RED, mockGameStageModel);
        assertEquals(Wall.WALL_RED, wall.getColor());
    }
}
