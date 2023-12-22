/*
===================================================== 104. Maximum Depth of Binary Tree ======================================================


Problem Statement : Given the root of a binary tree, return its maximum depth.

                    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


Examples : 

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3


Example 2:
Input: root = [1,null,2]
Output: 2
*/

/*
 * Well Explained Link : "https://leetcode.com/problems/maximum-depth-of-binary-tree/solutions/4440162/easy-and-well-explained-java-solution/?envType=study-plan-v2&envId=leetcode-75"
 * 
 */


public class 31 {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth)+1;
    }
}
