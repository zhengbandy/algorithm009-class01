package day0530;

import java.util.ArrayList;
import java.util.List;

/**
 * @NAME: NAryTreeLevelOrderTraversal
 * @author: zb
 * @DATE: 2020-05-31
 **/
public class NAryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> res = new ArrayList<Integer>();
		List<Node> prev = new ArrayList<Node>();
		if (root != null) {
			prev.add(root);
		}
		List<Node> curr = new ArrayList<Node>();
		while (prev.size() != 0) {
			for (Node temp : prev) {
				if (temp != null) {
					res.add(temp.val);
					for (Node child : temp.children) {
						curr.add(child);
					}
				}
			}
			result.add(res);
			res = new ArrayList<Integer>();
			prev = curr;
			curr = new ArrayList<Node>();
		}
		return result;
	}
}
class Node {
	public int val;
	public List<Node> children;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};