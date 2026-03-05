// Given a string s, reverse only all the vowels in the string and return it.

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0, r=s.length()-1;
        char temp;
        while(l<r){
            while(l<r && "aeiouAEIOU".indexOf(arr[r]) == -1){
                r--;
            }
            while(l<r && "aeiouAEIOU".indexOf(arr[l]) == -1){
                l++;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;            
        }

        return new String(arr);
    }
}
