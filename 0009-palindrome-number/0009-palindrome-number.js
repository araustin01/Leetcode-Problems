/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) // signed values aren't palindromes
        return false;
    
    var num = x; // copy of x for calculation
    var rev = 0; // reversed value holder
    
    while(num != 0) {
        rev = (rev * 10) + (num % 10);
        num = Math.floor(num / 10); // integer division
    }
    
    return rev === x;
};