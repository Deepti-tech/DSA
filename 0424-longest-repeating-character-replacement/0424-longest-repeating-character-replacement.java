class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            
            // Add new char in window
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // reduce the window if more new char are in the window than allowed
            int noOfUpdatedChar = right-left+1 - maxFreq;
            while (noOfUpdatedChar > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                noOfUpdatedChar = right-left+1 - maxFreq;
            }

            // check the max length of window
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}