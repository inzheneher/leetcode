class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode _l = new ListNode();
        boolean isNext = false;

        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            if (isNext) _l.val = (a + b) % 10 + 1;
            else _l.val = (a + b) % 10;
            isNext = (a + b) > 9;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            _l = new ListNode(_l.val, _l);
        }

        return _l.next;
    }
}