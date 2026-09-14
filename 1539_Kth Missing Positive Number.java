// Return the kth positive integer that is missing from this array.
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        int mis=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            mis=arr[mid]-(mid+1);
            if(mis<k){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return low+k;
    }
}
