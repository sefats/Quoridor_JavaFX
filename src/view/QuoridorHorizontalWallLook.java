package view;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import boardifier.view.ElementLook;
import model.QuoridorHorizontalWall;
import model.Wall;

// This class is responsible for visually representing the horizontal walls in the Quoridor game
public class QuoridorHorizontalWallLook extends ElementLook {

    // Constructor takes a GameElement and sets its dimensions and color
    public QuoridorHorizontalWallLook(GameElement element) {
        super(element, 7, 1);  // Dimensions of the wall
        QuoridorHorizontalWall wall = (QuoridorHorizontalWall) element;  // Cast the GameElement to QuoridorHorizontalWall
        String color = "";  // Initialize color as an empty string
        if (wall.getColor() == QuoridorHorizontalWall.WALL_BLUE) {  // If the wall is blue
            color = ConsoleColor.BLUE;  // Set color to blue
        }else if(wall.getColor() == QuoridorHorizontalWall.WALL_RED){  // If the wall is red
            color = ConsoleColor.RED;  // Set color to red
        }
        for(int i=0; i < shape[0].length; i++){  // For each element in the shape array
            // Set the color of the shape array element to the wall color, plus a square character
            shape[0][i] = color + (char)9632 + ConsoleColor.RESET;
        }

    }

    // This method is invoked when the look of the wall changes
    @Override
    public void onLookChange() {
        // do nothing since a wall never change of aspect
        QuoridorHorizontalWall wall = (QuoridorHorizontalWall) element;  // Cast the GameElement to QuoridorHorizontalWall
        String color = "";  // Initialize color as an empty string
        if (wall.getColor() == QuoridorHorizontalWall.WALL_BLUE) {  // If the wall is blue
            color = ConsoleColor.BLUE;  // Set color to blue
        }else if(wall.getColor() == QuoridorHorizontalWall.WALL_RED){  // If the wall is red
            color = ConsoleColor.RED;  // Set color to red
        }
        for(int i=0; i < shape[0].length; i++){  // For each element in the shape array
            // Set the color of the shape array element to the wall color, plus a square character
            shape[0][i] = color + (char)9632 + ConsoleColor.RESET;
        }
    }
}
