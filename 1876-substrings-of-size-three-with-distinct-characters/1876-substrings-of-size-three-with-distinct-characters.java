class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3){
            return 0;
        }
        int counter=0, distinct=0;
        int[] freq = new int[26];

        for(int i=0; i<3; i++){
            int index = s.charAt(i) - 'a';
            if(freq[index] == 0){
                distinct++;
            }
            freq[index]++;
        }
        if(distinct == 3){
            counter++;
        }

       for(int right = 3; right < s.length(); right++){
           int leftCharToRemove = s.charAt(right-3) - 'a';
           freq[leftCharToRemove]--;
           if(freq[leftCharToRemove] == 0) distinct--;

           int rightCharToAdd = s.charAt(right) - 'a';
           freq[rightCharToAdd]++;
           if(freq[rightCharToAdd] == 1) distinct++;

           if(distinct == 3)              counter++;
       }
        return counter;
    }
}
