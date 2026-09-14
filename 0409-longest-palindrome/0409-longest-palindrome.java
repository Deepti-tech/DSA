// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52];
        int len = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch <= 'Z'){
                freq[ch - 'A']++;
            }else{
                freq[ch - 'a' + 26]++;
            }
        }

        Boolean odd = false;
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                if(freq[i]%2 == 0){
                    len+=freq[i];
                }else{
                    len+=freq[i]-1;
                    odd = true;
                }
            }
        }
        return odd ? len+1 : len;
    }
}
