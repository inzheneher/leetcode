package app;

import java.util.Arrays;

/**
 * inzheneher created on 02/03/2021 inside the package - app
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int numSize = nums.length;
        int duplicateNumber = -1;
        boolean[] presence = new boolean[numSize + 1];
        for (int num : nums) {
            if (!presence[num]) presence[num] = true;
            else duplicateNumber = num;
        }
        for (int i = 1; i < presence.length; i++) if (!presence[i]) return new int[]{duplicateNumber, i};
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.printf("[1, 1] -> %s%n", Arrays.toString(solution.findErrorNums(new int[]{1, 1})));
        System.out.printf("[2, 2] -> %s%n", Arrays.toString(solution.findErrorNums(new int[]{2, 2})));
        System.out.printf("[3, 2, 2] -> %s%n", Arrays.toString(solution.findErrorNums(new int[]{3, 2, 2})));
        System.out.printf("[1, 2, 2, 4] -> %s%n", Arrays.toString(solution.findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.printf("[1, 5, 3, 4, 5, 6, 7, 8] -> %s%n", Arrays.toString(solution.findErrorNums(new int[]{1, 5, 3, 4, 5, 6, 7, 8})));
    }
}
