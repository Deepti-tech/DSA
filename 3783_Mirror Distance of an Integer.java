// Define its mirror distance as: abs(n - reverse(n))​​​​​​​ where reverse(n) is the integer formed by reversing the digits of n.

// Return an integer denoting the mirror distance of n​​​​​​​.
// abs(x) denotes the absolute value of x.

class Solution {
    public int mirrorDistance(int n) {
        int rev=0, num = n;
        while(n != 0){
            int digit =  n%10;
            rev = rev*10 + digit;
            n=n/10;
        }
        return rev>num ? rev-num : num-rev;
    }
}
