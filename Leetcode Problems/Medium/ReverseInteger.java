/*
Description:

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
*/

class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = -x;
        }
        char[] arr = String.valueOf(x).toCharArray();
        for(int i = 0; i < arr.length / 2; i++) {
            char temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        try {
            if(!isNegative)
                return Integer.parseInt(new String(arr));
            return -Integer.parseInt(new String(arr));
        } catch(NumberFormatException ex) {
            return 0;
        }
    }
}
