// You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

// Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

// Return the minimum possible difference.

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<=nums.length-k; i++){
            diff = nums[i+k-1] - nums[i] < diff ? nums[i+k-1] - nums[i] : diff;
        }
        return diff;
    }
}
