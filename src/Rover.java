
public class Rover {

    private String direction;
    private int y;
    private int x;
    
    public Rover(int x, int y, String direction) {
        this.direction = direction;
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void receive(String commandSequence) {
        for(int i = 0; i<commandSequence.length(); ++i) {
            String command = commandSequence.substring(i, i+1);    
            receiveOneCommand(command);
        }
    }

    private void receiveOneCommand(String command) {
        if(isRotation(command)) {
            rotate(command);
        } else {
            displace(command);    
        }
    }

    private boolean isRotation(String commandSequence) {
        return commandSequence.equals("l") || commandSequence.equals("r");
    }

    private void displace(String commandSequence) {
        int displacement = computeDisplacement(commandSequence);
        applyDisplacement(displacement);
    }

    private void applyDisplacement(int displacement) {
        if(direction.equals("N")) {
            y += displacement;
        } else if(direction.equals("S")) {
            y -= displacement;
        } else if(direction.equals("W")) {
            x += displacement;
        } else {
            x -= displacement;
        }
    }

    private int computeDisplacement(String commandSequence) {
        int displacement = -1;
        
        if(commandSequence.equals("f")) {
            displacement = 1;
        }
        return displacement;
    }

    private void rotate(String commandSequence) {
        if(direction.equals("N")) {
            if(commandSequence.equals("l")) {
               direction = "E";
            }
            else {
                direction = "W";
            }
        } else if(direction.equals("S")) {
            if(commandSequence.equals("l")) {
                direction = "W";
            } else {
                direction = "E";
            }
        } else if(direction.equals("W")) {
            if(commandSequence.equals("l")) {
                direction = "N";
            } else {
                direction = "S";
            }
        } else {
            if(commandSequence.equals("l")) {
                direction = "S";
            } else {
                direction = "N";
            }
        }
    }
}
