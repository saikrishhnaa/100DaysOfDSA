/*
Description:

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 
Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
*/

// Solution 1
class Solution {
    
    public int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high) 
        {
            mid = low + ((high - low) / 2);
            if(nums[mid] == key) {
                return mid;
            } else if (nums[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp; 
                }
            }
        }
    }
    
    public int missingNumber(int[] nums) {
        bubbleSort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if(binarySearch(nums, i) == -1) {
                return i;
            }
        }
        return -1;
    }
}


// Solution 2
class Solution {
    public int missingNumber(int[] nums) {
        int numsLength = nums.length;
        int sumOfNums = 0;
        for(int num : nums)
            sumOfNums += num;
        
        return (((numsLength + 1)*(numsLength))/2) - sumOfNums;
    }
}

// Solution 3
class Solution {
    public int missingNumber(int[] nums) {
        int numsLength = nums.length;
        int ans = 0;
        for(int i = 1; i <= numsLength; i++)
            ans = ans ^ i;
        for(int num : nums)
            ans = ans ^ num;
        return ans;
    }
}
