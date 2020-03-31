/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        MyQueue queue = new MyQueue();

        binarySearchTree.setRoot();
        System.out.println(" Root " + binarySearchTree.getRoot().getData());

        queue.queuePrint(binarySearchTree.getPrefix());

        binarySearchTree.countUsed(binarySearchTree.getRoot());
        System.out.println(binarySearchTree.getCount());
    }

}
