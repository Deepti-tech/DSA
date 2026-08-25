class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int multiple = k; ; multiple += k){
            boolean multipleFound = false;
            for(int num : nums){
                if(num == multiple){
                    multipleFound = true;
                    break;
                }
            }
            if(!multipleFound){
                return multiple;
            }
        }
        // int[] tally = new int[101];
        // int max = Integer.MIN_VALUE;

        // for(int num : nums){
        //     if(num % k == 0){
        //         tally[num/k] = 1;
        //     }
        //     if(num > max){
        //         max = num;
        //     }
        // }

        // for(int i=1; i<tally.length; i++){
        //     if(tally[i] != 1){
        //         return k*i;
        //     }
        // }
        // return max+k;
    }
}
