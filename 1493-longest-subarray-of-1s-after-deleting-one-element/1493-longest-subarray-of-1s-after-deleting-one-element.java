class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, len = 0, noOfZeros = 0;

        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0){
                noOfZeros++;
            }
            while(noOfZeros > 1){
                if(nums[left] == 0){
                    noOfZeros--;
                }
                left++;
            }
            len = Math.max(len, right-left+1);         
        }
        return len-1;
    }
}