// 题目: 两个数组的交集
// 题号: 349
// 语言: java
// 提交时间: 2026-10-26 00:32:55

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           // 用较短的数组构建 HashSet，减少空间占用
            if (nums1.length > nums2.length) {
                //交换两个数组的引用，确保 nums1 是较短的那个
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            }
            //创建HashSet集合 存较短的数组
            Set<Integer> set = new HashSet<>();
            for(int num:nums1){
                set.add(num);
            }
            //尝试在少的里面删除多的数组元素

           List<Integer>list = new ArrayList<>();
        for(int num:nums2){
            if(set.remove(num)){
                   //如果可以删除 说明是交集元素 那么就保存在一个新列表中
                   list.add(num);
            } 
        }

         //将列表转为int[]数组
            //创建一个数组 大小正好等于列表
            int[]arr = new int[list.size()];
            //遍历列表 添加到数组中
            for(int i = 0;i<list.size();i++){
                arr[i] = list.get(i);
            }
            return arr;
    }
}