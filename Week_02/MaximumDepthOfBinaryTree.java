package day0530;

import java.util.HashSet;
import java.util.Set;

/**
 * @NAME: MaximumDepthOfBinaryTree
 * @author: zb
 * @DATE: 2020-05-30
 **/
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}
}
