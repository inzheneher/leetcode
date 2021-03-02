package app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * inzheneher created on 02/03/2021 inside the package - app
 */
public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unicCandys = new HashSet<>(Arrays.asList(Arrays.stream(candyType).boxed().toArray(Integer[]::new)));
        int arrSize = candyType.length;
        int setSize = unicCandys.size();
        return Math.min(setSize, arrSize/2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distributeCandies(new int[]{6,6,6,6}));
    }
}
