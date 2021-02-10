package app;

import java.util.HashMap;
import java.util.Map;

/**
 * inzheneher created on 10/02/2021 inside the package - app
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> valuesRating = new HashMap<>();
        int arrLen = nums.length;
        for (int num : nums) {
            valuesRating.merge(num, 1, Integer::sum);
            if (valuesRating.get(num) > arrLen / 2) return num;
        }
        throw new IllegalArgumentException("Input is incorrect - array doesn't have a major number.");
    }
}
