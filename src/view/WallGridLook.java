package view;

import boardifier.model.GameElement;
import boardifier.model.GridElement;
import boardifier.view.GridLook;
import model.*;
import model.QuoridorStageModel;

import java.awt.*;

/**
 * The WallGridLook class provides a visual representation of a grid containing walls.
 * It extends the GridLook class.
 */
public class WallGridLook extends GridLook {

    /**
     * Constructs a new WallGridLook.
     * @param cellWidth the width of each cell.
     * @param cellHeight the height of each cell.
     * @param gridElement the GridElement representing the grid.
     */
    public WallGridLook(int cellWidth, int cellHeight, GridElement gridElement) {
        super(cellWidth, cellHeight, gridElement, -1, false);
    }

    /**
     * Creates the shape of the wall grid.
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
        /*for(int i=0; i*2 < nbRows; i++){
            for(int j=0; j*2 < nbCols; j++){
                shape[i*2*cellHeight+1][j*2*cellWidth+5] = "\u2554";
            }
        }
        for(int i=0; i*2 < nbRows; i++){
            for(int j=0; j < shape[0].length; j++){
                shape[i*2*cellHeight+2][j] = "B";
            }
        }*/
        /*for(int i=0;i<nbRows;i++) {
            for(int j=0;j<nbCols;j++) {
                //top-left corner
                shape[i*cellHeight][j*cellWidth] = "\u2554";
                // top-right corner
                shape[i*cellHeight][(j+1)*cellWidth] = "\u2557";
                //bottom-left corner
                shape[(i+1)*cellHeight][j*cellWidth] = "\u255A";
                // bottom-right corner
                shape[(i+1)*cellHeight][(j+1)*cellWidth] = "\u255D";

                for(int k=1;k<cellWidth;k++) {
                    shape[i*cellHeight][j*cellWidth+k] = "\u2550";
                    shape[(i+1)*cellHeight][j*cellWidth+k] = "\u2550";
                }
                // draw left & righ vertical lines
                for(int k=1;k<cellHeight;k++) {
                    shape[i*cellHeight+k][j*cellWidth] = "\u2551";
                    shape[i*cellHeight+k][(j+1)*cellWidth] = "\u2551";
                }
            }
        }
        // change intersections on first & last hori. border
        for (int j = 1; j < nbCols; j++) {
            shape[0][j*cellWidth] = "\u2566";
            shape[nbRows*cellHeight][j*cellWidth] = "\u2569";
        }
        // change intersections on first & last vert. border
        for (int i = 1; i < nbRows; i++) {
            shape[i*cellHeight][0] = "\u2560";
            shape[i*cellHeight][nbCols*cellWidth] = "\u2563";
        }
        // change intersections within
        for (int i = 1; i < nbRows; i++) {
            for (int j = 1; j < nbCols; j++) {
                shape[i*cellHeight][j*cellWidth] = "\u256C";
            }
        }*/

        /*for(int i=0; i < nbRows; i++){
            for(int j=0; j < shape[0].length; j++){
                //if(!(i%2 == 0 && j == 1)){
                    shape[i][j] = " ";
                //}
            }
        }*/
        /*for(int i=0; i < shape.length; i=i+2){
            shape[i][shape[0].length-1] = "\n\n\n";
        }*/



        /*int[][] VerticalWall = new int[9][8];
        int[][] HorizontalWall = new int[8][9];

        for(int i=0; i < HorizontalWall.length ; i++){
            for(int j=0; j < HorizontalWall[i].length ; j++){
                if(Math.random() < 0.5){
                    HorizontalWall[i][j] = 1;
                }else{
                    HorizontalWall[i][j] = 0;
                }
            }
        }
        for(int i=0; i < VerticalWall.length ; i++){
            for(int j=0; j < VerticalWall[i].length ; j++){
                if(Math.random() < 0.5){
                    VerticalWall[i][j] = 1;
                }else{
                    VerticalWall[i][j] = 0;
                }
            }
        }

        for(int i=0; i < VerticalWall.length; i++){
            for(int j=0; j < VerticalWall[0].length; j++){
                if(VerticalWall[i][j] == 1){
                    shape[i*2+1][j*4+4] = "\u001B[32m" + (char)9608 + "\u001B[0m";
                }
            }
        }

        for(int i=0; i < HorizontalWall.length; i++){
            for(int j=0; j < HorizontalWall[0].length; j++){
                if(HorizontalWall[i][j] == 1){
                    shape[i*2+2][j*4+1] = "\u001B[32m" + (char)9632 + "\u001B[0m";
                    shape[i*2+2][j*4+2] = "\u001B[32m" + (char)9632 + "\u001B[0m";
                    shape[i*2+2][j*4+3] = "\u001B[32m" + (char)9632 + "\u001B[0m";
                }
            }
        }

        for(int i=0; i < HorizontalWall.length; i++){
            for(int j=0; j < VerticalWall[0].length; j++){
                if(HorizontalWall[i][j] == 1 && HorizontalWall[i][j+1] == 1 && VerticalWall[i][j] == 1 && VerticalWall[i+1][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u256C" + "\u001B[0m";
                }else if(HorizontalWall[i][j+1] == 1 && VerticalWall[i][j] == 1 && VerticalWall[i+1][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2560" + "\u001B[0m";
                }else if(HorizontalWall[i][j] == 1 && VerticalWall[i][j] == 1 && VerticalWall[i+1][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2563" + "\u001B[0m";
                }else if(HorizontalWall[i][j] == 1 && HorizontalWall[i][j+1] == 1 && VerticalWall[i+1][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2566" + "\u001B[0m";
                }else if(HorizontalWall[i][j] == 1 && HorizontalWall[i][j+1] == 1 && VerticalWall[i][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2569" + "\u001B[0m";
                }else if(HorizontalWall[i][j] == 1 && HorizontalWall[i][j+1] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2550" + "\u001B[0m";
                }else if(VerticalWall[i][j] == 1 && VerticalWall[i+1][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2551" + "\u001B[0m";
                }else if(VerticalWall[i][j] == 1 && HorizontalWall[i][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u255D" + "\u001B[0m";
                }else if(VerticalWall[i][j] == 1 && HorizontalWall[i][j+1] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u255A" + "\u001B[0m";
                }else if(VerticalWall[i+1][j] == 1 && HorizontalWall[i][j] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2557" + "\u001B[0m";
                }else if(VerticalWall[i+1][j] == 1 && HorizontalWall[i][j+1] == 1){
                    shape[i*2+2][j*4+4] = "\u001B[32m" + "\u2554" + "\u001B[0m";
                }
            }
        }*/
        //update();
    }

    /**
     * Updates the visual representation of the WallGridLook.
     * This method is called when there is a change in the grid's look.
     */

    @Override
    public void onLookChange() {
        //nothing
    }
}
