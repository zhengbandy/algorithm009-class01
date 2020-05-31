package day0530;

import java.util.ArrayList;
import java.util.List;

/**
 * @NAME: BinaryTreeInorderTraversal
 * @author: zb
 * @DATE: 2020-05-31
 **/
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		add(result,root);
		return result;
	}
	public void add(List<Integer> result,TreeNode root) {
		if(root!=null){
			if(root.left!=null){
				add(result,root.left);
			}
			result.add(root.val);
			if (root.right!=null){
				add(result,root.right);
			}
		}
	}
}
