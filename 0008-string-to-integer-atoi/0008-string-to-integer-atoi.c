#include <math.h>
#include <stdbool.h>
#include <stdio.h>

/**
Parse character to int digit
Returns -1 if not a valid character/digit
**/
int toDigit(char c) {
    int digit = c - '0';
    return digit > 9 || digit < 0 ? -1 : digit;
}

int myAtoi(char* s) {
    int atoi = 0;
    bool neg = false;
    
    // skip leading whitespace
    while (s[0] == ' ')
        s++;

    // identify sign
    if (s[0] == '-') {
        neg = true;
        s++;
    } else if (s[0] == '+') // neg is already false
        s++;
    
    int digit = 0;
    while((digit = toDigit(*s++)) > -1) { // construct number from head to tail
        // check for overflow
        uint64_t atoi_long = ((uint64_t) atoi * 10) + digit;
        printf("atoi_long = %ld\n", atoi_long);
        if(neg ? atoi_long >= pow(2, 31) : atoi_long >= pow(2, 31) - 1) {
            printf("Clamp!\n");
            return neg ? pow(-2,31) : pow(2,31) - 1; // clamp
        }
        atoi = (int) atoi_long;
        printf("atoi = %d\n", atoi);
    }
    printf("\nReturning %d", atoi);
    return neg ? -1 * atoi : atoi;
}