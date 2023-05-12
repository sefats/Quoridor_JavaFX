package view;

import boardifier.model.GameElement;
import boardifier.view.ConsoleColor;
import boardifier.view.ElementLook;
import model.QuoridorPawn;
import model.Wall;

public class PawnLook extends ElementLook {

    public PawnLook(GameElement element) {
        super(element, 1, 1);
        QuoridorPawn pawn = (QuoridorPawn) element;
        if (pawn.getPlayerID() == 0) {
            shape[0][0] = ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET;
        }else{
            shape[0][0] = ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
        }
    }

    @Override
    public void onLookChange() {
        // do nothing since a wall never change of aspect
        /*super(element, 1, 2);
        Wall wall = (Wall)element;
        if (wall.getColor() == Wall.WALL_BLUE) {
            shape[0][0] = ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET;
            shape[1][0] = ConsoleColor.WHITE + ConsoleColor.BLUE_BACKGROUND + " " + ConsoleColor.RESET;
        }
        else {
            shape[0][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
            shape[1][0] = ConsoleColor.BLACK + ConsoleColor.RED_BACKGROUND + " " + ConsoleColor.RESET;
        }*/
    }
}
