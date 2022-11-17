/*
Description:

Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). 
*/

import java.util.List;
import java.util.ArrayList;

class Solution 
{
    public String[] findWords(String[] words) 
    {
        List<String> wordList = new ArrayList<String>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        
        for(String word : words)
        {
            String insensitiveWord = word.toLowerCase();
            boolean inRow = true;
            if(firstRow.indexOf(insensitiveWord.charAt(0)) != -1)
            {
                for(int i = 1; i < insensitiveWord.length(); i++)
                {
                    if(firstRow.indexOf(insensitiveWord.charAt(i)) == -1) {
                        inRow = false;
                        break;
                    }
                }
                if(inRow) {
                    wordList.add(word);
                    continue;
                }
            }
            if(secondRow.indexOf(insensitiveWord.charAt(0)) != -1)
            {
                for(int i = 1; i < insensitiveWord.length(); i++)
                {
                    if(secondRow.indexOf(insensitiveWord.charAt(i)) == -1) {
                        inRow = false;
                        break;
                    }
                }
                if(inRow) {
                    wordList.add(word);
                    continue;
                }
            }
            if(thirdRow.indexOf(insensitiveWord.charAt(0)) != -1)
            {
                for(int i = 1; i < insensitiveWord.length(); i++)
                {
                    if(thirdRow.indexOf(insensitiveWord.charAt(i)) == -1) {
                        inRow = false;
                        break;
                    }
                }
                if(inRow) {
                    wordList.add(word);
                }
            }
        }
        return wordList.toArray(new String[0]);
    }
}