class Solution {
    public boolean isPalindrome(int x) {
        int i = x;
        int number = 0;
            while(i>=1) {
            int remainder = i%10;
            number = number*10+remainder;
            i=i/10;
        }
        return number==x;
    
    }
}
