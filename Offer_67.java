class Solution {
    public int strToInt(String str) {
        str=str.trim();
        if(str.length()==0)
            return 0;
        int mark=1;
        if(str.charAt(0)=='-')
            mark=-1;
        int i=(str.charAt(0)=='-' || str.charAt(0)=='+')?1:0;
        long res=0;
        for(;i<str.length();i++){
            char c=str.charAt(i);
            if(c<'0' || c>'9')
                break;
            res=res*10+(long)(c-'0');
            if(mark==1 && res>=Math.pow(2,31)-1)
                return Integer.MAX_VALUE;
            else if(mark==-1 && res>=Math.pow(2,31))
                return Integer.MIN_VALUE;
        }
        return (int)res*mark;
    }
}
//繁琐，细心