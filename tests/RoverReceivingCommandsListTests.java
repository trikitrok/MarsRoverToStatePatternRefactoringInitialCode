import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverReceivingCommandsListTests {
    @Test
    public void noCommands() {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("N", rover.getDirection());
    }
    
    @Test
    public void twoCommands() {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("lf");
        
        assertEquals(-1, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("E", rover.getDirection());
    }
    
    
    @Test
    public void manyCommands() {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("ffrbbrfflff");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("W", rover.getDirection());
    }
}
