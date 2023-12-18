/*
===================================================== 1207. Unique Number of Occurrences  ======================================================


Problem Statement : Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.


Examples : 

                    Example 1:
                    Input: arr = [1,2,2,1,1,3]
                    Output: true
                    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.


                    Example 2:
                    Input: arr = [1,2]
                    Output: false


                    Example 3:
                    Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
                    Output: true
*/

public class 19 {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer, Integer> nums = new HashMap<>();
        for (int j : arr) {
            if (nums.containsValue(j)) continue;
            int count = 0;
            for (int k : arr)
                if (j == k)
                    count++;
            if (nums.containsKey(count))
                return false;
            else nums.put(count, j);
        }
        return true;
    }
}
