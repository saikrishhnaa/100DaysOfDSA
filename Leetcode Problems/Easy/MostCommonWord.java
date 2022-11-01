/*
Description:

Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"
 

Constraints:

1 <= paragraph.length <= 1000
paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
0 <= banned.length <= 100
1 <= banned[i].length <= 10
banned[i] consists of only lowercase English letters.
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        paragraph = paragraph.toLowerCase();
        List<Character> paragraphSymbols = new ArrayList<Character>();
        List<String> bannedWords = Arrays.asList(banned);
        paragraphSymbols.add(' ');
        paragraphSymbols.add('!');
        paragraphSymbols.add('?');
        paragraphSymbols.add('\'');
        paragraphSymbols.add(',');
        paragraphSymbols.add(';');
        paragraphSymbols.add('.');
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        int start = 0;
        int end = 0;
        for(int i = 0; i < paragraph.length(); i++)
        {
            end++;
            if(paragraphSymbols.contains(paragraph.charAt(i)))
            {
                String word = paragraph.substring(start, end + 1);
                if(!bannedWords.contains(word))
                {
                    if(wordCount.containsKey(word))
                        wordCount.put(word, wordCount.get(word) + 1);
                    else
                        wordCount.put(word, 1);
                }
                start = i + 1;
            }
            else
            {
                end++;
            }
        }
        int max = -1;
        String mostFrequent = "";
        for(Map.Entry<String, Integer> wordEntry : wordCount.entrySet())
        {
            if(wordEntry.getValue() > max)
            {
                max = wordEntry.getValue();
                mostFrequent = wordEntry.getKey();;
            }
        }
        return mostFrequent;
    }
}

