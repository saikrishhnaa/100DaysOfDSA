/*
Description:

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33
 

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangleRows = new ArrayList<List<Integer>>();
        for(int i = 0; i <= rowIndex; i++)
        {
            int rowCounter = 0;
            List<Integer> triangleRow = new ArrayList<Integer>();
            List<Integer> trianglePreviousRow = null;
            if(i > 1)
                trianglePreviousRow = triangleRows.get(i - 1);
            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i)
                    triangleRow.add(1);
                else
                {
                    triangleRow.add(trianglePreviousRow.get(rowCounter) + trianglePreviousRow.get(rowCounter + 1));
                    rowCounter++;
                }
            }
            if(i == rowIndex)
                return triangleRow;
            triangleRows.add(triangleRow);
        }
        return null;
    }
}
