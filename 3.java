/*
=====================================================  345. Reverse Vowels of a String ======================================================


Problem Statement : Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "hello"
Output: "holle"


Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/


package CompetitiveCoding.LeetCode-75;
public class 3 {
    char arr[] = s.toCharArray();
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            if (arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' &&
                arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U')
                i++;
            else if (arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u' &&
                     arr[j] != 'A' && arr[j] != 'E' && arr[j] != 'I' && arr[j] != 'O' && arr[j] != 'U')
                j--;
            else {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            } 
        }
        
        return new String(arr);
}
