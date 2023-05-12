package control;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import boardifier.control.Controller;
import boardifier.model.Model;
import boardifier.model.action.ActionList;

import model.QuoridorBoard;
import model.QuoridorWallPot;
import model.QuoridorStageModel;
import model.Wall;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class QuoridorDeciderTest {

    @Test
    public void decideTest() {
        // Create mock objects
        Model model = Mockito.mock(Model.class);
        Controller control = Mockito.mock(Controller.class);
        QuoridorStageModel stage = Mockito.mock(QuoridorStageModel.class);
        QuoridorBoard board = Mockito.mock(QuoridorBoard.class);
        QuoridorWallPot pot = Mockito.mock(QuoridorWallPot.class);
        Wall wall = Mockito.mock(Wall.class);

        // Set up mock objects
        Mockito.when(model.getGameStage()).thenReturn(stage);
        Mockito.when(stage.getBoard()).thenReturn(board);
        Mockito.when(model.getIdPlayer()).thenReturn(Wall.WALL_BLUE);
        Mockito.when(stage.getBluePot()).thenReturn(pot);
        Mockito.when(pot.getElement(Mockito.anyInt(), Mockito.anyInt())).thenReturn(wall);

        // Create list of valid cells
        List<Point> validCells = new ArrayList<Point>();
        validCells.add(new Point(1, 2));
        validCells.add(new Point(3, 4));

        // Set up mock behavior for board and wall objects
        Mockito.when(board.computeValidCells(Mockito.anyInt())).thenReturn(validCells);
        Mockito.when(wall.getNumber()).thenReturn(0);

        }
}
