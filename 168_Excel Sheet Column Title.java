// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        char ans;
        while(columnNumber>0){            
            ans = (char) ('A' + (--columnNumber % 26));
            str.append(String.valueOf(ans));
            columnNumber/=26;
        }
        return str.reverse().toString();
    }
}
