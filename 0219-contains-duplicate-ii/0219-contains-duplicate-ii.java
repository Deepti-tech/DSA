// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> arr = new HashSet<>();
        for(int curr=0; curr<=nums.length-1; curr++){
            if(!arr.isEmpty() && arr.contains(nums[curr])){
                return true;
            }
            arr.add(nums[curr]);
            if(arr.size() > k){
                arr.remove(nums[curr-k]);
            }
        }
        return false;
    }
}
