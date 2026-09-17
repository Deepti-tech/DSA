class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int len = arr.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        Arrays.fill(prefix, Integer.MAX_VALUE);
        Arrays.fill(suffix, Integer.MAX_VALUE);

        int left=0, sum=0;
        for(int right=0; right<len; right++){
            sum += arr[right];
            if (right > 0) {
                prefix[right] = prefix[right - 1];
            }
            if (sum == target) {
                prefix[right] = Math.min(prefix[right], right - left + 1);
            }
            while(sum >= target){
                if (sum == target) {
                    prefix[right] = Math.min(prefix[right], right - left + 1);
                }
                sum -= arr[left];
                left++;
            }
        }

        int right = len - 1; sum = 0;

        for (left = len - 1; left >= 0; left--) {
            sum += arr[left];
            if (left < len - 1) {
                suffix[left] = suffix[left + 1];
            }
            if (sum == target) {
                suffix[left] = Math.min(suffix[left], right - left + 1);
            }
            while(sum >= target){
                if (sum == target) {
                    suffix[left] = Math.min(suffix[left], right - left + 1);
                }
                sum -= arr[right];
                right--;
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<len-1; i++){
            if (prefix[i] != Integer.MAX_VALUE && suffix[i + 1] != Integer.MAX_VALUE) {
                ans = Math.min(ans, prefix[i] + suffix[i + 1]);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}