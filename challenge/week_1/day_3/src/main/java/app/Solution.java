package app;

/**
 * inzheneher created on 03/03/2021 inside the package - app
 *
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
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
