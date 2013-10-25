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
        for (int i = 0; i < commandSequence.length(); ++i) {
            String command = commandSequence.substring(i, i + 1);
            receiveOneCommand(command);
        }
    }

    private void receiveOneCommand(String command) {
        if (isRotation(command)) {
            rotate(command);
        } else {
            displace(command);
        }
    }

    private boolean isRotation(String command) {
        return command.equals("l") || command.equals("r");
    }

    private void displace(String command) {
        int displacement = computeDisplacement(command);
        applyDisplacement(displacement);
    }

    private void applyDisplacement(int displacement) {
        if (direction.equals("N")) {
            y += displacement;
        } else if (direction.equals("S")) {
            y -= displacement;
        } else if (direction.equals("W")) {
            x -= displacement;
        } else {
            x += displacement;
        }
    }

    private int computeDisplacement(String command) {
        int displacement = -1;

        if (command.equals("f")) {
            displacement = 1;
        }
        return displacement;
    }

    private void rotate(String command) {
        if (direction.equals("N")) {
            if (command.equals("r")) {
                direction = "E";
            } else {
                direction = "W";
            }
        } else if (direction.equals("S")) {
            if (command.equals("r")) {
                direction = "W";
            } else {
                direction = "E";
            }
        } else if (direction.equals("W")) {
            if (command.equals("r")) {
                direction = "N";
            } else {
                direction = "S";
            }
        } else {
            if (command.equals("r")) {
                direction = "S";
            } else {
                direction = "N";
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Rover other = (Rover) obj;

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }
}
