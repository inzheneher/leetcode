class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode _l = new ListNode();
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();

        do {
            val1.append(l1.val);
            l1 = l1.next;
        } while (l1 != null);
        do {
            val2.append(l2.val);
            l2 = l2.next;
        } while (l2 != null);

        int total = Integer.parseInt(val1.toString()) + Integer.parseInt(val2.toString());
        int[] totalArray = Integer.toString(total).chars().map(t -> t - '0').toArray();

        _l.val = totalArray[0];

        for (int i = 1; i < totalArray.length; i++) {
            _l = new ListNode(totalArray[i], _l);
        }

        return _l;
    }
}