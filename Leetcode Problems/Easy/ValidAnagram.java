/*
Description:

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

import java.util.ArrayList;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sLen = s.length();
        int tLen = t.length();
        
        List<Character> charList = new ArrayList<Character>(); 
        
        if(sLen != tLen)
            return false;
        
        for(int i = 0; i < sLen; i++)
        {
            charList.add(s.charAt(i));
        }
        
        for(int i = 0; i < sLen; i++)
        {
            if(!charList.contains(t.charAt(i)))
                return false;
            charList.remove((Character)t.charAt(i));
        }
        
        if(charList.size() == 0)
            return true;
        return false;
    }
}