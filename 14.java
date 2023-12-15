/*
=====================================================  1004. Max Consecutive Ones III ======================================================


Problem Statement : Given a binary array nums and an integer k, return the maximum number of consecutive 1's in 
        
                    the array if you can flip at most k 0's.


Examples : 

                Example 1:
                Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
                Output: 6
                Explanation: [1,1,1,0,0,1,1,1,1,1,1]
                Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
                
                
                Example 2
                Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
                Output: 10
                Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
                Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*/





public class 14 {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]==0){
                k--;
            }
            if(k<0){
                if(nums[i]==0){
                    k++;
                }
                i++;
            }
            j++;
        }
        return j-i;
    }
}
