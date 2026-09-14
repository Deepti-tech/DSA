class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxAfterCurrentIndex = Integer.MIN_VALUE;
        int minAfterCurrentIndex = Integer.MAX_VALUE;

        int[] suffixMin = new int[nums.length];
        int min = Integer.MAX_VALUE;

        for(int i= nums.length-1; i>=0; i--){
            min = Math.min(min, nums[i]);
            suffixMin[i] = min;
        }
        for(int i=0; i<nums.length; i++){
            minAfterCurrentIndex = suffixMin[i];
            maxAfterCurrentIndex = Math.max(maxAfterCurrentIndex, nums[i]);
            if(maxAfterCurrentIndex - minAfterCurrentIndex <= k){
                return i;
            }
        }
        return -1;
    }
}
