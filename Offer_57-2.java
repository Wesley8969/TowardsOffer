class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res=new ArrayList<>();
        int sum=3,l=1,r=2;
        while(l<target){
            if(sum==target){
                int[] tmp=new int[r-l+1];
                for(int i=0;i<tmp.length;i++)
                    tmp[i]=l+i;
                res.add(tmp);
                sum=sum-l+r+1;
                l++;
                r++;
            }
            else if(sum<target)
                sum+=++r;
            else
                sum-=l++;
        }
        int[][] ans=new int[res.size()][];
        for(int i=0;i<res.size();i++)
            ans[i]=res.get(i);
        return ans;
    }
}
//双指针滑动窗口，List<int[]>的应用

