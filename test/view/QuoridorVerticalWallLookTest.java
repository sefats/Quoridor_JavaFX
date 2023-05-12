package view;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import model.QuoridorVerticalWall;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class QuoridorVerticalWallLookTest {

    @Mock
    QuoridorVerticalWall mockWall;

    @Test
    public void testQuoridorVerticalWallLook() {
        Mockito.when(mockWall.getColor()).thenReturn(QuoridorVerticalWall.WALL_BLUE);
        QuoridorVerticalWallLook wallLook = new QuoridorVerticalWallLook(mockWall);
        assertEquals(ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[0][0]);

        Mockito.when(mockWall.getColor()).thenReturn(QuoridorVerticalWall.WALL_RED);
        wallLook.onLookChange();
        assertEquals(ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[0][0]);
    }
}
