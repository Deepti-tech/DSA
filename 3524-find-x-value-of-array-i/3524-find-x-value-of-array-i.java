class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {

            long[] newDp = new long[k];

            // subarray [num]
            newDp[num % k]++;

            // extend previous subarrays
            for (int r = 0; r < k; r++) {
                int newRemainder = (int)((long) r * (num % k) % k);
                newDp[newRemainder] += dp[r];
            }

            // add all subarrays ending here to final answer
            for (int r = 0; r < k; r++) {
                result[r] += newDp[r];
            }

            dp = newDp;
        }
        return result;
    }
}