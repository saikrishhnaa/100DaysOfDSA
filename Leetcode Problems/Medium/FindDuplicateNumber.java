/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

Follow up:

How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity?
*/

class Solution {
    public int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high) 
        {
            mid = low + ((high - low) / 2);
            if((nums[mid] == key) && ((mid > 0 && nums[mid - 1] == key) || (mid < (nums.length - 2) && nums[mid + 1] == key))) {
                return mid;
            } else if (nums[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(binarySearch(nums, i) != -1) {
                return i;
            }
        }
        return -1;
    }
}
