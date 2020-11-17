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
        listNode.val = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            listNode = new ListNode(integers.get(i), listNode);
        }
        return listNode;
    }
}