import java.math.BigInteger;

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

        BigInteger total = new BigInteger(val1.reverse().toString()).add(new BigInteger(val2.reverse().toString()));

        String totalString = total.toString(10);
        int[] totalArray = new int[totalString.length()];
        for (int i = 0; i < totalString.length(); i++) {
            totalArray[i] = Integer.parseInt(String.valueOf(totalString.charAt(i)));
        }

        _l.val = totalArray[0];

        for (int i = 1; i < totalArray.length; i++) {
            _l = new ListNode(totalArray[i], _l);
        }

        return _l;
    }
}