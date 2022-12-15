/*
Description:

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
*/

class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int flowerbedLen = flowerbed.length;
        if(flowerbedLen == 1)
            if(flowerbed[0] == 0 && --n == 0)
                return true;
        if(flowerbed[1] == 0 && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            if(--n == 0)
                return true;
        }
        int i = 0;
        while(i < flowerbedLen - 2)
        {
            if(flowerbed[i] == 1)
            {
                if(flowerbed[i + 2] == 0)
                {
                    System.out.println("hi" + (i + 2) + " " + (n - 1));
                    if(--n == 0)
                        return true;
                }
                i = i + 2;
            }
            i++;
        }
        if(flowerbed[flowerbedLen - 2] == 0 && flowerbed[flowerbedLen - 1] == 0 && --n == 0)
            return true;
        return false;
    }
}
