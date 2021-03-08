package app;

/**
 * inzheneher created on 07/03/2021 inside the package - app
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode currentNode = head;
        ListNode beforeDelNode = head;
        int counter = 0;
        while (counter <= n) {
            if (currentNode != null) currentNode = currentNode.next;
            else return head.next;
            counter++;
        }
        while (currentNode != null) {
            currentNode = currentNode.next;
            beforeDelNode = beforeDelNode.next;
        }
        beforeDelNode.next = beforeDelNode.next.next;
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
        solution.removeNthFromEnd(solution.getHead(new int[]{1, 2}), 1);
    }
}
