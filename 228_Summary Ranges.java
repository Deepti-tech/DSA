// You are given a sorted unique integer array nums.

// A range [a,b] is the set of all integers from a to b (inclusive).

// Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if(nums.length <1)            return ans;        
        
        int i=0;        
        String temp = String.valueOf(nums[0]);
        while(nums.length != 1 && i<nums.length-1){
            if(nums[i]+1 != nums[i+1]){
                if(!temp.equals(String.valueOf(nums[i]))){
                    temp = temp.concat("->");
                    temp = temp.concat(String.valueOf(nums[i]));
                }
                ans.add(temp);
                temp = String.valueOf(nums[i+1]);
            }
            i++;
        }
        if(nums.length != 1 && nums[i] - nums[i-1] == 1){
            temp = temp.concat("->");
            temp = temp.concat(String.valueOf(nums[i]));
        }
        ans.add(temp);
        return ans;
    }
}
