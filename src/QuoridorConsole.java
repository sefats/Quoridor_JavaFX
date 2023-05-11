// import the GameException class from the boardifier.model package
import boardifier.model.GameException;

// import the View class from the boardifier.view package
import boardifier.view.View;

// import the StageFactory class from the boardifier.control package
import boardifier.control.StageFactory;

// import the Model class from the boardifier.model package
import boardifier.model.Model;

// import the QuoridorController class from the control package
import control.QuoridorController;

// The main class for the QuoridorConsole application
public class QuoridorConsole {

    // The main method that will be run when the program is executed
    public static void main(String[] args) {

        // Initialize game mode to 0
        int mode = 0;

        // Check if there is one command-line argument
        if (args.length == 1) {
            try {
                // Try parsing the first command-line argument as an integer
                mode = Integer.parseInt(args[0]);

                // If the mode is not within the expected range (0-2), reset it to 0
                if ((mode <0) || (mode>2)) mode = 0;
            }
            catch(NumberFormatException e) {
                // If the first command-line argument is not a number, reset mode to 0
                mode = 0;
            }
        }

        // Create a new instance of the Model class
        Model model = new Model();

        // Depending on the game mode, set up the players
        if (mode == 0) {
            model.addHumanPlayer("player1");
            model.addHumanPlayer("player2");
        }
        else if (mode == 1) {
            model.addHumanPlayer("player");
            model.addComputerPlayer("computer");
        }
        else if (mode == 2) {
            model.addComputerPlayer("computer1");
            model.addComputerPlayer("computer2");
        }

        // Register a new model and view with the StageFactory
        StageFactory.registerModelAndView("quoridor", "model.QuoridorStageModel", "view.QuoridorStageView");

        // Create a new instance of the View class, giving it the model
        View quoridorView = new View(model);

        // Create a new instance of the QuoridorController class, giving it the model and view
        QuoridorController control = new QuoridorController(model,quoridorView);

        // Set the first stage name of the game
        control.setFirstStageName("quoridor");

        try {
            // Start the game and enter the stage loop
            control.startGame();
            control.stageLoop();
        }
        catch(GameException e) {
            // If there is a GameException, print an error message and abort
            System.out.println("Cannot start the game. Abort");
        }
    }
}
