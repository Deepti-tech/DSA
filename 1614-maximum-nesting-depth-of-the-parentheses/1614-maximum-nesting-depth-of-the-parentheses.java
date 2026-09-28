class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxDepth = Integer.MIN_VALUE;
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }else if(ch == ')'){
                depth--;
            }
        }
        return Math.max(maxDepth, 0);
    }
}