/*
Description:

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int prefixLength = 0;
        for(int i = 0; i < strs.length - 1; i++)
        {
            int j = 0;
            while(j < strs[i].length() && j < strs[i + 1].length() && strs[i].charAt(j) == strs[i + 1].charAt(j))
            {
                j++;
                if(j == strs[i].length() || j == strs[i + 1].length())
                    
            }
            
        }
        return strs[0].substring(0, prefixLength);
    }
}