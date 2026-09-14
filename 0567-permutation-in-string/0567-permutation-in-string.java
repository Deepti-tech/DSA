class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if(s1.length() > s2.length()){
            return false;
        }
        int[] freq = new int[26];
        boolean isAnagram = true;
        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }
        
        int[] windowFreq = new int[26];
        for(int i = 0; i < k; i++){
            char ch = s2.charAt(i);
            windowFreq[ch-'a']++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0 && freq[i] != windowFreq[i]){
                isAnagram = false;
            }
        }
        if(isAnagram){
            return true;
        }

        for(int i=k; i<s2.length(); i++){
            char ch = s2.charAt(i-k);
            windowFreq[ch-'a']--;

            ch = s2.charAt(i);
            windowFreq[ch-'a']++;

            isAnagram = true;
            for(int j=0; j<26; j++){
                if(freq[j] != windowFreq[j]){
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                return true;
            }
        }
        return false;
    }
}
