// 题目: 合并两个有序链表
// 题号: 21
// 语言: java
// 作者: two-Seconds07
// 提交时间: 2026-11-08 09:38:56

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //造一个假的节点 括号里面的值随便填
        ListNode dummy = new ListNode(0);
        //让尾指针指向这个假节点
        ListNode tail = dummy;

        //循环遍历这两个链表 把小的先接到dummy尾部 指针往后移
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            //移动假节点的尾指针到最后一位
            tail = tail.next;

        }
        if(list1 != null)
            tail.next = list1;
        if(list2 != null)
            tail.next = list2;



    return dummy.next ;
    }


}