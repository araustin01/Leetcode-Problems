var isPalindrome = function(x) {
    if(x < 0) // signed values aren't palindromes
        return false;
    
    let num: number = x; // copy of x for calculation
    let rev: number = 0; // reversed value holder
    
    while(num != 0) {
        rev = (rev * 10) + (num % 10);
        num = Math.floor(num / 10); // integer division
    }
    
    return rev === x;
};