// 题目: 相交链表
// 题号: 160
// 语言: java
// 作者: two-Seconds07
// 提交时间: 2026-11-11 14:05:19

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //采用走对方回头路的方法
        //先判断是否为空
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        //不相等  就接着遍历
        while(pA != pB){
            pA =  pA == null ? headB : pA.next;
            pB =  pB == null ? headA : pB.next;
        }
        //直到他们相等了 说明就遇到了同一个节点 并将此节点进行返回
        //如果没有遇到 那么都变成null相等了 也可以返回
        return pA ;
        
    }
}