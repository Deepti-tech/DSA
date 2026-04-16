// Reverse bits of a given 32 bits signed integer.

class Solution {
    public int reverseBits(int n) {
        int bits = 0;
        for(int i = 0; i < 32; i++){
            int bit = n & 1;
            bits = bit | (bits << 1);
            n = n >> 1;
        }
        return bits;
    }
}
