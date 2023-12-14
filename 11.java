/*
===================================================== 1679. Max Number of K-Sum Pairs ======================================================


Problem Statement : You are given an integer array nums and an integer k.

                    In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

                    Return the maximum n umber of operations you can perform on the array.


Examples : 
                    Example 1:
                    Input: nums = [1,2,3,4], k = 5
                    Output: 2
                    Explanation: Starting with nums = [1,2,3,4]:
                    - Remove numbers 1 and 4, then nums = [2,3]
                    - Remove numbers 2 and 3, then nums = []
                    There are no more pairs that sum up to 5, hence a total of 2 operations.


                    Example 2:
                    Input: nums = [3,1,3,4,3], k = 6
                    Output: 1
                    Explanation: Starting with nums = [3,1,3,4,3]:
                    - Remove the first two 3's, then nums = [1,4,3]
                    There are no more pairs that sum up to 6, hence a total of 1 operation.
*/

public class 11 {
    public int maxOperations(int[] a, int k) {
        int i=0, j=a.length-1;
        int op=0;
        Arrays.sort(a);
        while(i<j ) {
            if(a[i] + a[j] < k) {
                i++;
            } else if(a[i]+a[j] > k) {
                j--;
            } else {
                i++;
                j--;
                op++;
            }
        } 
        return op;
    }
}
