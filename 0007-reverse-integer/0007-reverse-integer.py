import sys

class Solution:
    def reverse(self, x: int) -> int:
        neg: bool = x < 0
        x = abs(x)
        reversed_num: int = 0
        i: int = 0
        while x != 0:
            reversed_num = reversed_num * 10 + (x % 10)
            if reversed_num > (2 ** 31) if neg else reversed_num >= (2 ** 31):
                return 0
            x //= 10
            i += 1
        return -reversed_num if neg else reversed_num
