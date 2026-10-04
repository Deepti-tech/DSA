class Solution {
    public boolean checkValidString(String s) {

        int minOpen = 0, maxOpen = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                minOpen++; maxOpen++;
            } else if (ch == '*') {
                minOpen = Math.max(0, minOpen - 1);
                maxOpen++;
            } else { // ')'
                if (minOpen > 0) {
                    minOpen--; maxOpen--;
                } else if (maxOpen > 0) {
                    maxOpen--;
                } else {
                    return false;
                }
            }
        }

        return minOpen == 0;
    }
}