class Solution {
    public long countCommas(long n) {
        if(n < 999){
            return 0;
        }
        long lower=1000, upper=0, nOfCommas=1, ans=0;
        while(lower <= n){
            upper = lower*1000 - 1;
            if(upper > n){
                upper = n;
            }

            ans += nOfCommas*(upper-lower+1);

            nOfCommas++;
            lower *= 1000;
        }

        return ans;   
    }
}
