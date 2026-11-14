// Outline only. The full code is private.
// Function names, structure and comments are shown. The working logic is removed.
// Copyright 2026 Mustafa Khodir. All rights reserved.

import java.util.*;

public class MST {

    /**
     * When true, getMST prints every swap it makes, so a run can be replayed.
     */
    static boolean trace = false;

    /**
     * Main method to test our code.
     * Run with "trace 50" to print one random graph and every MST step instead.
     *
     * @param args
     */
    public static void main(String[] args) { throw new UnsupportedOperationException("removed"); }

    /**
     * Method that calculates the total edge weight in a graph.
     *
     * @param g The graph from which to calculate the total edge weight
     * @return The total edge weight
     */
    static double getTotalEdgeWeight(Graph g) { throw new UnsupportedOperationException("removed"); }

    /**
     * Method to generate a random graph given a number of vertices
     *
     * @param n Number of vertices
     * @return Random graph
     */
    static Graph getRandomGraph(int n) { throw new UnsupportedOperationException("removed"); }

    /**
     * Same as getRandomGraph(n), but also hands back the random points,
     * so the graph can be drawn.
     */
    static Graph getRandomGraph(int n, double[][] randomPoints) { throw new UnsupportedOperationException("removed"); }

    /**
     * Build a spanning tree of g with breadth first search. As each vertex is
     * reached for the first time, the edge used to reach it is copied into the tree.
     *
     * @param g The graph to span. Assumed to be connected and undirected.
     * @return A spanning tree of g (not necessarily a minimum one).
     */
    static Graph getBaseTree(Graph g) { throw new UnsupportedOperationException("removed"); }

    /**
     * Find the longest (highest weight) edge on the unique path between two
     * vertices of a tree. Breadth first search from the source records where
     * each vertex was reached from, then the path is walked back from dest.
     *
     * @param g      A tree.
     * @param source The source vertex
     * @param dest   The destination vertex
     * @return The longest edge on the path, or null if source == dest.
     */
    static Edge longestEdgeOnPath(Graph g, int source, int dest) { throw new UnsupportedOperationException("removed"); }

    /**
     * Get the MST of a graph. Start from the breadth first spanning tree, then
     * for every edge xy of g that is not in the tree, find the longest edge e on
     * the tree path from x to y. If xy is lighter than e, swap e for xy.
     *
     * @param g The graph from which to get the MST
     * @return A minimum spanning tree of g
     */
    static Graph getMST(Graph g) { throw new UnsupportedOperationException("removed"); }

    /**
     * Print one random graph and every step getMST takes on it, for drawing.
     */
    static void traceRandomGraph(int n) { throw new UnsupportedOperationException("removed"); }

    static void printEdges(String label, Graph g) { throw new UnsupportedOperationException("removed"); }
}
