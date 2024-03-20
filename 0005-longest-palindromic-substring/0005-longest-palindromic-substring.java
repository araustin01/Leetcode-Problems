class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) 
            return "";

        int start = 0; 
        int maxLength = 1; 
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            // Expand around center for odd-length palindromes (aba)
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int length = right - left + 1;
                if (length > maxLength) { // is next longest palindrome
                    maxLength = length;
                    start = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            // Expand around center for even-length palindromes (abba)
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int length = right - left + 1;
                if (length > maxLength) { // is next longest palindrome
                    maxLength = length;
                    start = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);
    }
}