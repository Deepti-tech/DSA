class Solution {
    public int countCommas(int n) {
        int len=0, num = n;
        while (num>0){
            num = num/10;
            len++;
        }
        if(len < 4){
            return 0;
        }

        int nOfCommas = (int) Math.floor(len/3);
        nOfCommas = len%3 == 0 ? nOfCommas-1 : nOfCommas;

        int count = n-1000;
        
        return nOfCommas * (count+1);        
    }
}
