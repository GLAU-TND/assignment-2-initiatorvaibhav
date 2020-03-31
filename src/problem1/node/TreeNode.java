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
    private TreeNode right;
    private int data;

    Scanner scanner = new Scanner( System.in );

    public TreeNode() {
        System.out.println("Please enter data ");
        data = scanner.nextInt();

    }


}
