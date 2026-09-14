// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        int start = 0; int end = x;
        while (start < x){
            int mid = start + (end - start)/2;
            long sq = (long) mid * mid;
            long nextSq = (long) (mid + 1) * (mid + 1);
            if (sq == x) {
                return mid;
            } else if (sq < x && x < nextSq) {
                return mid;
            }
            if(sq < x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return 0;
    }
}
