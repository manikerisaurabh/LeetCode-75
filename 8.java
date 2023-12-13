/*
===================================================== 283. Move Zeroes ======================================================


Problem Statement : Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

                    Note that you must do this in-place without making a copy of the array.


Examples : 
                    Example 1:
                    Input: nums = [0,1,0,3,12]
                    Output: [1,3,12,0,0]


                    Example 2:
                    Input: nums = [0]
                    Output: [0]
*/

public class 8 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
           return;
       }

       int nonZeroIndex = 0;

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] != 0) {
               nums[nonZeroIndex] = nums[i];
               nonZeroIndex++;
           }
       }

      
        while(nonZeroIndex<nums.length){
           nums[nonZeroIndex] = 0;
           nonZeroIndex++;
       }
   }
}