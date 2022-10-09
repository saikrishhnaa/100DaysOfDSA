/*
Description:

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
 
Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        int countOfCapitalWords = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if((int)word.charAt(i) >= 65 && (int)word.charAt(i) <= 90)
            {
                countOfCapitalWords++;
            }
        }
        if((countOfCapitalWords == word.length()) || (countOfCapitalWords == 0) || ((countOfCapitalWords == 1) && ((int)word.charAt(0) >= 65 && (int)word.charAt(0) <= 90)))
            return true;
        return false;
    }
}