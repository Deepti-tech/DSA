class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r){
            while(!Character.isLetterOrDigit(s.charAt(l)) && l<s.length()-1){
                l++;
            }
            while(!Character.isLetterOrDigit(s.charAt(r)) && r>0){
                r--;
            }
            if (l > r) break;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++; r--;
        }
        return true;
    }
}