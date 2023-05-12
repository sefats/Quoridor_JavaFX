package control;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import boardifier.model.Model;
import boardifier.model.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuoridorControllerTest {

    private QuoridorController controller;

    @Mock
    private Model model;



    @Test
    public void testStageLoop() throws IOException {
        // Given
        BufferedReader consoleIn = mock(BufferedReader.class);
        when(consoleIn.readLine()).thenReturn("move 1 to a5").thenReturn("move 2 to h5");

        when(model.isEndStage()).thenReturn(false, false, true);

        // When
        controller.stageLoop();

        // Then
        verify(model, times(2)).setNextPlayer();
        verify(model, times(1)).isEndStage();
    }

    @Test
    public void testNextPlayer() throws IOException {
        // Given
        BufferedReader consoleIn = mock(BufferedReader.class);
        when(consoleIn.readLine()).thenReturn("move 1 to a5");

        when(model.isEndStage()).thenReturn(false);

        // When
        controller.nextPlayer();

        // Then
        verify(model, times(1)).setNextPlayer();
        verify(consoleIn, times(1)).readLine();
    }
}
