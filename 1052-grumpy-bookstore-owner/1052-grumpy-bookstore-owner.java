class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = Integer.MIN_VALUE;
        int windowExtra = 0; int maxExtra = 0, baseSatisfied = 0;
        for(int i=0; i<customers.length; i++){
            if(grumpy[i] == 0){
                baseSatisfied += customers[i];
            }
        }
        for(int i=0; i<minutes; i++){
            if (grumpy[i] == 1) {
                windowExtra += customers[i];
            }
        }
        
        maxExtra = windowExtra;

        for(int i=minutes; i<customers.length; i++){
            if (grumpy[i] == 1) {
                windowExtra += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                windowExtra -= customers[i - minutes];
            }
            maxExtra = Math.max(maxExtra, windowExtra);
        }
        return baseSatisfied + maxExtra;
    }
}