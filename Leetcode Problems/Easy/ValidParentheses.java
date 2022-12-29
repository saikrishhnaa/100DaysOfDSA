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

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class Solution 
{
    public boolean isValid(String s) 
    {
        Map<Character, Character> bracketsMap = new HashMap<Character, Character>
        ();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');
        Stack<Character> charStack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(bracketsMap.containsKey(ch))
                charStack.push(ch);
            else {
                if(charStack.empty())
                    return false;
                char charAtTop = charStack.peek();
                if(bracketsMap.get(charAtTop) != ch)
                    return false;
                else
                    charStack.pop();
            }
        }
        if(charStack.empty())
            return true;
        return false;
    }
}
