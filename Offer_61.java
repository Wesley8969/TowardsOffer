class Solution {
    public boolean isStraight(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int tmp=0;
        for(int x:nums)
            if(x==0)
                tmp++;
            else
                l.add(x);
        Collections.sort(l);
        for(int i=0;i<l.size()-1;i++)
            if(l.get(i)==l.get(i+1))
                return false;
            else if(l.get(i)+1!=l.get(i+1))
                tmp-=l.get(i+1)-l.get(i)-1;
        return tmp<0?false:true;
    }
}