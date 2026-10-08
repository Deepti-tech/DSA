class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        int open = 0, close = 0;
        boolean primitiveFound = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!primitiveFound && curr.isEmpty() && ch == '('){
                primitiveFound = true;
            }else if(primitiveFound && ch == '('){
                open++;
                curr.append(ch);
            }else if(ch == ')'){
                if(curr.isEmpty()){
                    primitiveFound = false;
                    continue;
                }
                if(close < open){
                    curr.append(ch);
                    close++;
                }else{
                    close = 0; open = 0;
                    primitiveFound = false;
                    ans.append(curr);
                    curr.setLength(0);
                }
            }
        }
        
        return ans.toString();
    }
}