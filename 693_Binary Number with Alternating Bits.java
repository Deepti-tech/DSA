// Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

// Example 1:

// Input: n = 5
// Output: true
// Explanation: The binary representation of 5 is: 101

class Solution {
    public boolean hasAlternatingBits(int n) {
        List<Integer> binary = new ArrayList<>();
        int i = 0;
        while(n != 0){
            binary.add(n%2);
            if(i>0 && Objects.equals(binary.get(i - 1), binary.get(i))){
                return false;
            }
            n = n/2;
            i++;
        }
        return true;
    }
}
