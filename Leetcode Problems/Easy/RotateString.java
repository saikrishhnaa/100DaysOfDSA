/*
Description:

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 
Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.
*/

class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        int sLen = s.length();
        int goalLen = goal.length();

        if(sLen == goalLen)
        {
            int i = 0;
            char ch = goal.charAt(0);
            for(; i < sLen; i++)
            {
                if(s.charAt(i) == ch)
                {    
                    int itr = i;
                    for(int j = 1; j < goalLen; j++)
                    {
                        if(s.charAt((++itr) % sLen) != goal.charAt(j))
                        {
                            if(itr == sLen - 1) {
                                return false;
                            }
                            else
                                break;
                        }
                        if(j == goalLen - 1)
                            return true;
                    }
                }
            }
        }
        return false;
    }
}
