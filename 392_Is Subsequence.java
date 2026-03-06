// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sP=0, tP=0;
        while(sP < s.length() && tP < t.length()){
          if(t.charAt(tP) == s.charAt(sP)){
            sP++;
          }
          tP++;
        }
        return sP == s.length();
    }
}
