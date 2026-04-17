// Given an integer n, return true if it is a power of four. Otherwise, return false.
class Solution {
    public boolean isPowerOfFour(int n) {
        int i=0;
        if(n==0) return false;
        while(n % 2 == 0){
            n = n/2;
            i++;
        }
        if(n == 1 && i%2 == 0){
            return true;
        }
        return false;
    }
}
