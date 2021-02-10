/**
 * inzheneher created on 24/11/2020 inside the package - PACKAGE_NAME
 */
public class Flipper {
    public static void main(String[] args) {
        //create tree
        /*
         *           4
         *         /   \
         *        2     7
         *       / \   / \
         *      1   3 6   9
         * */
        TreeNode targetTree = getTree();
        printTree(targetTree);
        flipTree(targetTree);
        printTree(targetTree);
    }

    public static TreeNode getFlippedTree(TreeNode treeNode) {
        flipTree(treeNode);
        return treeNode;
    }

    private static TreeNode getTree() {
        TreeNode leaf1 = new TreeNode(1);
        TreeNode leaf2 = new TreeNode(3);
        TreeNode leaf3 = new TreeNode(6);
        TreeNode leaf4 = new TreeNode(9);

        TreeNode leftKid = new TreeNode(2, leaf1, leaf2);
        TreeNode rightKid = new TreeNode(7, leaf3, leaf4);

        return new TreeNode(4, leftKid, rightKid);
    }

    private static void flipTree(TreeNode root) {
        if (root == null) return;
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        flipTree(root.left);
        flipTree(root.right);
    }

    private static void printTree(TreeNode tree) {
        if (tree == null) {
            System.out.println();
            return;
        }
        System.out.print(tree.val + " ");
        printTree(tree.left);
        printTree(tree.right);
    }
}
