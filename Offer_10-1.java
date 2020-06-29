class Solution {
    public int fib(int n) {
        if(n<2)
            return n;
        int x=0,y=1;
        for(int i=2;i<=n;i++){
            int tmp=(x+y)%1000000007;
            x=y;
            y=tmp;
        }
        return y;
    }
}
//递归超时，使用迭代法