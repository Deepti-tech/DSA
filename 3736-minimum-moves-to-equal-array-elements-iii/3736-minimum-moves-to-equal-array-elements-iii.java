class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max, num);
        }

        int counter = 0;
        for(int num : nums){
            counter += Math.abs(num - max);
        }

        return counter;
    }
}