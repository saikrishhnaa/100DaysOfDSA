/*
Description:

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/

class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int numsLen = nums.length;
        int start = 0;
        int end = numsLen - 1;
        int result[] = new int[2];
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
            {
                if((mid - 1) >= 0 && nums[mid - 1] == target)
                    result[0] = mid - 1;
                else 
                    result[0] = mid;
                
                if((mid + 1) < numsLen && nums[mid + 1] == target)
                    result[1] = mid + 1;
                else 
                    result[1] = mid;
//                 for(int i = mid - 1; i >= 0; i--)
//                 {
//                     if(nums[i] != target) 
//                     {
//                         result[0] = i + 1;
//                         break;
//                     }
//                     else if(i == 0)
//                         result[0] = 0;
//                 }
                
//                 for(int i = mid + 1; i < numsLen; i++)
//                 {
//                     if(nums[i] != target) 
//                     {
//                         result[1] = i - 1;
//                         break;
//                     }
//                     else if(i == numsLen)
//                         result[1] = numsLen;
//                 }
            } 
            else if(nums[mid] < target)
            {
                start = mid + 1;
            } 
            else if(nums[mid] > target)
            {
                end = mid - 1;
            }
        }
        return result;
    }
}