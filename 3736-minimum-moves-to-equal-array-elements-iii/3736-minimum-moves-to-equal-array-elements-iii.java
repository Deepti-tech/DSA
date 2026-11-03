class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int num : nums){
            sum += num;
            max = Math.max(max, num);
        }

        return max*nums.length - sum;

        // int counter = 0;
        // for(int num : nums){
        //     counter += Math.abs(num - max);
        // }

        // return counter;
    }
}