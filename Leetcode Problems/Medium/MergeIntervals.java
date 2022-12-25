/*
Description:

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 
Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
*/

import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length == 1)
            return intervals;
        List<int[]> intervalsList = new ArrayList<int[]>();
        
        for(int i = 0; i < intervals.length - 1; i++)
        {
            int firstInterval0;
            int firstInterval1;
            int secondInterval0;
            int secondInterval1;

            if(intervals[i][0] < intervals[i + 1][0]) {
                firstInterval0 = intervals[i][0];
                firstInterval1 = intervals[i][1];
                secondInterval0 = intervals[i + 1][0];
                secondInterval1 = intervals[i + 1][1];
            }
            else
            {
                firstInterval0 = intervals[i + 1][0];
                firstInterval1 = intervals[i + 1][1];
                secondInterval0 = intervals[i][0];
                secondInterval1 = intervals[i][1];
            }
            if(secondInterval1 <= firstInterval1)
            {
                intervals[i + 1] = new int[] { firstInterval0, firstInterval1 };
            } 

            else if(secondInterval0 <= firstInterval1)
            {
                intervals[i + 1] = new int[] { firstInterval0, secondInterval1 };
            } 
            else
            {
                intervalsList.add(intervals[i]);
            } 

            if(i == intervals.length - 2)
                intervalsList.add(intervals[i + 1]);
        }     

        int[][] resultIntervals = new int[intervalsList.size()][2];
        for(int i = 0; i < intervalsList.size(); i++)
        {
            resultIntervals[i] = intervalsList.get(i);
        } 
        return resultIntervals;
    }
}
