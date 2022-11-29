/*
Description:

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/

import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        int numsLen = nums.length;
        List list = new ArrayList();
        for(int i = 0; i < numsLen; i++)
        {
            int counter = 0;
            List sublist = new ArrayList();
            sublist.add(nums[i]);
            for(int j = (i + 1) % nums.length; counter < numsLen; j = j % nums.length)
            {
                sublist.add(nums[j]);
                counter++;
            }
            list.add(sublist);
        }
        return list;
    }
}
