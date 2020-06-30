class Solution {
    public int cuttingRope(int n) {
        if(n<4)
            return n-1;
        int res=1;
        while(n>4){
            res*=3;
            n-=3;
        }
        return res*n;        
    }
}
//技巧型解法，数学推导出每段长度为3时乘积最大