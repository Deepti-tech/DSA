class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(sb); //push previous string
                sb = new StringBuilder(); // start with empty string
            } else if (ch == ')') {
                sb.reverse(); //reverse the current string
                sb = stack.pop().append(sb); //append the current string to previous string
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}