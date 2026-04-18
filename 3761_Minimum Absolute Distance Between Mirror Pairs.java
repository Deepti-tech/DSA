// Return the minimum absolute distance between the indices of any mirror pair. The absolute distance between indices i and j is abs(i - j).
class Solution {
    private int reverse(int n){
        int rev=0;
        while(n != 0){
            int digit = n%10;
            rev = rev*10 + digit;
            n=n/10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                min = Math.min(min, i - map.get(nums[i]));
            }
            map.put(reverse(nums[i]), i);
        } 
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
