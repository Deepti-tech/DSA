class Solution {
    private Boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max=0, counter=0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                counter++;
            }
        }
        max = counter;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                counter--;
            }
            if(isVowel(s.charAt(i))){
                counter++;
                max = Math.max(max, counter);
            }
        }
        return max;
    }
}
