// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] arr:grid){
            int low=0,high=arr.length-1;
            while(low<high){
                int mid=low+(high-low)/2;
                if(arr[mid] >= 0){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }
            if(arr[low]<0){
                count+=(arr.length-low);
            }
        }
        return count;
    }
}
