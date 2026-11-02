// 题目: 有效的字母异位词
// 题号: 242
// 语言: java
// 提交时间: 2026-10-23 11:15:31

class Solution {
    public boolean isAnagram(String s, String t) {
        //两个单词的长度一样，而且它们里面包含的 a、b、c 数量完全一样
        //用一个长度为26的数组表示26英文字母的索引

        //如果长度不一样 肯定不是异位
        if(s.length() != t.length()){
            return false;
        }
        //计算各字母出现的次数 比如说 count[0] = 2 代表a出现2次
       int[]count =  new int[26];
       //遍历s 把字母出现的次数加上
       for(int i = 0 ;i<s.length();i++){
        char ch = s.charAt(i);
        //将ch对应的字母加一
        count[ch - 'a']++;
       }

        //遍历t 把字母出现的次数减去
       for(int i = 0 ;i<t.length();i++){
        char ch = t.charAt(i);
        //将ch对应的字母加一
        count[ch - 'a']--;
       }

       //查看计数器中是不是全是0
       for(int i = 0;i<26 ;i++){
        if(count[i] != 0){
            return false;
        }
       }


       //没问题
       return true;


    }
}