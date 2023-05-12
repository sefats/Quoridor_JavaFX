package view;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

import boardifier.model.GridElement;
import org.junit.Test;

public class WallPotLookTest {

    @Test
    public void testCreateShape() {
        // Mock GridElement
        GridElement gridElement = mock(GridElement.class);
        when(gridElement.getNbRows()).thenReturn(2);
        when(gridElement.getNbCols()).thenReturn(2);

        // Create WallPotLook
        WallPotLook wallPotLook = new WallPotLook(2, 2, gridElement);

        // Call createShape()
        wallPotLook.createShape();

        // Verify that the expected shape has been created
        String[][] expectedShape = {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {"", "", " ", " "},
                {"", "", " ", " "}
        };
    }
}
