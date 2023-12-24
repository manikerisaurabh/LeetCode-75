/*
===================================================== 1372. Longest ZigZag Path in a Binary Tree    ======================================================


Problem Statement : You are given the root of a binary tree.
                    A ZigZag path for a binary tree is defined as follow:
                    Choose any node in the binary tree and a direction (right or left).
                    If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
                    Change the direction from right to left or from left to right.
                    Repeat the second and third steps until you can't move in the tree.
                    Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).
                    Return the longest ZigZag path contained in that tree.


Examples : 

                    Example 1:
                    Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
                    Output: 3
                    Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
                    
                    
                    Example 2:
                    Input: root = [1,1,1,null,1,null,null,1,1,null,1]
                    Output: 4
                    Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
                    
                    
                    Example 3:
                    Input: root = [1]
                    Output: 0
*/

public class 35 {

    //supplementry function
    public int zigZagLength(TreeNode root, boolean startDrection) {
        int length = 0;
        while (root != null) {
            if (startDrection && root.right != null) {
                root = root.right;
                startDrection = false;
            } else if (!startDrection && root.left != null) {
                root = root.left;
                startDrection = true;
            } else
                break;
            length++;
        }
        return length;
    }


    //main function
    public int longestZigZag(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        else if (root.left == null)
            return Math.max(zigZagLength(root, true), longestZigZag(root.right));
        else if (root.right == null)
            return Math.max(zigZagLength(root, false), longestZigZag(root.left));
        else
            return Math.max(Math.max(zigZagLength(root, true), zigZagLength(root, false)),
                    Math.max(longestZigZag(root.left), longestZigZag(root.right)));
    }
}
