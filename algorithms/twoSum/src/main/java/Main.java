/**
 * inzheneher created on 11/11/2020 inside the package - PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = solution.twoSum(new int[]{2, 3, 6, 9, 5, 10, 5}, 15);

        StringBuilder output = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                output.append(a[i]).append("]");
                break;
            }
            output.append(a[i]).append(", ");
        }
        System.out.println(output.toString());
    }
}
