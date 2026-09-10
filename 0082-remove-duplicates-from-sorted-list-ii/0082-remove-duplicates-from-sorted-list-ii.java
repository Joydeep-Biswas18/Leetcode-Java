class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode Dummy = new ListNode(0);
        Dummy.next = head;

        ListNode prev = Dummy;
        ListNode curr = head;

        while (curr != null) {

            // Duplicate found
            if (curr.next != null && curr.val == curr.next.val) {

                // Move curr to the last duplicate
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                // Remove the entire duplicate group
                prev.next = curr.next;

                // Move curr forward
                curr = curr.next;
            }

            // Current node is unique
            else {
                prev = curr;
                curr = curr.next;
            }
        }

        return Dummy.next;
    }
}