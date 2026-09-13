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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode Evenhead = new ListNode(0);
        ListNode odd = head;
        ListNode even = head.next;
        Evenhead.next = even;
        ListNode resultHead = new ListNode(0);
        resultHead.next = odd;

        while(odd.next != null && odd.next.next != null && even.next!= null ){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = Evenhead.next;
        return resultHead.next;
    }
}