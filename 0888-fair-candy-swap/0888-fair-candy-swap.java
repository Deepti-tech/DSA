// Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0, bobSum = 0;
        for(int i=0; i<aliceSizes.length; i++){
            aliceSum += aliceSizes[i];
        }
        for(int i=0; i<bobSizes.length; i++){
            bobSum += bobSizes[i];
        }
        int diff = (aliceSum - bobSum)/2;
        int[] arr = new int[2];
        for(int i=0; i<aliceSizes.length; i++){
            int x = aliceSizes[i];
            for(int j=0; j<bobSizes.length; j++){
                if(x - bobSizes[j] == diff){
                    arr[0] = x;
                    arr[1] = bobSizes[j];
                }
            }
        }
        return arr;
    }
}
