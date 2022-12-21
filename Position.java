
public class Position {
    //Down moving unit vector.
     
    public static final Position DOWN = new Position(0,1);
    //Up moving unit vector.
     
    public static final Position UP = new Position(0,-1);
    //Left moving unit vector.
     
    public static final Position LEFT = new Position(-1,0);
    //Right moving unit vector.
     
    public static final Position RIGHT = new Position(1,0);
    //Zero unit vector.
     
    public static final Position ZERO = new Position(0,0);

    //X coordinate.
     
    public int x;
    /**
     * Y coordinate.
     */
    public int y;

    //Sets the value of Position.
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //create a new Position
    public Position(Position positionToCopy) {
        this.x = positionToCopy.x;
        this.y = positionToCopy.y;
    }

    //Sets the Position to the specified x and y coordinate.
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Updates this position
    public void add(Position otherPosition) {
        this.x += otherPosition.x;
        this.y += otherPosition.y;
    }

    //Calculate the distance
    public double distanceTo(Position otherPosition) {
        return Math.sqrt(Math.pow(x-otherPosition.x,2)+Math.pow(y-otherPosition.y,2));
    }
    public void multiply(int amount) {
        x *= amount;
        y *= amount;
    }

    //Updates this position
    public void subtract(Position otherPosition) {
        this.x -= otherPosition.x;
        this.y -= otherPosition.y;
    }

    // Comparing
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    // gets string of position
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
