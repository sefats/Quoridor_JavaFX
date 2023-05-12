package view;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import boardifier.model.GridElement;

@RunWith(MockitoJUnitRunner.class)
public class VerticalWallGridLookTest {

    @Mock
    private GridElement gridElementMock;

    @Test
    public void testCreateShape() {
        // Given
        int cellWidth = 10;
        int cellHeight = 10;
        int nbRows = 5;
        int nbCols = 5;
        String[][] expectedShape = new String[nbRows][nbCols];
        for (int i = 0; i < expectedShape.length; i++) {
            for (int j = 0; j < expectedShape[0].length; j++) {
                expectedShape[i][j] = " ";
            }
        }
        VerticalWallGridLook gridLook = new VerticalWallGridLook(cellWidth, cellHeight, gridElementMock);
        when(gridElementMock.getNbRows()).thenReturn(nbRows);
        when(gridElementMock.getNbCols()).thenReturn(nbCols);

        // When
        gridLook.createShape();
    }
}
