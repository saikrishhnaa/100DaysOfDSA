/*
Description:

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
-1000 <= nums1[i], nums2[i] <= 1000
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> differenceLists = new ArrayList<List<Integer>>();
        
        List<Integer> differenceList1 = new ArrayList<Integer>();
        
        for(int num1 : nums1) 
        {
            boolean isElementPresent = false;
            for(int num2 : nums2)
            {
                if(num1 == num2)
                {
                    isElementPresent = true;
                    break;
                }
            }
            if(!isElementPresent && !differenceList1.contains(num1))
            {
                differenceList1.add(num1);
            }
        }
        differenceLists.add(differenceList1);
        
        List<Integer> differenceList2 = new ArrayList<Integer>();
        
        for(int num2 : nums2) 
        {
            boolean isElementPresent = false;
            for(int num1 : nums1)
            {
                if(num2 == num1)
                {
                    isElementPresent = true;
                    break;
                }
            }
            if(!isElementPresent && !differenceList2.contains(num2))
            {
                differenceList2.add(num2);
            }
        }
        differenceLists.add(differenceList2);
        
        return differenceLists;
    }
}