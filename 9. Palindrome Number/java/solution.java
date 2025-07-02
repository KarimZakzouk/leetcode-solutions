class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        long result = 0;
        int number = x;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            result = result * 10 + digit;
        }
        if(result == x) return true;
        return false;
    }
}