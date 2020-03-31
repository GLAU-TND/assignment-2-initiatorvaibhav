/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        MyMain resource = new MyMain();
        binarySearchTree.setRoot();
        System.out.println(" Root Data" + binarySearchTree.getRoot().getData());
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            binarySearchTree.insert(binarySearchTree.getRoot());
        }
    }
}
