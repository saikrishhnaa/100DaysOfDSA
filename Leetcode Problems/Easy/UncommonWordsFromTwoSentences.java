/*
Description:

A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
*/

class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        String s3 = s1 + " " + s2;
        String[] s3Words = s3.split(" ");
        String uncommonWords = "";
        for(int i = 0; i < s3Words.length; i++)
        {
            for(int j = 0; j < s3Words.length; j++)
            {
                if(i != j && s3Words[i].equals(s3Words[j]))
                    break;
                
                if(j == s3Words.length - 1)
                    uncommonWords += s3Words[i] + " ";
            }
        }
        if(uncommonWords.length() == 0)
            return new String[0];
        return uncommonWords.split(" ");
    }
}
