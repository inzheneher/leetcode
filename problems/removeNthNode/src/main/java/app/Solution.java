package app;

import java.util.ArrayList;
import java.util.List;

/**
 * inzheneher created on 07/03/2021 inside the package - app
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode result = head;
        List<ListNode> list = new ArrayList<>();
        while (result != null) {
            list.add(result);
            result = result.next;
        }
        int size = list.size();
        if (size == 1 && n == 1) head = null;
        else if (size == n) head = list.get(1);
        else if (n == 1) list.get(size - n - 1).next = null;
        else list.get(size - n - 1).next = list.get(size - n + 1);

        return head;
    }

    private ListNode getHead(int[] arr) {
        int arrLen = arr.length;
        ListNode head = new ListNode(arr[arrLen - 1], null);
        for (int i = arrLen - 2; i >= 0; i--) {
            head = new ListNode(arr[i], head);
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeNthFromEnd(solution.getHead(new int[]{1, 2, 3, 4, 5}), 2);
    }
}
