class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(), pointer = head;
        int decimalPart = 0;

        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int sum = a + b + decimalPart;
            decimalPart = sum / 10;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (decimalPart > 0) {
            pointer.next = new ListNode(decimalPart);
        }

        return head.next;
    }
}