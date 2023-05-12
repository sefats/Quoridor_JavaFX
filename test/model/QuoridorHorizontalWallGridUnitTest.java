package model;

import boardifier.model.GameStageModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class QuoridorHorizontalWallGridUnitTest {
    private QuoridorHorizontalWallGrid wall;
    private GameStageModel gameStageModel;

    @BeforeEach
    public void setUp() {
        gameStageModel = mock(GameStageModel.class);
        wall = new QuoridorHorizontalWallGrid(2, 3, gameStageModel);
    }

    @Test
    public void testGetX() {
        assertEquals(2, wall.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(3, wall.getY());
    }

    @Test
    public void testGetType() {
        assertEquals("horizontalwallgrid", wall.getType());
    }
}
