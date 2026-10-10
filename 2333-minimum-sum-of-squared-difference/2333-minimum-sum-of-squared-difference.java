class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long sum=0; int n=nums1.length; int max=Integer.MIN_VALUE;
        int[] freq = new int[100001];

        for(int i=0; i<n; i++){
            int diff = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff);
            freq[diff]++;
            sum += diff;
        }

        int totalOps = k1+k2, count = 1;

        if(totalOps >= sum){
            return 0;
        }
        for(int i=max; i>0 && totalOps != 0; i--){
            if(freq[i] > 0){
                if(freq[i] >= totalOps){
                    freq[i] -= totalOps;
                    freq[i-1] += totalOps;
                    totalOps = 0;
                }else{
                    int temp = freq[i];
                    freq[i] = 0;
                    freq[i-1] += temp;
                    totalOps -= temp;
                }
            }
        }
        
        sum=0;
        for(int i=0; i<freq.length; i++){
            sum += (long) i*i*freq[i];
        }
        return sum;
    }
}