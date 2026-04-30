class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstZeroOrPositive = lowerBound(nums, 0);  // first ≥ 0
        int firstPositive = lowerBound(nums, 1);        // first > 0

        int negativeCount = firstZeroOrPositive;
        int positiveCount = n - firstPositive;

        return Math.max(negativeCount, positiveCount);
    }

    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
