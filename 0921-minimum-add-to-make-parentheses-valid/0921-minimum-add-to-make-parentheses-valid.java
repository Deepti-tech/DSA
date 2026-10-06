class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    count++;
                }else{
                    stack.pop();
                }
            }
        }

        if(stack.size() > 0){
            count += stack.size();
        }
        return count;
    }
}