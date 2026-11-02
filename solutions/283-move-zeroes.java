// 题目: 移动零
// 题号: 283
// 语言: java
// 提交时间: 2026-10-31 09:52:36

class Solution {
    public void moveZeroes(int[] nums) {
//用一个 write 指针，把所有非零元素按原顺序写到前面；遍历完后，把 write 之后的位置全部补 0。

        int write = 0;


        //遍历数组
        for(int i = 0; i< nums.length;i++){
        //将遍历到的0 放到数组最后位
            if(nums[i] != 0){      
                nums[write] = nums[i];
                write++;
            }
        }

          //对数组后面补0
        for(int i = write; i< nums.length;i++){
            nums[i] = 0;
        }

    }
}