class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThanTarget=0, noOfTarget=0;
        for(int num : nums){
            if(num < target){
                lessThanTarget++;
            }else if(num == target){
                noOfTarget++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0; i < noOfTarget; i++){
            ans.add(lessThanTarget + i);
        }
        return ans;
    }
}