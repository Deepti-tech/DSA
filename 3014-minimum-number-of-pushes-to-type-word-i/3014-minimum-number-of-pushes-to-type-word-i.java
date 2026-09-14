// Return the minimum number of pushes needed to type word after remapping the keys.

class Solution {
    public int minimumPushes(String word) {
        if(word.length() <= 8){
            return word.length();
        }

        int rem = word.length() % 8;
        int n = word.length() / 8;
        int count=0;
        
        if(n>1 || rem == 0){
            count = (n * (n + 1) / 2) *8;
        }else{
            count = 8 + (n-1)*8;
        }

        if(rem > 0){            
            int i = n+1;
            do{
                count = count + (i*rem);
                i++;
            }while(rem > 8);
        }
        return count;
    }
}
