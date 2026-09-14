// Return the length of the longest subsequence in nums whose bitwise XOR is non-zero. If no such subsequence exists, return 0.

class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;

        for (int num : nums){
            ans = ans  ^ num;
        }
        if(ans == 0){
            for(int num : nums){
                if(num != 0){
                    return nums.length - 1;
                }
            }
            return 0;
        }
        return nums.length;
    }
}
