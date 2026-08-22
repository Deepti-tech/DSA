class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, num = n, prod = 1;

        while(num != 0){
            int digit = 0;
            digit = num % 10;
            sum += digit;
            prod *= digit;
            num /= 10;
        }
        
        sum = sum + prod;
        return (n % sum == 0) ? true : false;
    }
}
