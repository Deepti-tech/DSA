class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        
        long score=0;
        int n = nums.length, mid = n/2;
        for(int i=n-1; i>=n/2; i--){
            score += nums[i];
        }
        for(int i=0; i<n/2; i++){
            score -= nums[i];
        }

        return score;
    }
}