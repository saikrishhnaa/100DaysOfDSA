/*
Desription:

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
*/

import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        List<Integer> digits = new ArrayList<Integer>();
        int i = 0, val;
        while(x > 0) {
            val = x % 10;
            x /= 10;
            digits.add(i, val);
            i++;
        }
        for(int j = 0, k = digits.size() - 1; j < k; j++, k--) {
            if(digits.get(j) != digits.get(k)) {
                return false;
            }
        }
        return true;
    }
}