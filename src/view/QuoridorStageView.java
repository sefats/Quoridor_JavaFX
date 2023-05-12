package view;

import boardifier.model.GameStageModel;
import boardifier.view.GameStageView;
import boardifier.view.GridLook;
import model.QuoridorHorizontalWall;
import model.QuoridorStageModel;

// This class is responsible for creating the visual representation of the Quoridor game
public class QuoridorStageView extends GameStageView {
    // Constructor takes a name and a GameStageModel
    public QuoridorStageView(String name, GameStageModel gameStageModel) {
        super(name, gameStageModel);  // Call the parent constructor
    }

    // This method is responsible for creating the different looks of the game elements
    @Override
    public void createLooks() {
        QuoridorStageModel model = (QuoridorStageModel)gameStageModel;  // Cast the GameStageModel to QuoridorStageModel

        // Create looks for horizontal and vertical walls, intersections, board, wall pots, and pawns
        addLook(new HorizontalWallGridLook(8, 4, model.getHorizontalWallGrid()));
        addLook(new VerticalWallGridLook(8, 4, model.getVerticalWallGrid()));
        addLook(new IntersectionGridLook(8, 4, model.getIntersectionGrid()));
        addLook(new GridLook(8, 4, model.getBoard(), -1, true));
        addLook(new WallPotLook(8,3, model.getBluePot()));
        addLook(new WallPotLook(8, 3, model.getRedPot()));
        addLook(new PawnLook(model.getBluePawn()));
        addLook(new PawnLook(model.getRedPawn()));

        // Create looks for individual walls
        for(int i=0;i<10;i++) {
            addLook(new WallLook(model.getBlueWalls()[i]));
            addLook(new WallLook(model.getRedWalls()[i]));
        }

        // Create looks for horizontal walls
        for(int i=0;i<model.getHorizontalWalls().length;i++) {
            for(int j=0;j<model.getHorizontalWalls()[0].length;j++) {
                addLook(new QuoridorHorizontalWallLook(model.getHorizontalWalls()[i][j]));
            }
        }

        // Create looks for vertical walls
        for(int i=0;i<model.getVerticalWalls().length;i++) {
            for(int j=0;j<model.getVerticalWalls()[0].length;j++) {
                addLook(new QuoridorVerticalWallLook(model.getVerticalWalls()[i][j]));
            }
        }

        // Create looks for intersections
        for(int i=0;i<model.getIntersections().length;i++) {
            for(int j=0;j<model.getIntersections()[0].length;j++) {
                addLook(new IntersectionLook(model.getIntersections()[i][j]));
            }
        }
    }

    // This method sets the look of a horizontal wall
    public void setHorizontalWallLook(QuoridorHorizontalWall horizontalWall){
        addLook(new QuoridorHorizontalWallLook(horizontalWall));
    }
}
