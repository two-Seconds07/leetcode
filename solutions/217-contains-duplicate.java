// 题目: 存在重复元素
// 题号: 217
// 语言: java
// 提交时间: 2026-10-24 08:43:04

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //定义一个hashSet集合 如果元素添加失败 则会返回false
        Set<Integer>set = new HashSet<>();
        //如果元素添加不上 则说明元素已经存在
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;

    }
}