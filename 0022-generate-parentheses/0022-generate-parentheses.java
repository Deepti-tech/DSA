class Solution {
    private void backtrack(int open, int close, StringBuilder str, int n, List<String> ans){
        if(open == n && close == n){
            ans.add(str.toString());
            return;
        }
        if(open < n){
            str.append('(');
            backtrack(open+1, close, str, n, ans);
            str.deleteCharAt(str.length() - 1);
        }

        if (close < open) {
            str.append(')');
            backtrack(open, close+1, str, n, ans);
            str.deleteCharAt(str.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        backtrack(0, 0, str, n, ans);
        return ans;
    }
}