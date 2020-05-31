package day0530;

import java.util.ArrayList;
import java.util.List;

/**
 * @NAME: NAryTreePreorderTraversal
 * @author: zb
 * @DATE: 2020-05-31
 **/
public class NAryTreePreorderTraversal {
	public List<Integer> preorder(Node root) {
		List<Integer> result = new ArrayList<Integer>();
		add(result, root);
		return result;
	}

	public void add(List<Integer> result, Node root) {
		if (root != null) {
			result.add(root.val);
			for (Node temp : root.children) {
				if (temp != null) {
					add(result, temp);
				}
			}
		}
	}
}