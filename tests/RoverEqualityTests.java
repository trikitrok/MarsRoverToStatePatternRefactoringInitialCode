import static org.junit.Assert.*;

import org.junit.Test;

public class RoverEqualityTests {
    @Test
    public void equalRovers() {
        assertEquals(new Rover(1, 1, "N"), new Rover(1, 1, "N"));
    }

    @Test
    public void notEqualRovers() {
        assertNotSame(new Rover(1, 1, "N"), new Rover(1, 1, "S"));
        assertNotSame(new Rover(1, 1, "N"), new Rover(1, 2, "N"));
        assertNotSame(new Rover(1, 1, "N"), new Rover(0, 1, "N"));
    }
}
