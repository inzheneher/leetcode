package app;

import java.util.HashSet;
import java.util.Set;

/**
 * inzheneher created on 02/03/2021 inside the package - app
 */
public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> setFromArray = new HashSet<>();
        for (int item : candyType) setFromArray.add(item);
        return Math.min(setFromArray.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distributeCandies(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 5, 6}));
    }
}
