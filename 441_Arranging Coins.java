// Given the integer n, return the number of complete rows of the staircase you will build.
class Solution {
    private boolean helper(int k, int n){
        long x = (long)k*(k+1)/2;
        return n>=x;
    }
    public int arrangeCoins(int n) {
        // int k=0;
        // for(int i=1; i<=n && n>-1; i++){
        //     k++;
        //     n-=i;
        // }
        int low=0, high=n;
        while(low<high){
            int mid = low + (high-low)/2;
            if(helper(mid,n)){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low-1;
    }
}
