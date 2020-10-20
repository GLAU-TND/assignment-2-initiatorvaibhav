/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

import java.util.Scanner;

public class TreeNode {
    private TreeNode left;

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

    private TreeNode right;
    private int data;

    Scanner scanner = new Scanner(System.in);

    public TreeNode() {
        System.out.println("Please enter data ");
        data = scanner.nextInt();
        left = null;
        right = null;

    }


}
