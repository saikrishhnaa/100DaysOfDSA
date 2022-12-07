/*
Description:

Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

class Solution 
{
    public String addBinary(String a, String b) 
    {
        String binarySum = "";
        char extra = '0';
        int aPtr = a.length() - 1;
        int bPtr = b.length() - 1;
        while(aPtr >= 0 && bPtr >= 0)
        {
            binarySum = Integer.toString((Integer.toString(a.charAt(aPtr) ^ b.charAt(bPtr)).charAt(0) ^ extra)) + binarySum;
            System.out.println(Integer.toString((Integer.toString(a.charAt(aPtr) ^ b.charAt(bPtr)).charAt(0) ^ extra)) + "h");
            System.out.println(Integer.toString(a.charAt(aPtr) ^ b.charAt(bPtr)).charAt(0) ^ extra);
            int ones = 0;
            if(a.charAt(aPtr) == '1') 
                ones++;
            if(b.charAt(bPtr) == '1')
                ones++;
            if(extra == '1')
                ones++;
           
            if(ones > 1)
                extra = '1';
            else 
                extra = '0';
            aPtr--;
            bPtr--;
        }
        while(aPtr >= 0)
        {
            binarySum = Character.toString(a.charAt(aPtr) ^ extra) + binarySum;
            if(a.charAt(aPtr) == '1' && extra == '1')
                extra = '1';
            else
                extra = '0';
            aPtr--;
        }
        while(bPtr >= 0)
        {
            binarySum = Character.toString(b.charAt(bPtr) ^ extra) + binarySum;
            if(b.charAt(bPtr) == '1' && extra == '1')
                extra = '1';
            else
                extra = '0';
            bPtr--;
        }
        return binarySum;
    }
}
