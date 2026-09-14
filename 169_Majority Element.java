// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
class Solution {
    public int majorityElement(int[] nums) {
        // if(nums.length == 1) return nums[0];
        // Arrays.sort(nums);        
        // int mid = nums.length/2;
        // if(nums[mid-1] == nums[mid]){
        //     return nums[mid];
        // }else{
        //     return nums[mid+1];
        // }

        int count=0, candidate=nums[0];
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] != candidate){
                count--;
            }else{
                count++;
            }
        }
        return candidate;
    }
}
