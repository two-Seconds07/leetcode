// 题目: 合并两个有序数组
// 题号: 88
// 语言: java
// 提交时间: 2026-11-07 00:35:55

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //将数组2合并到数组1中
        //循环遍历数组 顺便把2元素放到1中
        for(int i = 0 ; i <n; i++){
            nums1[i + m] = nums2[i] ;
        }


        //添加好之后 对数组1进行排序 按照升序 使用冒泡排序的方法
        
        // for(int i = 0 ; i < nums1.length - 1 ; i++){

        //     for(int j =0  ; j < nums1.length -1 - i  ; j++){
        //         if(nums1[j] > nums1[j + 1]){
        //             int temp = nums1[j];
        //             nums1[j] = nums1[j + 1];
        //             nums1[j + 1] = temp;
        //         }
        //     }
        // }

        Arrays.sort(nums1);

    }
}