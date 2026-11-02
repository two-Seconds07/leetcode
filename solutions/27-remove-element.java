// 题目: 移除元素
// 题号: 27
// 语言: java
// 提交时间: 2026-11-02 05:53:15

class Solution {
    public int removeElement(int[] nums, int val) {
        //使用快慢指针法 原地移动元素
        //定义一个慢指针 来记录与val不相等的值
        int slow = 0 ;
    //遍历数组 将与val不相等的元素记录到数组中
    for(int fast = 0;fast < nums.length;fast++){
        //遍历快指针 如果数组中的值跟val不相等 就记录下来 相等就过
        if(nums[fast] != val){
            nums[slow] = nums[fast] ;
            slow++;
        }
    }

    return slow;
    }
}