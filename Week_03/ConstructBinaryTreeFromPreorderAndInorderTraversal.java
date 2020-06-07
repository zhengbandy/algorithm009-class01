public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        //terminator
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        // process
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = 0; // Index of current root in inorder
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                rootIndex = i;
            }
        }
        //drill down
        root.left = helper(preStart + 1, inStart, rootIndex - 1, preorder, inorder);
        root.right = helper(preStart + rootIndex - inStart + 1, rootIndex + 1, inEnd, preorder, inorder);
        return root;
        //restore status
    }

}
