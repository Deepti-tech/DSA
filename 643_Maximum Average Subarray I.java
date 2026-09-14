class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0; int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        ans = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            ans = Math.max(ans, windowSum);
        }
        return ans/k;
    }
}
