class Solution {
    public boolean isPalindrome(int x) {
        int lastDigit = 0;
        int reverse = 0;
        int y = x;

        while(y > 0){
            lastDigit = y % 10;
            reverse = (reverse * 10) + lastDigit;
            y /= 10;
        }

        return x == reverse;
    }
}
