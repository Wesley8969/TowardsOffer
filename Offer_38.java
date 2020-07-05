class Solution {
    Set<String> set;
    public String[] permutation(String s) {
        set=new HashSet<>();
        trace(new StringBuffer(s),new StringBuffer(""));
        String[] res=new String[set.size()];
        int k=0;
        for(String element:set)
           res[k++]=element;
        return res;
    }
    private void trace(StringBuffer s,StringBuffer tmp){
        if(s.length()==0)
            set.add(new String(tmp));
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            tmp.append(c);
            s.deleteCharAt(i);
            trace(s,tmp);
            tmp.deleteCharAt(tmp.length()-1);
            s.insert(i,c);
        }
    }
}
//回宿,StringBuffer的使用