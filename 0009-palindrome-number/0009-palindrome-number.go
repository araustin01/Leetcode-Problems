func isPalindrome(x int) bool {
    if x < 0 { // can't be palindrome if signed
        return false;
    }
    
    var num = x; // copy x value
    var reversed int = 0; 
    for num != 0 {
        reversed = (reversed * 10) + (num % 10)
        num /= 10;
    }
    
    return reversed == x;
}