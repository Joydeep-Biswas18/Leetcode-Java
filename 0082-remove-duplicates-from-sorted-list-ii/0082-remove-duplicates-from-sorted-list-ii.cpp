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
    ListNode* deleteDuplicates(ListNode* head) {
      
        if (head == NULL || head->next == NULL) {
            return head;
        }

        ListNode* Dummy = new ListNode(0);
        Dummy->next = head;

        ListNode* prev = Dummy;
        ListNode* curr = head;

        while (curr != NULL) {

            // Duplicate found
            if (curr->next != NULL && curr->val == curr->next->val) {

                // Move curr to the last duplicate
                while (curr->next != NULL && curr->val == curr->next->val) {
                    curr = curr->next;
                }

                // Remove the entire duplicate group
                prev->next = curr->next;

                // Move curr forward
                curr = curr->next;
            }

            // Current node is unique
            else {
                prev = curr;
                curr = curr->next;
            }
        }

        return Dummy->next;
    }

        

};