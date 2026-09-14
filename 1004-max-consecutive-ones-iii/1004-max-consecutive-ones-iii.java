class Solution {
    public int longestOnes(int[] nums, int k) {
        int NoflippedZeros = 0;
        int left=0, max=0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]==0){
                NoflippedZeros++;
            }
            while(NoflippedZeros > k){
                if(nums[left]==0) NoflippedZeros--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;        
    }
}