class Solution {
    public int findNthDigit(int n) {
        if(n<=9)
            return n;
        long x=9,digit=1;
        while(n>x*digit){
            n-=x*digit;
            digit++;
            x*=10;
        }
        long num=x/9+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%(int)digit)-'0';
    }
}
//找数字规律,注意使用long