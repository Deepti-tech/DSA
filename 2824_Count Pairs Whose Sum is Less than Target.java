// Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        int i=0;
        int j=nums.size()-1;
        while(i<j){
            if(nums.get(i) + nums.get(j) < target){
                count += j-i;
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}
