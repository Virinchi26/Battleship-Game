
public class Rectangle {
    //The top left corner of the Rectangle.
     
    protected Position position;
    //Width of the Rectangle.
     
    protected int width;
    //Height of the Rectangle.
     
    protected int height;

    //Creates the new Rectangle
    public Rectangle(Position position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height) {
        this(new Position(x,y),width,height);
    }

    //height of the Rectangle.
    public int getHeight() {
        return height;
    }

    //width of the Rectangle.
    public int getWidth() {
        return width;
    }

    //Gets the top left corner of the Rectangle.
    public Position getPosition() {
        return position;
    }

    //Tests if the Position is inside the grid.
    public boolean isPositionInside(Position targetPosition) {
        return targetPosition.x >= position.x && targetPosition.y >= position.y
                && targetPosition.x < position.x + width && targetPosition.y < position.y + height;
    }
}
