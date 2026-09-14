class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()){
            return ans;
        }
        int[] freq = new int[26];
        Boolean isAnagram = true;
        for(char ch : p.toCharArray()){
            freq[ch-'a']++;
        }
        
        int[] windowFreq = new int[26];
        for(int i = 0; i < k; i++){
            char ch = s.charAt(
                i);
            windowFreq[ch-'a']++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0 && freq[i] != windowFreq[i]){
                isAnagram = false;
            }
        }
        if(isAnagram){
            ans.add(0);
        }

        for(int i=k; i<s.length(); i++){
            char ch = s.charAt(i-k);
            windowFreq[ch-'a']--;

            ch = s.charAt(i);
            windowFreq[ch-'a']++;

            if(isAnagram){
                if(freq[ch-'a'] == windowFreq[ch-'a']){
                    ans.add(i-k+1);
                }else{
                    isAnagram = false;
                }
            }else{
                isAnagram = true;
                for(int j=0; j<freq.length; j++){
                    if(freq[j] != 0 && freq[j] != windowFreq[j]){
                        isAnagram = false;
                        break;
                    }
                }
                if(isAnagram){
                    ans.add(i-k+1);
                }
            }
        }
        return ans;
    }
}
