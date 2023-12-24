/*
===================================================== 437. Path Sum III    ======================================================


Problem Statement : Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

                    The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).


Examples : 

                    Example 1:
                    Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
                    Output: 3
                    Explanation: The paths that sum to 8 are shown.


                    Example 2:
                    Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
                    Output: 3
*/

public class 34 {

    //supplementry function
    public int preorder(TreeNode root,int targetSum,Long sum,ArrayList<Long> al) {  
        if(root==null)
                return 0;
        al.add(al.size()==0 ? root.val : al.get(al.size()-1)+root.val);
        int x=0,y=0;
          x = x+ preorder(root.left,targetSum,sum+root.val,al);
          y = y+preorder(root.right,targetSum,sum+root.val,al);
        int count=0;
        if(sum+root.val == targetSum)
        {
            count++;
        }
        for(int i=0;i<al.size()-1;i++)
        {
            Long s = (Long)sum-al.get(i)+root.val;
            if( s == targetSum)
            {
                count++;
            }
        }
       
        if(al.size()>0)
            al.remove(al.size()-1);
        return count+x+y;
                
    }
    //main function
    public int pathSum(TreeNode root, int targetSum) {
        ArrayList<Long> rootToNodeSum = new ArrayList<Long>();
        Long sum=0l;
        return preorder(root,targetSum,sum,rootToNodeSum);
    }
}
