package app;

/**
 * inzheneher created on 03/03/2021 inside the package - app
 */
public class Solution {
    public int missingNumber(int[] nums) {
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.printf("[3,0,1] -> %s%n", solution.missingNumber(new int[]{3, 0, 1}));
        System.out.printf("[0,1] -> %s%n", solution.missingNumber(new int[]{0, 1}));
        System.out.printf("[9,6,4,2,3,5,7,0,1] -> %s%n", solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.printf("[0] -> %s%n", solution.missingNumber(new int[]{0}));
    }
}
