package view;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import boardifier.view.ElementLook;
import model.Wall;

/**
 * The WallLook class provides a visual representation of a Wall.
 * It extends the ElementLook class.
 */
public class WallLook extends ElementLook {

    /**
     * Constructs a new WallLook.
     * @param element the Wall element.
     */
    public WallLook(GameElement element) {
        super(element, 1, 3);
        Wall wall = (Wall)element;
        if (wall.getColor() == Wall.WALL_BLUE) {
            shape[0][0] = ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET;
            shape[1][0] = ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET;
            shape[2][0] = ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET;
        }
        else {
            shape[0][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
            shape[1][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
            shape[2][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
        }
    }

    /**
     * Updates the visual representation of the Wall.
     * This method is called when there is a change in the wall's look.
     */

    @Override
    public void onLookChange() {
        // do nothing since a wall never change of aspect
        /*super(element, 1, 2););
        Wall wall = (Wall)element;
        if (wall.getColor() == Wall.WALL_BLUE) {
            shape[0][0] = ConsoleColor.WHITE + ConsoleColor.BLACK_BACKGROUND + " " + ConsoleColor.RESET;
            shape[1][0] = ConsoleColor.WHITE + ConsoleColor.BLACK_BACKGROUND + " " + ConsoleColor.RESET;
        }
        else {
            shape[0][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
            shape[1][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
        }*/
    }
}
