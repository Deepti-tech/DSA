class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                StringBuilder key = new StringBuilder();
                i++;

                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                sb.append(map.getOrDefault(key.toString(), "?"));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}