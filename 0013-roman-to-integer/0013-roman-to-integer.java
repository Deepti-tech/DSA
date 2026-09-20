class Solution {
    private int value(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        int pointer = 0;
        int sum = 0;     

        do{
            int a= value(s.charAt(pointer));
            int b= pointer+1 == s.length() ? 0 : value(s.charAt(pointer+1));
            
            if(a < b){
                sum += b - a;
                pointer++;
            }
            else{
                sum += a;
            }
            pointer++;
        }while(pointer < s.length());

        return sum;
    }
}