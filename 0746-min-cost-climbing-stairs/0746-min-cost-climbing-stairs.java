class Solution {
    private int solve(int[] cost, int dp[], int i){
        if(i >= cost.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(solve(cost, dp, i + 1), solve(cost, dp, i + 2));

        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        // Arrays.fill(dp, -1);
        // return Math.min(solve(cost, dp, 0), solve(cost, dp, 1));

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<cost.length; i++){
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}