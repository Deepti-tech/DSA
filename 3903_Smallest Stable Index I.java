class Solution {
    private int getMinAfterCurrentIndex(int index, int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=index; i<nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        return min;
    }
    private int getMaxBeforeCurrentIndex(int index, int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=index; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int minAfterCurrentIndex = getMinAfterCurrentIndex(i, nums);
            int maxAfterCurrentIndex = getMaxBeforeCurrentIndex(i, nums);
            if(maxAfterCurrentIndex - minAfterCurrentIndex <= k){
                return i;
            }
        }
        return -1;
    }
}
