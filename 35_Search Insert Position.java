// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int search(int[] nums, int target, int start, int end){
        if(start > end){
            return start;
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return search(nums, target, start, mid-1);
        } else {
            return search(nums, target, mid+1, end);
        }
    }
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
}
