// Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=arr1.length;
        for(int n1 : arr1){
            for(int n2 : arr2){
                if(Math.abs(n1-n2) <= d){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
