class Solution {
    public double myPow(double x, int n) {
        if(x==0)
            return 0;
        double res=1;
        long b=n;
        if(b<0){
            x=1/x;
            b*=-1;
        }
        while(b>0){
            if((b&1)==1)
                res*=x;
            x*=x;
            b>>=1;
        }
        return res;
    }
}
//快速幂方法计算幂运算！
// 将n看作二进制拆开，bm为n的二进制从后往前数第m位，b值为0或1
// x^n=x^{ (2^0)*b1 + (2^1)*b2 + ... + (2^[m-1])*bm }
//    =x^[(2^0)*b1] * x^[(2^1)*b2] * ... * x^[(2^[m-1])*bm] 