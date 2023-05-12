package model;

import boardifier.model.Model;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;

public class QuoridorStageModelUnitTest {
    Model model;
    QuoridorStageModel quoridorStageModel;
    @BeforeEach
    public void setUp(){
        model = mock(Model.class);
        quoridorStageModel = new QuoridorStageModel("model", model);

    }

}