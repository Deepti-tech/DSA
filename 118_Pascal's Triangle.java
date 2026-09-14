// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(numRows > 1){
            ans.add(Arrays.asList(1,1));
        }

        for(int i=0; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1; j<i; j++){
                temp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
