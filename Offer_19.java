class Solution {
    public boolean isMatch(String s, String p) {
        if(s.length()==0){
            if(p.length()%2==1)
                return false;
            for(int i=1;i<p.length();i+=2)
                if(p.charAt(i)!='*')
                    return false;
            return true;
        }
        if(p.length()==0)
            return false;
        char c1=s.charAt(0),c2=p.charAt(0),c3=(p.length()>1)?p.charAt(1):'x';
        if(c3!='*'){
            if(c1==c2 || c2=='.')
                return isMatch(s.substring(1),p.substring(1));
            else
                return false;
        }
        else{
            if(c1==c2 || c2=='.')
                return isMatch(s.substring(1),p) || isMatch(s,p.substring(2));
            else
                return isMatch(s,p.substring(2));
        }
    }
}
//递归，正则表达式匹配