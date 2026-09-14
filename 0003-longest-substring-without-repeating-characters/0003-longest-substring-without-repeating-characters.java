class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2){
            return s.length();
        }
        int len=0, left=0, right=0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(right<s.length()){
            char ch = s.charAt(right);
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
        // HashSet<Character> set = new HashSet<>();
        // int left=0, max=0;
        // for(int right=0; right<s.length(); right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     max = Math.max(max, right-left+1);
        // }
        // return max;
    // }
}