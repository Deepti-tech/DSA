// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

class Solution {
    public int thirdMax(int[] nums) {
        Long max1 = null, max2 = null, max3 = null;

        for (int n : nums) {
            long num = n;

            // skip duplicates
            if ((max1 != null && num == max1) ||
                (max2 != null && num == max2) ||
                (max3 != null && num == max3)) {
                continue;
            }

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } 
            else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } 
            else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        return max3 == null ? max1.intValue() : max3.intValue();
    }
}
