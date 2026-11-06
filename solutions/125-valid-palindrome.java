// 题目: 验证回文串
// 题号: 125
// 语言: java
// 提交时间: 2026-11-06 09:22:33

class Solution {
    public boolean isPalindrome(String s) {
        //判断为空直接返回真
        if(s == null || s.length() == 0){
            return true ;
        }
       
        //使用双指针进行遍历字符串
        int left = 0;
        int right = s.length() -1;
        //遍历字符串 比较指针指向的两个字符是否相等
        while(left < right){
                //去掉字符串中的非字符以及非数字 进行比较
                while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                }
                while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                    right-- ;
                }
                 //是字符之后 进行比较 排除大小写不一样的影响
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                            return false ;
                }
                left++;
                right--;


            }

        return true ;
    }
}