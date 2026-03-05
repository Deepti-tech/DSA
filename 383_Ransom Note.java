// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        int index;
        for(int i=0; i<magazine.length(); i++){
            index = magazine.charAt(i) - 'a';
            freq[index]+=1;
        }
        for(int i=0; i<ransomNote.length(); i++){
            index = ransomNote.charAt(i) - 'a';
            if(freq[index] == 0){
                return false;
            }
            freq[index]-=1;
        }
        return true;
    }
}
