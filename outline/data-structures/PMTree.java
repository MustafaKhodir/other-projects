// Outline only. The full code is private.
// Function names, structure and comments are shown. The working logic is removed.
// Copyright 2026 Mustafa Khodir. All rights reserved.

import java.util.List;
import java.util.Stack;
// A binary search tree of UK prime ministers keyed on days in office.
// Each node also keeps a count of how many nodes sit below it, which is
// what makes "find the nth shortest tenure" work without walking the
// whole tree.
public class PMTree {
    public static void main(String[] args) { /* removed */ }
    private class Node {
        Node(Node parent, int days, String name) { /* removed */ }
        void setName(String name) { /* removed */ }
        String getName() { /* removed */ }
        // handy when deleting, a node with 0 or 1 children is the easy case
        int numChildren() { /* removed */ }
        public String toString() { /* removed */ }
  }
    public boolean contains(int days) { /* removed */ }
    // name of whoever served exactly this many days, or null if nobody did
    public String getName(int days) { /* removed */ }
    private Node getNode(int days) { /* removed */ }
    private void insertAll(List<PMList.Entry> pmlist) { /* removed */ }
    public void insert(int days, String name) { /* removed */ }
    // Delete a node. With 0 or 1 children it is a simple unlink. With 2
    // children, copy in the smallest value from the right subtree and
    // delete that node instead (it can only have a right child).
    public void delete(int days) { /* removed */ }
    // unlink a node that has at most one child
    private void simpleDelete(Node node) { /* removed */ }
    private Node getMinNode(Node node) { /* removed */ }
    // Walks down using the subtree counts: if the left subtree has at least
    // n nodes the answer is in there, otherwise skip it and look right.
    public Node nthShortestTenure(int n) { /* removed */ }
    public void showAllNShortest(int n) { /* removed */ }
    // in order traversal with an explicit stack, stops after n nodes
    private Stack<Node> getAllNShortest(int n) { /* removed */ }
    private void deleteAll(int[] tenures) { /* removed */ }
}
