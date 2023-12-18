/*
=====================================================   1657. Determine if Two Strings Are Close  ======================================================


Problem Statement : Two strings are considered close if you can attain one from the other using the following operations:

                    Operation 1: Swap any two existing characters.
                    For example, abcde -> aecdb


                    Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
                    For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
                    You can use the operations on either string as many times as necessary.

                    Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.


Examples : 

                    Example 1:
                    Input: word1 = "abc", word2 = "bca"
                    Output: true
                    Explanation: You can attain word2 from word1 in 2 operations.
                    Apply Operation 1: "abc" -> "acb"
                    Apply Operation 1: "acb" -> "bca"


                    Example 2:
                    Input: word1 = "a", word2 = "aa"
                    Output: false
                    Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.


                    Example 3:
                    Input: word1 = "cabbba", word2 = "abbccc"
                    Output: true
                    Explanation: You can attain word2 from word1 in 3 operations.
                    Apply Operation 1: "cabbba" -> "caabbb"
                    Apply Operation 2: "caabbb" -> "baaccc"
                    Apply Operation 2: "baaccc" -> "abbccc"

*/

public class 20 {
    public boolean closeStrings(String w1, String w2) {
        char[] c1 = w1.toCharArray();
        char[] c2 = w2.toCharArray();
        for(int i=0;i<c1.length&&i<c2.length;i++){
            if(w1.indexOf(c2[i])==-1){
                return false;
            }
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
            return true;
        }
        
        int arr1[]=count(c1);
        int arr2[]=count(c2);
        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }
}
