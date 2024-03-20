class Solution:
    def longestPalindrome(self, s: str) -> str:
        start = 0
        maxLength = 1
        n = len(s)

        for i in range(n):
            # Expand around center for odd-length palindromes (aba)
            left, right = i, i
            while left >= 0 and right < n and s[left] == s[right]:
                length = right - left + 1
                if length > maxLength:  # is next longest palindrome
                    maxLength = length
                    start = left
                left -= 1
                right += 1

            # Expand around center for even-length palindromes (abba)
            left, right = i, i + 1
            while left >= 0 and right < n and s[left] == s[right]:
                length = right - left + 1
                if length > maxLength:  # is next longest palindrome
                    maxLength = length
                    start = left
                left -= 1
                right += 1

        return s[start:start + maxLength]
