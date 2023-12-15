/*
=====================================================  1493. Longest Subarray of 1's After Deleting One Element======================================================


Problem Statement : Given a binary array nums, you should delete one element from it.

                    Return the size of the longest non-empty subarray containing only 1's in the resulting array. 
                    
                    Return 0 if there is no such subarray.


Examples : 
                    Example 1:
                    Input: nums = [1,1,0,1]
                    Output: 3
                    Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.


                    Example 2:
                    Input: nums = [0,1,1,1,0,1,1,0,1]
                    Output: 5
                    Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].


                    Example 3:
                    Input: nums = [1,1,1]
                    Output: 2
                    Explanation: You must delete one element.
 
*/

public class 15 {
    public int longestSubarray(int[] nums) {
        int count=0;
        List<Integer> nm=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                if(count>0)
                {
                    nm.add(count);
                    count=0;
                }
                nm.add(0);
            }
            else
            {
                count++;
            }
        }
        nm.add(count);
        if(nm.size()==1)
        {
            return nums.length-1;
        }
        if(nm.size()==2)
        {
            return Math.max(nm.get(0),nm.get(1));
        }
        int max=0;
        for(int i=0;i<nm.size()-2;i++)
        {
            max=Math.max(max,nm.get(i)+nm.get(i+2));
        }
        return max;
    }
}
