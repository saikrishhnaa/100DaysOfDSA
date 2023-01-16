/*
Description:

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
*/

class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        String mergedStr = "";
        int word1Ptr = 0;
        int word2Ptr = 0;
        int mergedStrPtr = 0;
        while(word1Ptr < word1.length() && word2Ptr < word2.length())
        {
            if(mergedStrPtr % 2 == 0) 
            {
                mergedStr += word1.substring(word1Ptr, word1Ptr + 1);
                word1Ptr++;
            }
            else
            {
                mergedStr += word2.substring(word2Ptr, word2Ptr + 1);
                word2Ptr++;
            }
            mergedStrPtr++;
        }
        while(word1Ptr < word1.length())
        {
            mergedStr += word1.substring(word1Ptr, word1Ptr + 1);
            word1Ptr++;
            mergedStrPtr++;
        }
        while(word2Ptr < word2.length())
        {
            mergedStr += word2.substring(word2Ptr, word2Ptr + 1);
            word2Ptr++;
            mergedStrPtr++;
        }
        return mergedStr;
    }
}

