class Solution {
    private int digitSum(int n){
        int sum=0;
        while(n > 0){
            int digit = n%10;
            sum += digit;
            n = n/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        Integer[] boxedArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, (a, b) -> {
            if(digitSum(a) != digitSum(b)){
                return Integer.compare(digitSum(a), digitSum(b));
            } else {
                return Integer.compare(a, b);
            }
        });

        int swapCount = 0;
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            int expected = boxedArr[i];
            if(curr != expected){
                nums[i] = expected;
                int index = map.get(expected);
                nums[index] = curr;
                swapCount++;
                map.put(nums[i], i);
                map.put(nums[index], index);
            }
        }
        return swapCount;
    }
}