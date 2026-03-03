// Given a string s, find the length of the longest substring without duplicate characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2){
            return s.length();
        }

        int len=0, l=0, r=0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(r<s.length()){
            char ch = s.charAt(r);
            if (map.containsKey(ch) && map.get(ch) >= l) {
                l = map.get(ch) + 1;
            }
            map.put(ch, r);
            len = Math.max(len, r - l + 1);
            r++;
        }
        return len;
    }
}
