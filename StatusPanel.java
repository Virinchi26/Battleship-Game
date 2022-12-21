import java.awt.*;
public class StatusPanel extends Rectangle{
    //The font to use for drawing both of the messages.

    private final Font font = new Font("Arial", Font.BOLD, 20);
    //Message to show on the top line during ship placement.

    private final String placingShipLine1 = "Place your Ships below!";
    //Message to show on the bottom line during ship placement.

    private final String placingShipLine2 = "Z to rotate.";
    //Message to show on the top line when the game is lost.

    private final String gameOverLossLine = "Game Over! You Lost :(";
    //Message to show on the top line when the game is won.

    private final String gameOverWinLine = "Congratulations!!! You won!";
    //Message to show on the bottom line when the game is won or lost.

    private final String gameOverBottomLine = "Press R to restart.";

    //The current message to display on the top line.
    private String topLine;
    //The current message to display on the bottom line.

    private String bottomLine;

    //the status panel to be ready
    public StatusPanel(Position position, int width, int height) {
        super(position, width, height);
        reset();
    }

    // Reset
    public void reset() {
        topLine = placingShipLine1;
        bottomLine = placingShipLine2;
    }

//message to display
    public void showGameOver(boolean playerWon) {
        topLine = (playerWon) ? gameOverWinLine : gameOverLossLine;
        bottomLine = gameOverBottomLine;
    }
//message to display
    public void setTopLine(String message) {
        topLine = message;
    }

    //message to display
    public void setBottomLine(String message) {
        bottomLine = message;
    }

    //gray background with black text
    public void paint(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(position.x, position.y, width, height);
        g.setColor(Color.BLACK);
        g.setFont(font);
        int strWidth = g.getFontMetrics().stringWidth(topLine);
        g.drawString(topLine, position.x+width/2-strWidth/2, position.y+20);
        strWidth = g.getFontMetrics().stringWidth(bottomLine);
        g.drawString(bottomLine, position.x+width/2-strWidth/2, position.y+40);
    }
}
