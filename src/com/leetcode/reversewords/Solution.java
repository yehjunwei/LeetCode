package com.leetcode.reversewords;

public class Solution {
	
    public String reverseWords(String s) {
        if(s == null || s.isEmpty())
            return s;
        
        s = s.trim();
        String[] words = s.split("\\s+", 1);
        int size = words.length;
        StringBuffer reversedWords = new StringBuffer();
        for(int i = size-1 ; i >= 0 ; i--) {
            reversedWords.append(words[i]);
            if(i != 0)
                reversedWords.append(" ");
        }
        return reversedWords.toString();
    }
}


