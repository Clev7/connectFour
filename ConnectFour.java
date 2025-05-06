import java.io.*;
import java.util.*;

public class ConnectFour extends TurnBasedGame {
    private char[][] gameState;
    private Turn turn;

    private static final BOARD_SIZE = 7;

    public ConnectFour() {
        this.gameState = new char[BOARD_SIZE][BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.gameState[i][j] = 'E';
            }
        }

        turn = Turn.P1;
    }

    public static void main(String[] args) {
    }
}
