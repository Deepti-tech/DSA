class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> bracketPosition = new Stack<>();
        Stack<Integer> asteriskPosition = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                bracketPosition.push(i);

            } else if (ch == '*') {
                asteriskPosition.push(i);

            } else { // ')'

                if (!bracketPosition.isEmpty()) {
                    bracketPosition.pop();
                } else if (!asteriskPosition.isEmpty()) {
                    asteriskPosition.pop();
                } else {
                    return false;
                }
            }
        }

        while (!bracketPosition.isEmpty() && !asteriskPosition.isEmpty()) {

            if (bracketPosition.peek() < asteriskPosition.peek()) {
                bracketPosition.pop();
                asteriskPosition.pop();
            } else {
                return false;
            }
        }

        return bracketPosition.isEmpty();
    }
}