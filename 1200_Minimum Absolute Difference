// Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

// Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

// a, b are from arr
// a < b
// b - a equals to the minimum absolute difference of any two elements in arr

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            diff = diff > arr[i+1]-arr[i] ? arr[i+1]-arr[i] : diff;
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1]-arr[i] == diff){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]); temp.add(arr[i+1]);
                ans.add(temp);
            }            
        }
        return ans;
    }
}
