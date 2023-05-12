package view;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import boardifier.view.ElementLook;
import model.QuoridorVerticalWall;
import model.Wall;

// This class is responsible for creating the visual representation of a vertical wall in the Quoridor game.
public class QuoridorVerticalWallLook extends ElementLook {

    // Constructor that takes a GameElement and creates a visual representation of a vertical wall.
    public QuoridorVerticalWallLook(GameElement element) {
        super(element, 1, 3); // Call the parent constructor with the size of the wall
        QuoridorVerticalWall wall = (QuoridorVerticalWall) element; // Cast the GameElement to QuoridorVerticalWall
        String color = ""; // Variable to store the color of the wall
        // Check the color of the wall and assign the corresponding color
        if (wall.getColor() == QuoridorVerticalWall.WALL_BLUE) {
            color = ConsoleColor.BLUE_BACKGROUND;
        }else if(wall.getColor() == QuoridorVerticalWall.WALL_RED){
            color = ConsoleColor.RED_BACKGROUND;
        }
        // Fill the shape array with the color
        for(int i=0; i < shape.length; i++){
            shape[i][0] = color + " " + ConsoleColor.RESET;
        }
    }

    // This method is called when the look of the wall changes.
    @Override
    public void onLookChange() {
        // Do nothing since a wall never changes its aspect
        QuoridorVerticalWall wall = (QuoridorVerticalWall) element; // Cast the GameElement to QuoridorVerticalWall
        String color = ""; // Variable to store the color of the wall
        // Check the color of the wall and assign the corresponding color
        if (wall.getColor() == QuoridorVerticalWall.WALL_BLUE) {
            color = ConsoleColor.BLUE_BACKGROUND;
        }else if(wall.getColor() == QuoridorVerticalWall.WALL_RED){
            color = ConsoleColor.RED_BACKGROUND;
        }
        // Fill the shape array with the color
        for(int i=0; i < shape.length; i++){
            shape[i][0] = color + " " + ConsoleColor.RESET;
        }
    }
}
