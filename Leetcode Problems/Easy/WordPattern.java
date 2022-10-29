/*
Description:

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<Character, String>();
        String[] sWords = s.split(" ");
        int sWordsLen = sWords.length;
        if(sWordsLen != pattern.length())
            return false;
        for(int i = 0; i < sWordsLen; i++)
        {
            char ch = pattern.charAt(i);
            if(!patternMap.containsKey(ch))
            {
                patternMap.put(ch, sWords[i]);
            }
            else
            {
                if(!patternMap.get(ch).equals(sWords[i]))
                    return false;
            }
        }
        return true;
    }
}

