// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int n:nums2){
            if(set1.remove(n)){
                list.add(n);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;        
    }
}
