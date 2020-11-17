import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNode(ArrayList<Integer> integers) {
        ListNode listNode = new ListNode();
        listNode.val = integers.get(integers.size() - 1);
        for (int i = integers.size() - 2; i >= 0; i--) {
            listNode = new ListNode(integers.get(i), listNode);
        }
        return listNode;
    }
}