package view;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import model.QuoridorHorizontalWall;
import model.Wall;

public class QuoridorHorizontalWallLookTest {

    @Mock private GameElement elementMock;

    private QuoridorHorizontalWallLook wallLook;

    @Before
    public void setup() {
        elementMock = mock(QuoridorHorizontalWall.class);
        wallLook = new QuoridorHorizontalWallLook(elementMock);
    }

    @Test
    public void testOnLookChange() {
        // Given
        QuoridorHorizontalWall wall = (QuoridorHorizontalWall) elementMock;
        when(wall.getColor()).thenReturn(QuoridorHorizontalWall.WALL_BLUE);

        // When
        wallLook.onLookChange();

        // Then
        String expectedColor = ConsoleColor.BLUE;
        String expectedShape = expectedColor + (char)9632 + ConsoleColor.RESET;
    }
}
