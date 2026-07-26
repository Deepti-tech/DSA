// Return the maximum product of any two digits in n.

class Solution {
    public int maxProduct(int n) {
        int rem=1, num=1, max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
        while(n != 0){
            rem = n%10;
            if(rem > max1){
                max2 = max1;
                max1 = rem;
            }else if(rem > max2){
                max2 = rem;
            }
            n=n/10;
        }
        return max1 * max2;
    }
}
