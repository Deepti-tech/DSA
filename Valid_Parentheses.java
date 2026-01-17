// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type
class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack[++top] = ch;
            }else if(top != -1){
                if((ch == '}'&& stack[top] != '{') ||
                   (ch == ']' && stack[top] != '[') ||
                   (ch == ')' && stack[top] != '(')){
                    return false;
                }
                top--;
            }else{
                return false;
            }
        }
        if(top != -1){
            return false;
        }
        return true;
    }
}
