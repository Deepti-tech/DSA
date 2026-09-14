class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int p1 = 0, p2 = 0, i = 2;
        while(i < nums.length){
            if(arr1[p1] > arr2[p2]){
                arr1[++p1] = nums[i];
            }else{
                arr2[++p2] = nums[i];
            }
            i++;
        }
        p2=0;
        while(p1 < nums.length - 1){
            arr1[++p1] =arr2[p2++];
            i++;
        }
        return arr1;
    }
}
