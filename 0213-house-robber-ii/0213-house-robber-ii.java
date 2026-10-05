class Solution {
    private int solve(int[] nums, int start, int end){
        int dp[] = new int[nums.length];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start+1], nums[start]);

        for(int i=2; i<=end - start; i++){
            dp[i] = Math.max(dp[i-1], nums[start + i] + dp[i-2]);
        }

        return Math.max(dp[end-1], dp[end]);
    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n <= 1){
            return nums[0];
        }else if(n == 2){
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(solve(nums, 0, n-2), solve(nums, 1, n-1));
    }
}