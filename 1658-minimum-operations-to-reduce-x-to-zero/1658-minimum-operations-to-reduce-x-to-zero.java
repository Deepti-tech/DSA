class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        x = sum - x;

        if (x < 0) return -1;
        if (x == 0) return nums.length;

        int left = 0, maxLen = Integer.MIN_VALUE;
        sum = 0;

        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            
            while(sum > x){
                sum -= nums[left];
                left++;
            }

            if(sum == x){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen == Integer.MIN_VALUE ? -1 : nums.length - maxLen;
    }
}