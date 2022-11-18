/*
Description:

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 
Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int uniqueValues = 0;
        HashSet<Integer> occurrencesSet = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 1000)
                continue;
            uniqueValues++;
            int numberOfOccurences = 1;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    numberOfOccurences++;
                    arr[j] = 1001;
                }
            }
            occurrencesSet.add(numberOfOccurences);
        }
        if(occurrencesSet.size() == uniqueValues)
            return true;
        return false;
    }
}

