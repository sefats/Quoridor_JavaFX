package model;

import boardifier.model.ElementTypes;
import boardifier.model.GameElement;
import boardifier.model.GameStageModel;
import boardifier.model.animation.AnimationStep;
import boardifier.view.GridGeometry;

/**
 * The Wall class represents a wall in the game.
 * It is a type of GameElement and has a number and a color.
 */
public class Wall extends GameElement {

    private int number;
    private int color;
    public static int WALL_BLUE = 0;
    public static int WALL_RED = 1;

    /**
     * Constructs a new Wall.
     * @param number the number of the wall.
     * @param color the color of the wall.
     * @param gameStageModel the game stage model.
     */
    public Wall(int number, int color, GameStageModel gameStageModel) {
        super(gameStageModel);
        this.number = number;
        this.color = color;
    }

    /**
     * Returns the number of the wall.
     * @return the number of the wall.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns the color of the wall.
     * @return the color of the wall.
     */
    public int getColor() {
        return color;
    }
}
