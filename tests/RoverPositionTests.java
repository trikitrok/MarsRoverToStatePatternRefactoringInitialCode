import static org.junit.Assert.*;

import org.junit.Test;

public class RoverPositionTests {
    @Test
    public void facingNorthMoveForward() {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("f");
        
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals("N", rover.getDirection());
    }
    
    @Test
    public void facingNorthMoveBackward() {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("b");
        
        assertEquals(0, rover.getX());
        assertEquals(-1, rover.getY());
        assertEquals("N", rover.getDirection());
    }
    
    @Test
    public void facingSouthMoveForward() {
        Rover rover = new Rover(0, 0, "S");
        
        rover.receive("f");
        
        assertEquals(0, rover.getX());
        assertEquals(-1, rover.getY());
        assertEquals("S", rover.getDirection());
    }
    
    @Test
    public void facingSouthMoveBackward() {
        Rover rover = new Rover(0, 0, "S");
        
        rover.receive("b");
        
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals("S", rover.getDirection());
    }
    
    @Test
    public void facingWestMoveForward() {
        Rover rover = new Rover(0, 0, "W");
        
        rover.receive("f");
        
        assertEquals(1, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("W", rover.getDirection());
    }
    
    @Test
    public void facingWestMoveBackward() {
        Rover rover = new Rover(0, 0, "W");
        
        rover.receive("b");
        
        assertEquals(-1, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("W", rover.getDirection());
    }
    
    @Test
    public void facingEastMoveForward() {
        Rover rover = new Rover(0, 0, "E");
        
        rover.receive("f");
        
        assertEquals(-1, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("E", rover.getDirection());
    }
    
    @Test
    public void facingEastMoveBackward() {
        Rover rover = new Rover(0, 0, "E");
        
        rover.receive("b");
        
        assertEquals(1, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("E", rover.getDirection());
    }
}
