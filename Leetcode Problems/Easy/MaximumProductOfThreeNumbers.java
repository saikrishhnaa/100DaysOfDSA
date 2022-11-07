/*
Description:

Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 
Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/

class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        int num1 = -1000, num2 = -1000, num3 = -1000;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > num1)
            {
                num3 = num2;
                num2 = num1;
                num1 = nums[i];                
            } 
            else if(nums[i] > num2)
            {
                num3 = num2;
                num2 = nums[i];
            } 
            else if(nums[i] > num3)
            {
                num3 = nums[i];
            }
        }
        return num1 * num2 * num3;
    }
}
