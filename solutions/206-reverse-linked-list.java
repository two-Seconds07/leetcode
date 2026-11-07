// 题目: 反转链表
// 题号: 206
// 语言: java
// 提交时间: 2026-11-07 08:01:30

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null ;
        ListNode cur = head ;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre; // 真正的操作链方向的反转
            pre = cur ; //pre 前移
            cur = next; //cur 前移
       }
    //循环结束之后 新的表头是pre
    return pre ;
    }
}