class Solution {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) 
            list.add(String.valueOf(num));
        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("", list);
    }
}
//java库函数使用，sort返回负数顺序不变，返回整数顺序变反