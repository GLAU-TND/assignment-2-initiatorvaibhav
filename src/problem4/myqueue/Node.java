package problem4.myqueue;

import problem1.node.TreeNode;

public class Node {

    private TreeNode node;
    private Node next;

    public Node() {
        node = new TreeNode();
        next = null;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(TreeNode tree) {
        node = tree;
        next = null;
    }

}
