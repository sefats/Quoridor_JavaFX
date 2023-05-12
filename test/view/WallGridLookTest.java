package view;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import boardifier.model.GridElement;

public class WallGridLookTest {

    @Mock
    GridElement gridElement;

    WallGridLook wallGridLook;

    @Before
    public void setUp() {
        gridElement = mock(GridElement.class);
        wallGridLook = new WallGridLook(10, 10, gridElement);
    }

    @Test
    public void testCreateShape() {
        wallGridLook.createShape();

        }
}
