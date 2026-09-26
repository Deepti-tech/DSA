class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                String key = "";
                i++;
                while(s.charAt(i) != ')'){
                    key += s.charAt(i);
                    i++;
                }
                if(map.containsKey(key)){
                    sb.append(map.get(key));
                }else{
                    sb.append('?');
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}