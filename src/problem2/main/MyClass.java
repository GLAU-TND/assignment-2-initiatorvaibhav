package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyClass {
    private MyBinarySearchTree binarySearchTree;
    private MyQueue prefix;
    private MyQueue postFix;

    public MyClass() {
        binarySearchTree = new MyBinarySearchTree();
        prefix = new MyQueue();
        postFix = new MyQueue();
    }

}
