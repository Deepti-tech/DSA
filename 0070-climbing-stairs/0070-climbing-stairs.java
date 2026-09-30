class Solution {
    int dp[] = new int[46];
    private int solve(int n){
        if(n < 0) return 0;

        if(dp[n] != -1){
            return dp[n];
        }

        if(n == 0) return 1;

        int one_steps = solve(n-1);
        int two_steps = solve(n-2);

        return dp[n] = one_steps + two_steps;
    }
    public int climbStairs(int n) {
        Arrays.fill(dp, -1);
        return solve(n);
    }
}