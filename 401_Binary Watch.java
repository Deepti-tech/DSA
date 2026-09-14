// A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.
class Solution {
    private int countBits(int n){
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int h=0; h<=11; h++){
            for(int m=0; m<=59; m++){
                if(countBits(h) + countBits(m) == turnedOn){
                    if(m<10){
                        ans.add(h+":0"+m);
                    }else{
                        ans.add(h+":"+m);
                    }                    
                }
            }
        }
        return ans;
    }
}
