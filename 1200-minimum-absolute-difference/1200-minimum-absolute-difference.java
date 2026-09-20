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