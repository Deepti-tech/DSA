class Solution {
    // int dp[] = new int[46];
    // private int recursionMethod(int n){
    //     if(n < 0) return 0;

    //     if(dp[n] != -1){
    //         return dp[n];
    //     }

    //     if(n == 0) return 1;

    //     int one_steps = recursionMethod(n-1);
    //     int two_steps = recursionMethod(n-2);

    //     return dp[n] = one_steps + two_steps;
    // }
    public int climbStairs(int n) {
        // Arrays.fill(dp, -1);
        // return recursionMethod(n);

        if(n == 0 || n == 1 || n == 2) return n;

        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}