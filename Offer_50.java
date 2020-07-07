class Solution {
    public char firstUniqChar(String s) {
        // Map<Character,Integer> m=new HashMap<>();
        // for(char c:s.toCharArray())
        //     if(m.get(c)==null)
        //         m.put(c,1);
        //     else
        //         m.put(c,m.get(c)+1);
        // for(int i=0;i<s.length();i++)
        //     if(m.get(s.charAt(i))==1)
        //         return s.charAt(i);
        // return ' ';

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==i && s.indexOf(c,i+1)==-1)
                return c;
        }
        return ' ';
    }
}
//方法1：用Map记录数量
//方法2：用indexOf