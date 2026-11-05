// 题目: 最长公共前缀
// 题号: 14
// 语言: java
// 提交时间: 2026-11-05 12:19:38

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //获取字符串数组的第一个元素 方便后续比较
        String ans = strs[0];
        //循环遍历字符串数组,与第一个数组的每个元素进行比较
        for(int i = 1 ; i < strs.length ; i++){

            //获取字符串数组中的每个字符串的字符 与ans的进行比较 不相等则返回空
            int j = 0 ;
            for( ; j < ans.length() && j < strs[i].length() ; j++){
                if(ans.charAt(j) != strs[i].charAt(j)){
                    break ;
                }
            }

            //截取得到的相同的字符串
            ans = ans.substring(0,j);
            if(ans.length() == 0){
                return "";
            }

        }
        return ans;
    }
}