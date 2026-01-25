// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        if(s.length() == 1) return 1;
        if(s.charAt(i) == ' '){
            while(s.charAt(i) == ' ') i--;
        }
        if(s.charAt(i) != ' '){
            while(s.charAt(i) != ' '){
                count++;
                if(i>0) i--;
                else break;
            }
        }
        return count;
    }
}
