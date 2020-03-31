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

    public MyBinarySearchTree getBinarySearchTree() {
        return binarySearchTree;
    }

    public void setBinarySearchTree(MyBinarySearchTree binarySearchTree) {
        this.binarySearchTree = binarySearchTree;
    }

    public MyQueue getPrefix() {
        return prefix;
    }

    public void setPrefix(MyQueue prefix) {
        this.prefix = prefix;
    }

    public MyQueue getPostFix() {
        return postFix;
    }

    public void setPostFix(MyQueue postFix) {
        this.postFix = postFix;
    }

}
