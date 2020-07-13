// class Solution {
//     public int lastRemaining(int n, int m) {
//         List<Integer> l=new ArrayList<>();
//         for(int i=0;i<n;i++)
//             l.add(i);
//         int k=0;
//         while(l.size()>1){
//             int len=l.size();         
//             l.remove((k+m-1)%len);
//             k=(k+m-1)%len;
//         }
//         return l.get(0);
//     }
// }
//模拟游戏

//递归方法：
class Solution {
    public int lastRemaining(int n, int m) {
        if(n==1)
            return 0;
        int x=lastRemaining(n-1,m);
        return (m+x)%n;
    }
}
//方法2：数学方法，递归的转化写法
// class Solution {
//     public int lastRemaining(int n, int m) {
//         int ans = 0;
//         // 最后一轮剩下2个人，所以从2开始反推
//         for (int i = 2; i <= n; i++) {
//             ans = (ans + m) % i;
//         }
//         return ans;
//     }
// }


