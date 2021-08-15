class Solution {
public int reverse(int x) {
int rev = 0;
while (x != 0) {
//this is to handle overflow case
if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && x % 10 > 7)) return 0;
if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && x % 10 < -8)) return 0;
rev = rev * 10 + x % 10;
x /= 10;
}
return rev;
}
}
