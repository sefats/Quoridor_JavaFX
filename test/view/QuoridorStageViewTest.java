package view;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import boardifier.model.GameStageModel;
import model.QuoridorHorizontalWallGrid;
import model.QuoridorStageModel;
import view.HorizontalWallGridLook;
import view.QuoridorHorizontalWallLook;
import view.QuoridorStageView;

public class QuoridorStageViewTest {

    @Test
    public void testCreateLooks() {
        // Create a GameStageModel
        GameStageModel gameStageModel = mock(GameStageModel.class);

        // Create table
        int[][] horizontalWalls = new int[8][4];

        QuoridorStageView view = new QuoridorStageView("nom", gameStageModel);

    }

}
