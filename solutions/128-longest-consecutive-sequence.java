// 题目: 最长连续序列
// 题号: 128
// 语言: java
// 提交时间: 2026-10-30 13:49:44

class Solution {
    public int longestConsecutive(int[] nums) {
        //将数组存进HashSet集合中
        Set<Integer> set  = new HashSet<>();
        for(int num : nums ){
            set.add(num);
        }
        //最大连续长度先设置为0
        int maxLength = 0;
       
        for(int num:set){
        //判断当前数字是不是起点 是起点进入循环
            if(!set.contains(num - 1)){
                int currentnum = num;
                int currentLength = 1 ;
                //检查当前数字的下一个是否存在
                while(set.contains(currentnum + 1)){
                    currentnum++;
                    currentLength++;
                }
           maxLength = Math.max(maxLength, currentLength);
            }

        }


        return maxLength;
    }
}