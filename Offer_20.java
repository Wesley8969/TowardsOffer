class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0)
            return false;
        boolean numSeen = false，dotSeen = false，eSeen = false;
        char[] str = s.trim().toCharArray();
        for(int i = 0;i < str.length; i++){
            if(str[i] >= '0' && str[i] <= '9')
                numSeen = true;
            else if(str[i] == '.'){
                if(dotSeen || eSeen)
                    return false;
                dotSeen = true;
            }
            else if(str[i] == 'e' || str[i] == 'E'){
                //e之前不能出现e，必须出现数
                if(eSeen || !numSeen)
                    return false;
                eSeen = true;
                numSeen = false;//重置numSeen，排除123e或者123e+的情况,确保e之后也出现数
            }
            else if(str[i] == '-' || str[i] == '+')
                //+-出现在0位置或者e/E的后面第一个位置才是合法的
                if(i != 0 && str[i-1] != 'e' && str[i-1] != 'E')
                    return false;
            else//其他不合法字符
                return false;            
        }
        return numSeen;
    }
}
//题意：正确的数字，只有num,dot,+/-,e/E,且有顺序要求
//状态机：逐个看待字符