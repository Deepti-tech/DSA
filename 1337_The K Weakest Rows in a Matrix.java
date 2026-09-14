// Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
class Solution {
    private int[][] sumOfSoldiers(int[][] mat){
        int[][] arr = new int[mat.length][2];
        for(int i=0; i<mat.length; i++){
            int low=0,high=mat[i].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mat[i][mid]==1){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            arr[i][0] = low; 
            arr[i][1] = i;
        }
        return arr;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] arr = sumOfSoldiers(mat);
        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = arr[i][1];
        }
        return ans;
    }
}
