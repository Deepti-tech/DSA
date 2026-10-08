class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int open = 0;
        boolean primitiveFound = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!primitiveFound && ch == '('){
                primitiveFound = true;
            }else if(primitiveFound && ch == '('){
                open++;
                ans.append(ch);
            }else if(ch == ')'){
                if(ans.isEmpty()){
                    primitiveFound = false;
                    continue;
                }
                if(open != 0){
                    ans.append(ch);
                    open--;
                }else{
                    open = 0;
                    primitiveFound = false;
                }
            }
        }
        
        return ans.toString();
    }
}