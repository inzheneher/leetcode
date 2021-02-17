package app;

import java.util.ArrayList;
import java.util.List;

/**
 * inzheneher created on 17/02/2021 inside the package - app
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subTriangle = new ArrayList<>();
            if (i == 0) {
                subTriangle.add(1);
                triangle.add(subTriangle);
            } else {
                triangle.add(getNextArray(triangle.get(i - 1)));
            }
        }
        return triangle;
    }

    private List<Integer> getNextArray(List<Integer> currentArray) {
        List<Integer> nextArray = new ArrayList<>();
        for (int i = 0; i < currentArray.size() + 1; i++) {
            if (i == 0) nextArray.add(1);
            else if (i == currentArray.size()) nextArray.add(1);
            else nextArray.add(currentArray.get(i - 1) + currentArray.get(i));
        }
        return nextArray;
    }

    private String shiftToTheRight(int rowNumber, int numRows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows - rowNumber; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int numRows = 24;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(numRows);
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%s%s\n", solution.shiftToTheRight(i, numRows), result.get(i));
        }
    }
}
