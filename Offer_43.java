class Solution {
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) 
                res += high * digit;
            else if(cur == 1) 
                res += high * digit + low + 1;
            else 
                res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
}
//把数字分为三部分
//根据公式计算啊数字n每一位上的可能是1的数量（这个位上是1并且整个数小于n）