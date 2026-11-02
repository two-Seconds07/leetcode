// 题目: 快乐数
// 题号: 202
// 语言: java
// 提交时间: 2026-10-29 14:13:51

class Solution {
    public boolean isHappy(int n) {
      //计算出这个数字的每一个位置的数
      //创建一个HashSet来存每一次需检验 还没有出现的数字
      Set<Integer> set = new HashSet<>();

    //判断传进来的n是否在set集合中存在 避免陷入循环计算
    //n不为1 且没有在集合中出现过
        while(n!= 1 && !set.contains(n)){
            set.add(n);

             n =  getNext(n);
        }
            //调用求每一位数字的平方和的函数
    

        return n==1;
    }

    private int getNext(int n){
        //循环求这个数的每一位 并求出每一位平方和相加
        int totalSum = 0;
        while(n>0){
            //计算个位
            int d = n % 10;
            //立即除以10 再赋值给n
            n = n / 10;
            // 计算数字d平方并累加到总和中 
         totalSum += d*d;

        }

        return totalSum;
    }
}