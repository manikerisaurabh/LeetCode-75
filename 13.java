/*
=====================================================1456. Maximum Number of Vowels in a Substring of Given Length ======================================================


Problem Statement : Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

                    Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.


Examples : 

                Example 1:
                Input: s = "abciiidef", k = 3
                Output: 3
                Explanation: The substring "iii" contains 3 vowel letters.


                Example 2:
                Input: s = "aeiou", k = 2
                Output: 2
                Explanation: Any substring of length 2 contains 2 vowels.


                Example 3:
                Input: s = "leetcode", k = 3
                Output: 2
                Explanation: "lee", "eet" and "ode" contain 2 vowels.
*/

public class 13 {
    public int maxVowels(String s, int k) {
        int vowel = 0, count = 0;
       for(int i = 0; i < k; i++){
           char c = s.charAt(i);
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
               count++;
       }
       if(count > vowel)
           vowel = count;
       for(int i = k, j = 0; i < s.length(); i++,j++){
           char c = s.charAt(i);
           char ch = s.charAt(j);
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
               count++;
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
               count--;
           if(count >= k)
               return k;
           if(count > vowel)
               vowel = count;
       }
       return vowel;
   }
}
