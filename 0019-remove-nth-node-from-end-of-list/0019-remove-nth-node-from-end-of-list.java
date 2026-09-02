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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;

        }
        if (size == n) {
            return head.next;
        }
        temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == (size - n)) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}