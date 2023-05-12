package view;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import boardifier.model.GameElement;
import model.QuoridorPawn;
import org.junit.jupiter.api.BeforeEach;

class PawnLookTest {

    @Mock
    private QuoridorPawn pawn;
    @Mock
    private GameElement element;

    private PawnLook pawnLook;

    @BeforeEach
    void setUp() {
        pawn = mock(QuoridorPawn.class);
        element = mock(GameElement.class);
        when(pawn.getPlayerID()).thenReturn(0);
        pawnLook = new PawnLook(pawn);
    }

    @Test
    void testPawnLook() {
        pawnLook.onLookChange();
        verify(pawn, times(1)).getPlayerID();
        // Add additional verification as necessary
    }
}
