/*
Description:

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        List<Character> openingBrackets = new ArrayList<Character>();
        for(char c : s.toCharArray()) {
            int arrLen = openingBrackets.size();
            if(c == '(' || c == '[' || c == '{')
                openingBrackets.add(c);
            else if(arrLen != 0) {
                if(c == ')' && openingBrackets.get(arrLen - 1) == '(')
                    openingBrackets.remove(arrLen - 1);
                else if(c == ']' && openingBrackets.get(arrLen - 1) == '[')
                    openingBrackets.remove(arrLen - 1);
                else if(c == '}' && openingBrackets.get(arrLen - 1) == '{')
                    openingBrackets.remove(arrLen - 1);
                else 
                    return false;
            } else {
                return false;
            }
        }
        if(openingBrackets.size() == 0)
            return true;
        return false;
    }
}
