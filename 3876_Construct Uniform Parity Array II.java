class Solution {

    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int num : nums1){
            min = Math.min(min,num);
        }

        //minimum is odd->always possible
        if(min%2 == 1){
            return true;
        }
        //minimum is even -> all elements must be even 
        for(int num : nums1){
            if(num%2 == 1){
                return false;
            }
        }
        return true;
    }

    private int smallestOdd = Integer.MAX_VALUE, smallestEven = Integer.MAX_VALUE;
    private boolean canBeConvertedToOdd(int i, int[] num){
        if(((num[i]-smallestOdd) > 0) && ((num[i]-smallestOdd) % 2 != 0)){
            return true;
        }
        return false;
    }
    private boolean canBeConvertedToEven(int i, int[] num){
        if(((num[i]-smallestOdd) > 0) && ((num[i]-smallestOdd) % 2 == 0)){
            return true;
        }
        return false;
    }
    public boolean uniformArrayApporach2(int[] nums1) {
        boolean evenUntilNow=true, oddUntilNow=true;

        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 == 0){
                smallestEven = Math.min(smallestEven, nums1[i]);
            }else{
                smallestOdd = Math.min(smallestOdd, nums1[i]);
            }
        }

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
