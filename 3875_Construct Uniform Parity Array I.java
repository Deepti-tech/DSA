class Solution {
    private boolean canBeConvertedToOdd(int i, int[] num){
        for(int j=0; j<num.length; j++){
            if(j == i){
                continue;
            }
            if((num[j]-num[i] % 2 != 0) || (num[i]-num[j] % 2 != 0)){
                return true;
            }
        }
        return false;
    }
    private boolean canBeConvertedToEven(int i, int[] num){
        for(int j=0; j<num.length; j++){
            if(j == i){
                continue;
            }
            if((num[j]-num[i] % 2 == 0) || (num[i]-num[j] % 2 == 0)){
                return true;
            }
        }
        return false;
    }
    public boolean uniformArray(int[] nums1) {
        boolean evenUntilNow=true, oddUntilNow=true;

        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 == 0){
                if(!canBeConvertedToOdd(i, nums1)){
                    oddUntilNow = false;
                }
            }else{
                if(!canBeConvertedToEven(i, nums1)){
                    evenUntilNow = false;
                }
            }

            if(!evenUntilNow && !oddUntilNow){
                return false;
            }
        }

        return (evenUntilNow || oddUntilNow);
    }
}
