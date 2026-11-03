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
class AIplayer {
    public AIplayer() { /* removed */ }
    // picks the move with the highest score, random if there is nothing to go on
    public Point returnBestMove() { /* removed */ }
    private static Point randomPoint() { /* removed */ }
    public int returnMin(List<Integer> list) { /* removed */ }
    public int returnMax(List<Integer> list) { /* removed */ }
    // starts a fresh search from the current board
    public void callMinimax(int depth, int turn, Board b) { /* removed */ }
    // turn 1 is the AI (X), turn 2 is the person (O). depth 0 is the real board.
    public int minimax(int depth, int turn, int alpha, int beta, Board b) { /* removed */ }
}
