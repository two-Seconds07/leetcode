// 题目: 环形链表
// 题号: 141
// 语言: java
// 作者: two-Seconds07
// 提交时间: 2026-11-11 13:11:17

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        //典型的快慢指针问题
        //定义一个快指针和一个慢指针
        ListNode slow = head ;
        ListNode fast = head ;

        //循环遍历快慢指针 要保证快指针不能出现野指针情况
        while(fast != null && fast.next != null){ //由于fast指针一次跳两个 所以也要保证fast.next不为空
           slow = slow.next;
           fast = fast.next.next;
            //如果快慢指针相等了,那么就说明存在环
            if(fast == slow){
                return true ;
            }
        }

        return false ;
    }
}