class Solution {

    /**
     * @param Integer $x
     * @return Boolean
     */
    function isPalindrome($x) {
        if($x < 0) // signed values aren't palindromes
            return false;
        
        $num = $x; // copy of $x for calculation
        $rev = 0; // reversed value of $num
        
        while($num != 0) {
            $rev = ($rev * 10) + ($num % 10);
            $num = (int)($num / 10); // integer division
        }
        
        return $x == $rev;
    }
}