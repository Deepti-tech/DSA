class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(sb);
                sb = new StringBuilder();
            } else if (ch == ')') {
                sb.reverse();
                sb = stack.pop().append(sb);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}