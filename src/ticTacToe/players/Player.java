package ticTacToe.players;

import ticTacToe.game.Board;
import java.util.Random;

/**
 * Created by Jan Brusch on 27.05.2015.
 */
public abstract class Player {

    private byte playerNumber;
    private Random r;

    public Player(byte playerNumber) {
        this.r = new Random();
        this.playerNumber = playerNumber;
    }

    @Override
    public String toString() {
        return "Player" + playerNumber;
    }

    public byte getPlayerNumber() {
        return playerNumber;
    }

    public int getNextMove(int maxLegalMoves) {
        return this.r.nextInt(maxLegalMoves);
    }

    public abstract void makeMove(Board board);
}