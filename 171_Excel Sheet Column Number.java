// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length(); 
        int ans = 0;
        int val;

        for(int x=0; x<len; x++){
            val = ((int) columnTitle.charAt(x)) - 64;
            ans = val + (ans)*26;
        }
        return ans;
    }
}
