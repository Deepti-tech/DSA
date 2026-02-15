// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(rowIndex == 0) return ans.get(0);
        if(rowIndex>1){
            ans.add(Arrays.asList(1,1));
        }
        for (int i=2; i<=rowIndex; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1; j<i; j++){
                temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            temp.add(1);
            if(i==rowIndex){
                return temp;
            }
            ans.add(temp);
        }
        return Arrays.asList(1,1);
    }
}
