class Solution {
    public String reverseWords(String s) {
        String[] components=s.trim().split(" ");
        StringBuffer res=new StringBuffer("");
        for(int i=components.length-1;i>=0;i--){
            if(components[i].equals(""))
                continue;
            res.append(components[i]);
            if(i>0)
                res.append(" ");
        }
        return res.toString();
    }
}
// 一些用法
// s.trim() 返回将前后空格都去除后的字符串
// StringBuffer s=new StringBuffer("Initial");
// s.append("append one string");
// s.delete(1,5);
// s.deleteCharAt(s.length()-1);
// s.reverse();
// s.insert(0,"123");