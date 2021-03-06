package app;

/**
 * inzheneher created on 04/03/2021 inside the package - app
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode head1 = headA;
        ListNode head2 = headB;
        while (head1 != head2) {
            if (head1 == null) head1 = headB;
            else head1 = head1.next;
            if (head2 == null) head2 = headA;
            else head2 = head2.next;
        }
        return head1;
    }

    //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
    private ListNode getHeadOfLinkedListFromArray(int[] array) {
        int arrL = array.length;
        ListNode previousNode = new ListNode(array[arrL - 1]);
        ListNode currentNode = null;
        for (int i = arrL - 2; i >= 0; i--) {
            currentNode = new ListNode(array[i]);
            currentNode.next = previousNode;
            if (i > 0) previousNode = currentNode;
        }
        return currentNode;
    }

    //TODO: fix creating ListNodes to make them intersected
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head1 = solution.getHeadOfLinkedListFromArray(new int[]{4,1,8,4,5});
        ListNode head2 = solution.getHeadOfLinkedListFromArray(new int[]{5,6,1,8,4,5});
        System.out.printf("Intersection number is: %s%n", solution.getIntersectionNode(head1, head2).val);
    }
}
