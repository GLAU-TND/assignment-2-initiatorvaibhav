/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode newNode;
    private TreeNode root;
    private TreeNode temp;
    private static int count;
    private MyQueue prefix;
    private MyQueue postfix;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MyBinarySearchTree.count = count;
    }

    public MyBinarySearchTree() {
        this.root = root;
        this.temp = temp;
        this.count = 0;
        this.prefix = prefix;
        this.postfix = postfix;
    }

    public TreeNode getNewNode() {
        return newNode;
    }

    public void setNewNode(TreeNode newNode) {
        this.newNode = newNode;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getTemp() {
        return temp;
    }

    public void setTemp(TreeNode temp) {
        this.temp = temp;
    }

    public MyQueue getPrefix() {
        return prefix;
    }

    public void setPrefix(MyQueue prefix) {
        this.prefix = prefix;
    }

    public MyQueue getPostfix() {
        return postfix;
    }

    public void setPostfix(MyQueue postfix) {
        this.postfix = postfix;
    }

    public void insert(TreeNode root) {
        if (newNode == null) {
            newNode = new TreeNode();
        }
    }

    public void setRoot() {
        newNode = new TreeNode();
        if (root == null) {
            root = newNode;
            temp = root;
            newNode = null;
        }
    }
}
