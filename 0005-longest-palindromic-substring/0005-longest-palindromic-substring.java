class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return "";

        int start = 0;
        int maxLength = 1;
        int n = s.length();

        int left; int right;

        for (int i = 0; i < n; i++) {
            // Expand around center for odd-length palindromes (e.g. aba)
            for (left = i, right = i; left >= 0 && right < n && s.charAt(left) == s.charAt(right); left--, right++) {
                int length = right - left + 1;
                if (length > maxLength) { // is next longest palindrome
                    maxLength = length;
                    start = left;
                }
            }

            // Expand around center for even-length palindromes (e.g. abba)
            for (left = i, right = i+1; left >= 0 && right < n && s.charAt(left) == s.charAt(right); left--, right++) {
                int length = right - left + 1;
                if (length > maxLength) { // is next longest palindrome
                    maxLength = length;
                    start = left;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}