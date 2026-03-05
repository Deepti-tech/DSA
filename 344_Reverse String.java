// Write a function that reverses a string. The input string is given as an array of characters s.

class Solution {
    public void reverseString(char[] s) {
      int l=0, r=s.length-1;
      char temp;
      while(l<r){
        temp = s[r];
        s[r] = s[l];
        s[l] = temp;
        r--; l++;
      }
    }
}
