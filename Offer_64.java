class Solution {
    public int sumNums(int n) {
        boolean flag=(n>0)&&(n+=sumNums(n-1))>0;
        return n;
    }
}
//利用语言特性， &&前面成立才会运行后面