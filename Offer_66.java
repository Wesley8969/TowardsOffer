class Solution {
    public int[] constructArr(int[] a) {
        int n=a.length;
        int[] res=new int[n];
        for(int i=0,value=1;i<n;i++){
            res[i]=value;
            value*=a[i];
        }
        for(int i=n-1,value=1;i>=0;i--){
            res[i]*=value;
            value*=a[i];
        }
        return res;
    }
}
//题意：除了自身下标数字以外的数相乘的值
//先乘左边后乘右边