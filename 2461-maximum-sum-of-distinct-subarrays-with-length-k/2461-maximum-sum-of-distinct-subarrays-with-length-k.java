class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int distinctCounter=0;
        long max=0, sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k; i++){
            int value=0;
            if(!map.containsKey(nums[i]) || map.get(nums[i])<1)   distinctCounter++;
            else value =  map.get(nums[i]);
            sum += nums[i];
            map.put(nums[i], ++value);
        }
        if(distinctCounter == k){
            max = sum;
        }

        for(int right=k; right<nums.length; right++){
            int leftNumToRemove = right-k;
            int value = map.get(nums[leftNumToRemove]);;
            sum -= nums[leftNumToRemove];
            if(map.get(nums[leftNumToRemove])<=1) distinctCounter--;
            map.put(nums[leftNumToRemove], --value);

            value = 0;
            sum += nums[right];
            if(!map.containsKey(nums[right]) || map.get(nums[right])<1)  distinctCounter++;
            else value =  map.get(nums[right]);
            map.put(nums[right],  ++value);

            if(distinctCounter == k){
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
