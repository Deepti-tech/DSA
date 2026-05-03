// Return the number of fruit types that remain unplaced after all possible allocations are made.

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i=0; i<fruits.length; i++){
            boolean unplaced = true;
            for(int j=0; j<baskets.length; j++){
                if(baskets[j] >= fruits[i]){
                    baskets[j] = 0;
                    unplaced = false;
                    break;
                }
            }
            if(unplaced == true){
                count ++;
            }
        }
        return count;
    }
}
