/*
Description:

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
*/

class Solution {
    public String reverseWords(String s) {
        String[] splitString = s.split(" ");
        for(int i = 0; i < splitString.length; i++)
        {
            String str = splitString[i];
            splitString[i] = "";
            for(int j = 0; j < str.length(); j++)
            {
                splitString[i] = str.substring(j, j + 1) + splitString[i];
            }
        }
        
        return String.join(" ", splitString);
    }
}