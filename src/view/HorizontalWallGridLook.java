package view;

import boardifier.model.GridElement;
import boardifier.view.GridLook;

// Class representing the look of a horizontal wall in a grid
public class HorizontalWallGridLook extends GridLook {

    public HorizontalWallGridLook(int cellWidth, int cellHeight, GridElement gridElement) {
        super(cellWidth, cellHeight, gridElement, -1, false);
    }
    // Creates the shape of the grid element
    protected void createShape() {
        GridElement gridElement = (GridElement) element;
        // Iterates over the grid and initializes each cell with a space
        int nbRows = gridElement.getNbRows();
        int nbCols = gridElement.getNbCols();

        for(int i=0;i<shape.length;i++) {
            for(int j=0;j<shape[0].length;j++) {
                shape[i][j] = " ";
            }
        }
    }
    // Method called when the look changes. Here, we do nothing.
    @Override
    public void onLookChange() {
        //nothing
    }
}
