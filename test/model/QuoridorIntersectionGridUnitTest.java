package model ;

import boardifier.model.GameStageModel;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class QuoridorIntersectionGridUnitTest {

    @Mock
    GameStageModel gameStageModel;

    @Test
    public void testGetElementType() {
        QuoridorIntersectionGrid intersectionGrid = new QuoridorIntersectionGrid(1, 1, gameStageModel);
        assertEquals("intersectiongrid", intersectionGrid.getType());
    }

    @Test
    public void testGetPositionX() {
        QuoridorIntersectionGrid intersectionGrid = new QuoridorIntersectionGrid(1, 1, gameStageModel);
        assertEquals(1, intersectionGrid.getX());
    }

    @Test
    public void testGetPositionY() {
        QuoridorIntersectionGrid intersectionGrid = new QuoridorIntersectionGrid(1, 1, gameStageModel);
        assertEquals(1, intersectionGrid.getY());
    }


}
