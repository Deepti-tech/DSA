class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max1 = max2 = max3 = Integer.MIN_VALUE;
        int min1 = min2 = Integer.MAX_VALUE;
        if(n>=3){
            for(num : nums){
                if(num > max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                }else if(num > max2){
                    max3 = max2;
                    max2 = num;
                }else if(num > max3){
                    max3 = num;
                }

                if(num < min1){
                    min2 = min1;
                    min1 = num;
                }else if(num < min2){
                    min2 = num;
                }
            }
        }
        return 0;
    }
}
