// 题目: 多数元素
// 题号: 169
// 语言: java
// 提交时间: 2026-11-03 11:58:51

class Solution {
    public int majorityElement(int[] nums) {
        //利用HashMap来存元素
        Map<Integer,Integer> map = new HashMap<>();
        //遍历数组 将数组的值 以及出现的次数添加到集合中
        for(int num:nums){
            map.put(num , map.getOrDefault(num,0)+1) ;
        }


        //找出value的值比较大的key
        int maxCount = 0;
        int majorKey = 0;
        //遍历键值对
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()> maxCount){
                maxCount = entry.getValue();
                majorKey =entry.getKey(); 
            }

        }
        return majorKey;

    }
}