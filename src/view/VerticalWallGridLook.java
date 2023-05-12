package view;

import boardifier.model.GridElement;
import boardifier.view.GridLook;

/**
 * The VerticalWallGridLook class represents the graphical appearance of a vertical wall grid.
 */
public class VerticalWallGridLook extends GridLook {

    /**
     * Constructs a new VerticalWallGridLook.
     * @param cellWidth the width of a cell.
     * @param cellHeight the height of a cell.
     * @param gridElement the grid element.
     */
    public VerticalWallGridLook(int cellWidth, int cellHeight, GridElement gridElement) {
        super(cellWidth, cellHeight, gridElement, -1, false);
    }

    /**
     * Creates the visual shape of the grid.
     */
    protected void createShape() {
        GridElement gridElement = (GridElement) element;
        int nbRows = gridElement.getNbRows();
        int nbCols = gridElement.getNbCols();

        for(int i=0;i<shape.length;i++) {
            for(int j=0;j<shape[0].length;j++) {
                shape[i][j] = " ";
            }
        }
    }

    /**
     * An empty method as the visual appearance of the grid does not change.
     */
    @Override
    public void onLookChange() {
        //nothing
    }
}