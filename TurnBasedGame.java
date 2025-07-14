public abstract class TurnBasedGame<T, Move> {
    enum GameResult {
        NOT_STARTED,
        IN_PROGRESS,
        DRAW,
        WON
    }

    protected int winner;
    protected int turn;

    protected abstract int getNumPlayers();
    protected abstract GameResult getGameResult();
    protected abstract T getWinner();
    protected abstract T getTurn();
    protected abstract void makeMove(Move m);
}
