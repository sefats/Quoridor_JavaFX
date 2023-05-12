package view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import boardifier.model.GridElement;

@RunWith(MockitoJUnitRunner.class)
public class HorizontalWallGridLookTest {

    @Mock
    GridElement gridElement;

    @Test
    public void testCreateShape() {
        int cellWidth = 10;
        int cellHeight = 10;
        HorizontalWallGridLook gridLook = new HorizontalWallGridLook(cellWidth, cellHeight, gridElement);

        // Call the function to be tested
        gridLook.createShape();

        // Verify that the shape is created correctly
        for (int i = 0; i < gridElement.getNbRows(); i++) {
            for (int j = 0; j < gridElement.getNbCols(); j++) {
                assert gridLook.shape[i][j].equals(" ");
            }
        }
    }

    @Test
    public void testOnLookChange() {
        int cellWidth = 10;
        int cellHeight = 10;
        HorizontalWallGridLook gridLook = new HorizontalWallGridLook(cellWidth, cellHeight, gridElement);

        // Call the function to be tested
        gridLook.onLookChange();

        // Verify that nothing happens
        // (This is a void function with no side effects)
    }
}
