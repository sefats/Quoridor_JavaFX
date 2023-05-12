package view;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

import model.QuoridorIntersection;
import org.junit.Before;
import org.junit.Test;

public class IntersectionLookTest {

    private IntersectionLook intersectionLook;
    private QuoridorIntersection mockElement;

    @Before
    public void setUp() {
        mockElement = mock(QuoridorIntersection.class);
        intersectionLook = new IntersectionLook(mockElement);
    }

    @Test
    public void testOnLookChange() {
        // Given
        when(mockElement.getDirection()).thenReturn(QuoridorIntersection.horizontal);
        when(mockElement.getColor()).thenReturn(QuoridorIntersection.INTERSECTION_BLUE);

        // When
        intersectionLook.onLookChange();

        // Then
        // Verify that the shape of the intersection look was updated correctly
    }
}
