// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0; int p2 = 0;

        while (p2 < nums.length) {
            if (nums[p2] != 0) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
            }
            p2++;
        }
    }
}
