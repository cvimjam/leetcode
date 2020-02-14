package leetcode;
public class Tree {
	
	static class Node {
		int val;
		Node left, right;

		Node(int val) {
			this.val = val;
			left = null;
			right = null;
		}
	}

	public void insert(Node node, int val) {
		if (val < node.val) {
			if (node.left != null) {
				insert(node.left, val);
			} else {
				System.out.println(" Inserted " + val + " to left of " + node.val);
				node.left = new Node(val);
			}
		} else if (val > node.val) {
			if (node.right != null) {
				insert(node.right, val);
			} else {
				System.out.println("  Inserted " + val + " to right of " + node.val);
				node.right = new Node(val);
			}
		}
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.val);
			traverseInOrder(node.right);
		}
	}

	public static void main(String args[]) {
		Tree tree = new Tree();
		Node root = new Node(5);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root val " + root.val);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		System.out.println("Traversing tree in order");
		
		tree.traverseInOrder(root);

	}
}
