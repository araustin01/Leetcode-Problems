#include <string>
#include <cmath>

using namespace std;

class Solution {
public:
    int myAtoi(string s) {
        auto it = s.begin(); // char iterator
        
        int atoi = 0;
        bool neg = false;
        
        // skip leading whitespace
        while (*it == ' ')
            it++;

        // identify sign
        if (*it == '-') {
            neg = true;
            it++;
        } else if (*it == '+') 
            it++;

        // construct number
        int digit = 0;
        while((digit = toDigit(*it++)) > -1) {  
            // check for overflow
            uint64_t atoi_long = ((uint64_t) atoi * 10) + digit; // temporary unsigned value
            if(neg ? atoi_long >= pow(2, 31) : atoi_long >= pow(2, 31) - 1) 
                return neg ? pow(-2,31) : pow(2,31) - 1; // clamp
            // type cast
            atoi = (int) atoi_long;
        }
        return neg ? -1 * atoi : atoi;
    }
private:
    int toDigit(char c) {
        int digit = c - '0';
        return digit > 9 || digit < 0 ? -1 : digit;
    }
};
