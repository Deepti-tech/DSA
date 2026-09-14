// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        int index=0;

        for(int i=0; i<s.length(); i++){
            index = s.charAt(i) - 'a';
            freq[index]+=1;
        }
        for(int i=0; i<t.length(); i++){
            index = t.charAt(i) - 'a';
            freq[index]-=1;
        }

        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
