
package view;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import boardifier.view.ElementLook;
import model.QuoridorHorizontalWall;
import model.QuoridorIntersection;

/**
 * The IntersectionLook class provides a visual representation of a QuoridorIntersection.
 * It extends the ElementLook class.
 */
public class IntersectionLook extends ElementLook {

    /**
     * Constructs a new IntersectionLook.
     * @param element the QuoridorIntersection element.
     */
    public IntersectionLook(GameElement element) {
        super(element, 1, 1);
        QuoridorIntersection intersection = (QuoridorIntersection) element;
        String color = "";
        char character = (char)0;
        if (intersection.getDirection() == QuoridorIntersection.horizontal) {
            character = (char)9632;
            if (intersection.getColor() == QuoridorIntersection.INTERSECTION_BLUE) {
                color = ConsoleColor.BLUE;
            }else if(intersection.getColor() == QuoridorIntersection.INTERSECTION_RED){
                color = ConsoleColor.RED;
            }
        }else if(intersection.getDirection() == QuoridorIntersection.vertical){
            character = (char)32;
            if (intersection.getColor() == QuoridorIntersection.INTERSECTION_BLUE) {
                color = ConsoleColor.BLUE_BACKGROUND;
            }else if(intersection.getColor() == QuoridorIntersection.INTERSECTION_RED){
                color = ConsoleColor.RED_BACKGROUND;
            }
        }
        shape[0][0] = color + character + ConsoleColor.RESET;

    }

    /**
     * Updates the visual representation of the QuoridorIntersection.
     * This method is called when there is a change in the intersection's look.
     */

    @Override
    public void onLookChange() {
        // do nothing since a wall never change of aspect
        QuoridorIntersection intersection = (QuoridorIntersection) element;
        String color = "";
        char character = (char)0;
        if (intersection.getDirection() == QuoridorIntersection.horizontal) {
            character = (char)9632;
            if (intersection.getColor() == QuoridorIntersection.INTERSECTION_BLUE) {
                color = ConsoleColor.BLUE;
            }else if(intersection.getColor() == QuoridorIntersection.INTERSECTION_RED){
                color = ConsoleColor.RED;
            }
        }else if(intersection.getDirection() == QuoridorIntersection.vertical){
            character = (char)32;
            if (intersection.getColor() == QuoridorIntersection.INTERSECTION_BLUE) {
                color = ConsoleColor.BLUE_BACKGROUND;
            }else if(intersection.getColor() == QuoridorIntersection.INTERSECTION_RED){
                color = ConsoleColor.RED_BACKGROUND;
            }
        }
        shape[0][0] = color + character + ConsoleColor.RESET;
    }
}
