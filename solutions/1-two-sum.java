// 题目: 两数之和
// 题号: 1
// 语言: java
// 提交时间: 2026-10-22 13:23:36

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //创建一个HashMap,存数值和对应的下标
        Map<Integer,Integer>map = new HashMap<>();
        //存数组的值 到HashMap中
        for(int i = 0;i< nums.length;i++){
            //找出当前数字对应的另一个数字
            int needNum = target- nums[i];
            //遍历map找另一半
            if(map.containsKey(needNum)){
                //找到就返回对应数字和下标
                return new int[]{map.get(needNum),i};
            }

            //如果没找到 将当前数字存起来 供后面的数字查找
            map.put(nums[i],i);


        }
            return new int[]{};
        
    }
}