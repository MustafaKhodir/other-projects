// Outline only. The full code is private.
// Function names, structure and comments are shown. The working logic is removed.
// Copyright 2026 Mustafa Khodir. All rights reserved.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// The computer player. It searches the game tree with minimax and alpha
// beta pruning, and once the search gets deeper than 6 moves it stops and
// scores the board with a heuristic instead, because a full search of a
// 5 by 5 board takes too long.
//
// A finished game scores 1 for an X win, -1 for an O win and 0 for a draw.
// When the search stops early the heuristic score from Board is used
// instead, and that can be much bigger than 1 either way. The AI is X, so
// it picks the move with the highest score.
class AIplayer {
    List<Point> availablePoints;
    List<PointsAndScores> rootsChildrenScores;   // every possible move from the current board, with its score
    static final int MAX_DEPTH = 6;

    // Nothing to set up, the scores list is made fresh for every search
    public AIplayer() { throw new UnsupportedOperationException("removed"); }

    // Picks the move with the highest score. If no move was picked it falls
    // back to a random square.
    public Point returnBestMove() { throw new UnsupportedOperationException("removed"); }

    // Any square on the board, picked at random
    private static Point randomPoint() { throw new UnsupportedOperationException("removed"); }

    // Smallest score in the list, the best result for O
    public int returnMin(List<Integer> list) { throw new UnsupportedOperationException("removed"); }

    // Largest score in the list, the best result for X
    public int returnMax(List<Integer> list) { throw new UnsupportedOperationException("removed"); }

    // Starts a fresh search from the current board
    public void callMinimax(int depth, int turn, Board b) { throw new UnsupportedOperationException("removed"); }

    // Turn 1 is the AI (X) and turn 2 is the person (O). Depth 0 is the real board.
    // Tries every free square in turn, scores the board that follows, then
    // undoes the move. X keeps the highest score and O keeps the lowest.
    // alpha is the best score X is already sure of, beta the best for O.
    public int minimax(int depth, int turn, int alpha, int beta, Board b) { throw new UnsupportedOperationException("removed"); }
}
