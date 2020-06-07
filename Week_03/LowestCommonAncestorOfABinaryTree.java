public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // terminator
        if (root == null || root == p || root ==q) {
            return root;
        }

        //drill
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //restore status
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
