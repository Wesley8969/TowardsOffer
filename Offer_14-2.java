class Solution {
    public int cuttingRope(int n) {
        if(n<4)
            return n-1;
        long sum=1;
        while(n>4){
            sum=(sum*3)%1000000007;
            n-=3;
        }
        return (int)((sum*n)%1000000007);
    }
}
//依旧是数据公式推导出每次分割3，可得到乘积最大值。
//与上题不同的是取余，和使用long