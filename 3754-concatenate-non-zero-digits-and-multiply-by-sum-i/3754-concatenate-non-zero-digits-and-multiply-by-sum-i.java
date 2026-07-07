class Solution {
    public long sumAndMultiply(int n) {
        long num =  n;
        long ans = 0;
        long s = 1;
        long sum = 0;
        while( num > 0){
            long digit = num % 10;
            if(digit != 0){
                ans += digit * s;
                s*=10;
                sum += digit;
            }
            num /=10;
        }
        return sum * ans;
    }
}