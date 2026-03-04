// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] dict1 = new char[256];
        char[] dict2 = new char[256];
        
        for(int i=0; i<s.length(); i++){
            int index1 = (int) s.charAt(i);
            int index2 = (int) t.charAt(i);
            if(dict1[index1] != '\u0000'){
                if(dict1[index1] != t.charAt(i)){
                    return false;
                }
            }else if(dict2[index2] != '\u0000'){
                if(dict2[index2] != s.charAt(i)){
                    return false;
                }
            }else{
                dict1[index1] = t.charAt(i);
                dict2[index2] = s.charAt(i);
            }
        }
        return true;
    }
}
