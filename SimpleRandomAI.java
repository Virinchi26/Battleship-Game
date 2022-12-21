import java.util.Collections;
public class SimpleRandomAI extends BattleshipAI{
    public SimpleRandomAI(SelectionGrid playerGrid) {
        super(playerGrid);
        Collections.shuffle(validMoves);
    }

    //Reset
    @Override
    public void reset() {
        super.reset();
        Collections.shuffle(validMoves);
    }

    //Takes the move from the top of the list and returns it.
    @Override
    public Position selectMove() {
        Position nextMove = validMoves.get(0);
        validMoves.remove(0);
        return nextMove;
    }
}
