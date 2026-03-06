// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums1){
            freq[n]+=1;
        }

        for(int n : nums2){
            if(freq[n] > 0){
                list.add(n);
                freq[n]-=1;
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
