class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        int minPos=0, maxPos=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxPos = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minPos = i;
            }
        }

        int option1 = Math.max(minPos, maxPos) + 1;
        int option2 = nums.length - Math.min(minPos, maxPos);
        int option3 = (minPos + 1) + (nums.length - maxPos);
        int option4 = (nums.length - minPos) + (maxPos + 1);

        int minDeletions = Math.min(option1, option2);
        minDeletions = Math.min(minDeletions, option3);
        return Math.min(minDeletions, option4);
    }
}
