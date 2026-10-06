class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            max = Math.max(n, max);
        }

        int freq[] = new int[max+1];
        for(int n : nums){
            freq[n]++;
        }
        int dp[] = new int[max+1];
        dp[0] = 0;
        dp[1] = freq[1];

        for(int n=2; n<=max; n++){
            dp[n] = Math.max(dp[n-1], n * freq[n] + dp[n-2]);
        }

        return dp[max];
    }
}