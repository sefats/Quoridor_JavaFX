package view;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import boardifier.view.ConsoleColor;
import org.junit.jupiter.api.Test;

import boardifier.model.GameElement;
import model.Wall;

public class WallLookTest {

    @Test
    public void testConstructor() {
        // Mock the GameElement object
        GameElement element = mock(Wall.class);
        when(((Wall)element).getColor()).thenReturn(Wall.WALL_BLUE);

        // Create a new WallLook object and verify its state
        WallLook wallLook = new WallLook(element);
        assertEquals(ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[0][0]);
        assertEquals(ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[1][0]);
        assertEquals(ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[2][0]);
    }

    @Test
    public void testOnLookChange() {
        // Mock the GameElement object
        GameElement element = mock(Wall.class);
        when(((Wall)element).getColor()).thenReturn(Wall.WALL_RED);

        // Create a new WallLook object and call onLookChange
        WallLook wallLook = new WallLook(element);
        wallLook.onLookChange();

        // Verify that the state of the WallLook object has not changed
        assertEquals(ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[0][0]);
        assertEquals(ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[1][0]);
        assertEquals(ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET, wallLook.shape[2][0]);
    }
}
