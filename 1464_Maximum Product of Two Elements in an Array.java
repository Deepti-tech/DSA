// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE, max2=Integer.MAX_VALUE;
        for(int num : nums){
            if(num-1 > max1){
                max2 = max1;
                max1 = num-1;
            }else if(num-1 > max2){
                max2 = num-1;
            }
        }
        return max1*max2;
    }
}
