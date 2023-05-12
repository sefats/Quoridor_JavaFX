package view;

import boardifier.model.GridElement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IntersectionGridLookTest {

    @Mock
    private GridElement gridElement;

    @Test
    public void testCreateShape() {
        IntersectionGridLook intersectionGridLook = new IntersectionGridLook(10, 10, gridElement);

        when(gridElement.getNbRows()).thenReturn(3);
        when(gridElement.getNbCols()).thenReturn(3);

        intersectionGridLook.createShape();
    }
}
