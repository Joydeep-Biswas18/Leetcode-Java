/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = head;
        int size = 0;
        int count = 0;
        while (temp != NULL) {
            size++;
            temp = temp->next;
        }
        if (size == n) {
            return head->next;
            // that means first node will be removed
        }
        temp = head;
        while (temp != NULL) {
            count++;
            if (count == (size - n)) {
                temp->next = temp->next->next;
            }
            temp = temp->next;
        }
        return head;
    }
};