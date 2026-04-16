// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0, pos=0; i<32; i++,pos++){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
