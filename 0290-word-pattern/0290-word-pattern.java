// Given a pattern and a string s, find if s follows the same pattern.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] map = new String[256];
        String[] words = s.split(" ");
        HashMap<String, Character> dict = new HashMap<>();

        if(words.length != pattern.length()){
            return false;
        }
        
        int index;
        for(int i=0; i<pattern.length(); i++){
            index = (int) pattern.charAt(i);
            if(map[index] != null){
                if(!map[index].equals(words[i])){
                    return false;
                }
            }else if(dict.containsKey(words[i])){
                if(pattern.charAt(i) != dict.get(words[i])){
                    return false;
                }
            }else{
                map[index] = words[i];
                dict.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
