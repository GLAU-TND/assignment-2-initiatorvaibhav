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

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        MyQueue queue = new MyQueue();

        binarySearchTree.setRoot();
        System.out.println(" Root " + binarySearchTree.getRoot().getData());
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            binarySearchTree.insert(binarySearchTree.getRoot());
        }

        queue.queuePrint(binarySearchTree.getPrefix());

        binarySearchTree.countUsed(binarySearchTree.getRoot());
        System.out.println(binarySearchTree.getCount());
    }

}
