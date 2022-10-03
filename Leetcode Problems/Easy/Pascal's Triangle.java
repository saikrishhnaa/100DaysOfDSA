/*
Description:

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 
Constraints:

1 <= numRows <= 30
*/

import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> triangleRows = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++)
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
            triangleRows.add(triangleRow);
        }
        return triangleRows;
    }
}