import static org.junit.Assert.*;

import org.junit.Test;


public class RoverRotationTests {
    @Test
    public void facingNorthRotateLeft()  {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("l");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("E", rover.getDirection());
    }
    
    @Test
    public void facingNorthRotateRight()  {
        Rover rover = new Rover(0, 0, "N");
        
        rover.receive("r");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("W", rover.getDirection());
    }
    
    @Test
    public void facingSouthRotateLeft()  {
        Rover rover = new Rover(0, 0, "S");
        
        rover.receive("l");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("W", rover.getDirection());
    }
    
    @Test
    public void facingSouthRotateRight()  {
        Rover rover = new Rover(0, 0, "S");
        
        rover.receive("r");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("E", rover.getDirection());
    }
    
    @Test
    public void facingWestRotateLeft()  {
        Rover rover = new Rover(0, 0, "W");
        
        rover.receive("l");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("N", rover.getDirection());
    }
    
    @Test
    public void facingWestRotateRight()  {
        Rover rover = new Rover(0, 0, "W");
        
        rover.receive("r");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("S", rover.getDirection());
    }
    
    @Test
    public void facingEastRotateLeft()  {
        Rover rover = new Rover(0, 0, "E");
        
        rover.receive("l");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("S", rover.getDirection());
    }
    
    @Test
    public void facingEastRotateRight()  {
        Rover rover = new Rover(0, 0, "E");
        
        rover.receive("r");
        
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("N", rover.getDirection());
    }
}
