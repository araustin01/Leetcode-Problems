public class Solution {
    public bool IsPalindrome(int x) {
        if(x < 0) // signed values aren't palindromes
            return false;
        
        int num = x; // copy of x for calculation
        int rev = 0; // reversed value of num
        
        while(num != 0) 
        {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        
        return x == rev;
    }
}