class Solution {
    public boolean checkString(String s) {
        boolean bSpotted = false;
        for(char ch : s.toCharArray()){
            if (ch == 'b') {
                bSpotted = true;
            } else if (bSpotted && ch == 'a') {
                return false;
            }
        }
        return true;
    }
}