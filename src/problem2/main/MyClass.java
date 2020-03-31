package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
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

    public boolean Analysing1(TreeNode root) {
        prefix.queuePrint(prefix);
        postFix.queuePrint(postFix);
        int size = prefix.getSize();
        int count = 0;
        int preData = 0;
        int postData = 0;

        if (size % 2 == 1) {
            while (count < size / 2 && prefix.getTemp() != null) {
                prefix.getTemp().getNext();
                count++;
            }
        } else {
            System.out.println(" Number of Tree ");
            return false;
        }
        return false;
    }


}



