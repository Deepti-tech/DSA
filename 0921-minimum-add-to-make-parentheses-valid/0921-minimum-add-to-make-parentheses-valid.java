class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        int open = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                open++;
            }else{
                if(stack.isEmpty()){
                    count++;
                }else{
                    stack.pop();
                    open--;
                }
            }
        }

        // if(stack.size() > 0){
        //     count += stack.size();
        // }
        return open + count;
    }
}