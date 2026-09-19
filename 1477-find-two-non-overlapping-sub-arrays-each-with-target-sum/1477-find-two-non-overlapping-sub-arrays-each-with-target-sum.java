class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int len = arr.length;
        int[] suffix = new int[len];
        Arrays.fill(suffix, Integer.MAX_VALUE);

        int ans = Integer.MAX_VALUE;
        int right = len - 1, sum = 0;

        for (int left = len - 1; left >= 0; left--) {
            sum += arr[left];
            if (left < len - 1) {
                suffix[left] = suffix[left + 1];
            }
            if (sum == target) {
                suffix[left] = Math.min(suffix[left], right - left + 1);
            }
            while(sum >= target){
                if (sum == target) {
                    int currentLen = right-left+1;
                    if(right+1 < len && suffix[right+1] != Integer.MAX_VALUE){
                        ans = Math.min(ans, currentLen + suffix[right+1]);
                    }
                    suffix[left] = Math.min(suffix[left], currentLen);
                }
                sum -= arr[right];
                right--;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}