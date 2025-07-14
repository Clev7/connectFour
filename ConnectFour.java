
public class ConnectFour<T, Move> extends TurnBasedGame<T, Move> {
    private static final int NUM_PLAYERS = 2;
    private char[][] gameState;

    private static final int BOARD_SIZE = 7;

    private GameResult gameResult;
    private T winner;
    private T turn;

    public ConnectFour() {
        this.gameState = new char[BOARD_SIZE][BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.gameState[i][j] = 'E';
            }
        }

    }

    @Override
    public GameResult getGameResult() {

    }

    @Override
    public T getWinner() {

    }

    @Override
    public T getTurn() {
        return turn;
    }

    @Override
    public void makeMove(Move m) {
    }

    public int getNumPlayers() {
        return NUM_PLAYERS;
    }
}
