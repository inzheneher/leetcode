package app;

/**
 * inzheneher created on 02/03/2021 inside the package - app
 */
public class Solution {
    public int distributeCandies(int[] candyType) {
        boolean[] candyTypes = new boolean[200001];
        int arrSize = candyType.length / 2;
        int counter = 0;
        for (int item : candyType) {
            int t = item + 100000;
            if (!candyTypes[t]) {
                if (++counter >= arrSize) return arrSize;
                candyTypes[t] = true;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distributeCandies(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 5, 6}));
    }
}
