// 题目: 杨辉三角
// 题号: 118
// 语言: java
// 提交时间: 2026-11-04 12:43:03

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //创建一个二维列表 用来存最终结果 这个二维列表中的每一个列表代表一行
        List<List<Integer>> list  = new ArrayList<>();
        //遍历每一行 一共有numRows行
        for(int i = 0 ;i<numRows ;i++){
            //创建每一行的列表
            List<Integer> row = new ArrayList<>();
            //遍历当前行的每一列
            //第i行有第i+1个元素 j表示列
            for(int j = 0 ; j< i+1;j++){
                //如果是边界 直接赋值为1
                if(j == 0 || j==i){
                    row.add(1);
                }else{
                    //其余的元素 等于上一行的左边加上上一行的右边
                    //i表示当前行 则i-1表示上一行
                    //得到上一行的两个元素
                    int left = list.get(i-1).get(j-1);
                    int right =  list.get(i-1).get(j);
                    row.add(left + right);
                }
            }

            //将当前行加入到结果中
            list.add(row);

        }
        return list ;

    }
}