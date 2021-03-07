package app;

import java.util.ArrayList;
import java.util.List;

/**
 * inzheneher created on 05/03/2021 inside the package - app
 * <p>
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        return result;
    }

    private TreeNode getTreeNode() {
        return new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode tN = solution.getTreeNode();
        System.out.println(solution.averageOfLevels(tN));
    }
}
