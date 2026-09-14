class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int counter = 0, windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        if(windowSum/k >= threshold){
            counter++;
        }
        for(int i=k; i<arr.length; i++){
            windowSum += arr[i] - arr[i-k];
            if(windowSum/k >= threshold){
                counter++;
            }
        }
        return counter;
    }
}
