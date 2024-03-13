/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* ansList = NULL;
    struct ListNode* digit = NULL; // current digit

    int rem = 0; // remainder

    for (; l1 != NULL || l2 != NULL || rem != 0; l1 = l1 ? l1->next : NULL, l2 = l2 ? l2->next : NULL) {
        int d1 = l1 ? l1->val : 0;
        int d2 = l2 ? l2->val : 0;

        int sum = d1 + d2 + rem;
        rem = sum > 9 ? 1 : 0;

        // Create a new node only if there are more digits or if there's a remainder
        if (ansList == NULL) {
            ansList = (struct ListNode*) calloc(1, sizeof(struct ListNode));
            digit = ansList;
        } else {
            digit->next = (struct ListNode*) calloc(1, sizeof(struct ListNode));
            digit = digit->next;
        }

        digit->val = sum % 10;
    }
    
    return ansList;
}