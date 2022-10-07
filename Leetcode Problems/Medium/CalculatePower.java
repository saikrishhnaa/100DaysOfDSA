/*
Description:

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
-104 <= xn <= 104
*/

class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if (n == Integer.MAX_VALUE) 
            return x;
        if (n == Integer.MIN_VALUE) 
            return (x == 1 || x == -1) ? 1 : 0;
        
        boolean isXNeg = x < 0;
        boolean isNNeg = n < 0;
        
        if(isXNeg)
            x = -x;
        if(isNNeg)
            n = -n;
        
        double halfPower = myPow(x, n / 2);
        
        double powerValue = 0;
        
        if(n % 2 == 1)
            powerValue = halfPower * halfPower * x;
        else
            powerValue = halfPower * halfPower;
        
        if(isXNeg && n % 2 == 1)
            powerValue = -powerValue;
        
        if(isNNeg)
            powerValue = 1 / powerValue;
        
        return powerValue;
    }
}
