// Outline only. The full code is private.
// Function names, structure and comments are shown. The working logic is removed.
// Copyright 2026 Mustafa Khodir. All rights reserved.

import java.util.List;
import java.util.Stack;

// A binary search tree of UK prime ministers keyed on days in office.
// Each node also keeps a count of how many nodes sit below it, which is
// what makes "find the nth shortest tenure" work without walking the
// whole tree.
//
// main builds the tree, asks for the 10th, 20th, 30th, 40th and 50th
// shortest tenure, prints the 10 and 20 shortest, then deletes the
// INCOMPLETE set from PMList and prints the 10 shortest that are left.
public class PMTree {

    private Node root = null;

    // Builds the tree from PMList and runs the queries and the deletion test
    public static void main(String[] args) { throw new UnsupportedOperationException("removed"); }

    // One prime minister in the tree, with links up to its parent and down
    // to its children. Shorter tenures go left, longer ones go right.
    private class Node {
        Node parent;
        Node left, right;
        int days;
        String name;       // who the tenure belongs to
        int nodesBelow;    // how many nodes are below this one

        // A new node is always a leaf, so it starts with nothing below it
        Node(Node parent, int days, String name) { throw new UnsupportedOperationException("removed"); }

        // Replaces the name stored for this tenure
        void setName(String name) { throw new UnsupportedOperationException("removed"); }

        // The name stored for this tenure
        String getName() { throw new UnsupportedOperationException("removed"); }

        // How many children this node has. When deleting, 0 or 1 is the easy case.
        int numChildren() { throw new UnsupportedOperationException("removed"); }

        // How a node is printed, for example { PM: Liz Truss, Days: 49, nodes below: 0 }
        @Override
        public String toString() { throw new UnsupportedOperationException("removed"); }
    }

    // True if someone in the tree served exactly this many days
    public boolean contains(int days) { throw new UnsupportedOperationException("removed"); }

    // Name of whoever served exactly this many days, or null if nobody did
    public String getName(int days) { throw new UnsupportedOperationException("removed"); }

    // Standard binary search: go left for fewer days, right for more,
    // and stop when the days match or there is nowhere left to go
    private Node getNode(int days) { throw new UnsupportedOperationException("removed"); }

    // Inserts every entry in the order the list gives them
    private void insertAll(List<PMList.Entry> entries) { throw new UnsupportedOperationException("removed"); }

    // Walks down from the root to the empty spot where these days belong and
    // adds a new leaf there, adding one to the count of every node on the way.
    // If the days are already in the tree only the name is replaced.
    public void insert(int days, String name) { throw new UnsupportedOperationException("removed"); }

    // Deletes a node. With 0 or 1 children it is a simple unlink. With 2
    // children, it copies in the smallest value from the right subtree and
    // deletes that node instead (it can only have a right child).
    public void delete(int days) { throw new UnsupportedOperationException("removed"); }

    // Unlinks a node that has at most one child
    private void simpleDelete(Node node) { throw new UnsupportedOperationException("removed"); }

    // The shortest tenure under this node is as far left as you can go
    private Node getMinNode(Node node) { throw new UnsupportedOperationException("removed"); }

    // Walks down using the subtree counts: if the left subtree has at least
    // n nodes the answer is in there, otherwise skip it and look right.
    public Node nthShortestTenure(int n) { throw new UnsupportedOperationException("removed"); }

    // Prints the n shortest tenures. They come off the stack in reverse, so
    // the list is printed from the nth shortest down to the shortest.
    public void showAllNShortest(int n) { throw new UnsupportedOperationException("removed"); }

    // In order traversal using an explicit stack, stopping after n nodes
    private Stack<Node> getAllNShortest(int n) { throw new UnsupportedOperationException("removed"); }

    // Deletes the node for each tenure in the array, skipping any not in the tree
    private void deleteAll(int[] tenures) { throw new UnsupportedOperationException("removed"); }
}
