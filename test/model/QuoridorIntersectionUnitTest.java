package model ;

import boardifier.model.GameStageModel;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class QuoridorIntersectionUnitTest {

    @Test
    public void testGetColor() {
        int expectedColor = 0;
        GameStageModel gameStageModel = Mockito.mock(GameStageModel.class);
        QuoridorIntersection intersection = new QuoridorIntersection(expectedColor, QuoridorIntersection.horizontal, gameStageModel);
        int actualColor = intersection.getColor();
        assertEquals(expectedColor, actualColor);
    }

    @Test
    public void testGetDirection() {
        int expectedDirection = 1;
        GameStageModel gameStageModel = Mockito.mock(GameStageModel.class);
        QuoridorIntersection intersection = new QuoridorIntersection(QuoridorIntersection.INTERSECTION_BLUE, expectedDirection, gameStageModel);
        int actualDirection = intersection.getDirection();
        assertEquals(expectedDirection, actualDirection);
    }

}
