package boardifier.control;

import boardifier.model.*;
import boardifier.model.action.ActionList;
import boardifier.model.action.GameAction;
import java.util.List;

/**
 * The ActionPlayer class is responsible for executing a list of actions.
 * It can operate with a predefined list of actions or use a Decider to generate actions.
 */
public class ActionPlayer{

    protected Controller control;
    protected Model model;
    protected Decider decider;
    protected ActionList actions;
    protected ActionList preActions;

    /**
     * Constructs an ActionPlayer with a Decider and optional pre-actions.
     * @param model the game model.
     * @param control the game controller.
     * @param decider the decision-making entity.
     * @param preActions a list of actions to be executed before the decider's actions.
     */
    public ActionPlayer(Model model, Controller control, Decider decider, ActionList preActions) {
        this.model = model;
        this.control = control;
        this.actions = null;
        this.decider = decider;
        this.preActions = preActions;
    }

    /**
     * Constructs an ActionPlayer with a predefined list of actions.
     * @param model the game model.
     * @param control the game controller.
     * @param actions a list of actions to be executed.
     */
    public ActionPlayer(Model model, Controller control, ActionList actions) {
        this.model = model;
        this.control = control;
        this.actions = actions;
        this.decider = null;
        this.preActions = null;
    }

    /**
     * Starts the execution of actions.
     */
    public void start() {
        // first disable event capture
        model.setCaptureEvents(false);

        // execute pre-actions if present
        if (preActions != null) {
            playActions(preActions);
        }
        // if there is a decider, decide what to do
        if (decider != null) {
            actions = decider.decide();
        }

        // execute actions
        playActions(actions);

        // enable event capture
        model.setCaptureEvents(true);
    }

    /**
     * Executes a list of actions.
     * @param actions the list of actions to be executed.
     */
    private void playActions(ActionList actions) {
        // loop over all action packs
        int idPack = 0;
        for(List<GameAction> actionPack : actions.getActions()) {
            System.out.println("playing pack "+idPack);
            // step 4 : do the real actions, based on action.type
            for(GameAction action : actionPack) {
                action.execute();
            }
            // last enable event capture
            idPack++;
        }
    }
}
