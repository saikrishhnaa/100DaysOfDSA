/*
Description:

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 
Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/

import java.util.Map;
import java.util.HashMap;

class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<Integer, List<String>> anagramGroups = new HashMap<Integer, List<String>>();
        
        for(String str : strs)
        {
            int asciiSum = 0;
            for(int i = 0; i < str.length(); i++)
            {
                asciiSum += (int)str.charAt(i);
            }
            if(anagramGroups.containsKey(asciiSum))
                anagramGroups.get(asciiSum).add(str);
            else
            {
                List<String> list = new ArrayList<String>();
                list.add(str);
                anagramGroups.put(asciiSum, list);
            }
        }
        
        List<List<String>> resultGroups = new ArrayList<List<String>>();
        for(Map.Entry<Integer, List<String>> entry : anagramGroups.entrySet())
        {
            resultGroups.add(entry.getValue());
        }
        
        return resultGroups;
    }
}
