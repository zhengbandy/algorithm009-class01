package day0530;

import java.util.ArrayList;
import java.util.List;

/**
 * @NAME: BinaryTreePreorderTraversal
 * @author: zb
 * @DATE: 2020-05-31
 **/
public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		add(result, root);
		return result;
	}

	public void add(List<Integer> result, TreeNode root) {
		if (root != null) {
			result.add(root.val);
			if (root.left != null) {
				add(result, root.left);
			}
			if (root.right != null) {
				add(result, root.right);
			}

		}
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