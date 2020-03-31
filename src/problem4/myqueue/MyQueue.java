/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {
    private Node front;
    private int size;
    private Node last;
    private Node temp;

    public MyQueue() {
        front = last = temp = null;
        size = 0;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getTemp() {
        return temp;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public void queuePrint(MyQueue queue) {
        while (queue.temp != null) {
            System.out.println(queue.temp.getNode().getData());
            queue.temp = queue.temp.getNext();
        }
        queue.temp = queue.front;
    }

    public void queueLast(Node node) {
        if (front == null) {
            front = node;
            last = node;
            temp = node;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            last = node;
            temp.setNext(node);
            temp = front;
        }
    }

    public void preOrder(TreeNode treenode) {
        queueLast(new Node(treenode));
        preOrder(treenode.getLeft());
        preOrder(treenode.getRight());
    }

    public void printNext(int data) {
        temp = front;
        while (temp.getNode().getData() != data && temp != null) {
            temp = temp.getNext();
        }

    }

}
