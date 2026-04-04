// Given a positive integer num, return true if num is a perfect square or false otherwise.
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0) return false;
        if(num == 1) return true;
        int low=0, high=num;
        while(low<high){
            int mid = low + (high - low)/2;
            long square = (long) mid * mid;
            if(square < num){
                low = mid+1;
            }else if(square > num){
                high = mid;
            }else{
                return true;
            }
        }
        return false;
    }
}
