/*
Description:

Given a string s containing only lowercase English letters and the '?' character, convert all the '?' characters into lowercase letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.

It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.

Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution, return any of them. It can be shown that an answer is always possible with the given constraints.

Example 1:

Input: s = "?zs"
Output: "azs"
Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".
Example 2:

Input: s = "ubv?w"
Output: "ubvaw"
Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".
 
Constraints:

1 <= s.length <= 100
s consist of lowercase English letters and '?'.
*/

class Solution {
    public String modifyString(String s) {
        String resultStr = "";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(s.charAt(i) == '?') {
                char newChar;
                do {
                    int charItr = (int)(Math.random() * 26);
                    newChar = (char)(charItr + 97);
                } while((i > 0 && newChar == resultStr.charAt(i - 1)) || (i < s.length() - 1 && newChar == s.charAt(i + 1)));
                resultStr += Character.toString(newChar);
            } else 
                resultStr += Character.toString(ch);
        }
        return resultStr;
    }
}
