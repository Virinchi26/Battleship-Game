import java.awt.*;

public class Marker extends Rectangle {
    //The colour to show when a ship is located at this marker.
    private final Color HIT_COLOUR = new Color(219, 23, 23, 180);
    //The colour to show when there is no ship at this marker.
    private final Color MISS_COLOUR = new Color(26, 26, 97, 180);
    //Padding around the edges of the filled rectangle to make it a little smaller.
    private final int PADDING = 3;
    //When true the marker will be painted.
    private boolean showMarker;
    //Changes the colour used for drawing.
    private Ship shipAtMarker;

// x&y- co-ordinate
    public Marker(int x, int y, int width, int height) {
        super(x, y, width, height);
        reset();
    }

    // Reset
    public void reset() {
        shipAtMarker = null;
        showMarker = false;
    }

    // Not previously marked then destroy
    public void mark() {
        if(!showMarker && isShip()) {
            shipAtMarker.destroySection();
        }
        showMarker = true;
    }

    // if ship is already present
    public boolean isMarked() {
        return showMarker;
    }

    //Sets the ship to the specified reference. Changes the colour use
    public void setAsShip(Ship ship) {
        this.shipAtMarker = ship;
    }

    //Gets if this marker has an associated Ship.
    public boolean isShip() {
        return shipAtMarker != null;
    }

    //Gets the associated ship if there is one, otherwise it will be null.
    public Ship getAssociatedShip() {
        return shipAtMarker;
    }

    public void paint(Graphics g) {
        if(!showMarker) return;

        g.setColor(isShip() ? HIT_COLOUR : MISS_COLOUR);
        g.fillRect(position.x+PADDING+1, position.y+PADDING+1, width-PADDING*2, height-PADDING*2);
    }
}
