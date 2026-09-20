class Solution {
    public int longestSubarray(int[] nums) {
        boolean zeroDeleted = false;
        int left = 0, len = 0;

        for(int right=0; right<nums.length; right++){
            if(zeroDeleted && nums[right] == 0){
                while(zeroDeleted){
                    if(nums[left] == 0){
                        zeroDeleted = false;
                    }
                    left++;
                }
            }
            if(!zeroDeleted && nums[right] == 0){
                zeroDeleted = true;
            }
            len = Math.max(len, right-left+1);         
        }
        return len-1;
    }
}