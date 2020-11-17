import java.util.ArrayList;
import java.util.Map;

/**
 * inzheneher created on 11/11/2020 inside the package - PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Map<String, ArrayList<Integer>> dataSourceMap = DataSource.getResourceFromYaml();

        ArrayList<Integer> input_1 = dataSourceMap.get("input-1");
        ArrayList<Integer> input_2 = dataSourceMap.get("input-2");

        System.out.println(input_1);
        System.out.println(input_2);

        ListNode l1 = ListNode.getListNode(input_1);
        ListNode l2 = ListNode.getListNode(input_2);
        ListNode result = solution.addTwoNumbers(l1, l2);

        StringBuilder output = new StringBuilder();
        output.append("[");

        while (result != null) {
            output.append(result.val);
            if (result.next != null) output.append(", ");
            result = result.next;
        }

        output.append("]");

        System.out.println(output.toString());
    }
}
