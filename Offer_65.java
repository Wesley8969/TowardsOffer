class Solution {
    public int add(int a, int b) {
        if(b==0)
            return a;
        int c=(a&b)<<1; //进位的数
        int d=a^b;      //无进位的和
        return add(d,c);
    }
}
//位运算计算加法