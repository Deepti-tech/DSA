// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i = digits.length - 1;
        while (carry != 0){
            int sum = digits[i] + 1;
            carry = sum / 10;
            digits[i] = sum % 10;
            if (i>0) i--;
            else break;
        }
        if(carry != 0){
            int[] ans = new int[digits.length+1];
            for(int j=digits.length; j>0; j--){
                ans[j] = digits[j-1];
            }
            ans[0] = carry;
            return ans;
        }
        return digits;
    }
}
