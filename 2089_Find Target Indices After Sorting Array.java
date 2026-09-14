// Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0, counter=0, i=0;
        while(i<nums.length){
            if(nums[i] < target){
                counter++;
            }else if(nums[i] == target){
                count++;
            }
            i++;
        }
        List<Integer> ans = new ArrayList<>();
        while(count != 0){
            ans.add(counter++);
            count--;
        }
        return ans;
    }
}
