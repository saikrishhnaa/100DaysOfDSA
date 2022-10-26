/*
Description:

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 
Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int longestPalindrome(String s) {
        List<Character> charList = new ArrayList<Character>();
                
        for(char ch : s.toCharArray())
        {
            charList.add(ch);
        }
        
        int strLength = 0;
        for(int i = 0; i < charList.size(); i++)
        {
            for(int j = i + 1; j < charList.size(); j++)
            {
                if(charList.get(i) == charList.get(j))
                {
                    charList.remove(j);
                    strLength += 2;
                    break;
                }
            }
        }
        if(strLength < s.length())
            strLength++;
        return strLength;
    }
}