class Solution {
    public int[] printNumbers(int n) {
        int[] res=new int[(int)Math.pow(10,n)-1];
        res[0]=1;
        for(int i=1;i<res.length;i++)
            res[i]=res[i-1]+1;
        return res;
    }
}
//1.简单解法，设数组累加

//2.大数，用字符串模拟大数加法。