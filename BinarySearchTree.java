package leetcode;

//Java program to demonstrate insert operation in binary search tree 
class BinarySearchTree { 

	/* Class containing left and right child of current node and key value*/
	class Node { 
		int key; 
		Node left, right; 

		public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 

	// Root of BST 
	Node root;

	// Constructor 
	BinarySearchTree() { 
		root = null; 
	} 

	// This method mainly calls insertRec() 
	void insert(int key) { 
	root = insertRec(root, key); 
	} 
	
	/* A recursive function to insert a new key in BST */
	Node insertRec(Node node, int key) { 

		/* If the tree is empty, return a new node */
		if (node == null) { 
			node = new Node(key); 
			return node; 
		} 

		/* Otherwise, recur down the tree */
		if (key < node.key) 
			node.left = insertRec(node.left, key); 
		else if (key > node.key) 
			node.right = insertRec(node.right, key); 

		/* return the (unchanged) node pointer */
		
		return node; 
	} 

	// This method mainly calls InorderRec() 
	void inorder() { 
	inorderRec(root); 
	} 

	// A utility function to do inorder traversal of BST 
	void inorderRec(Node root) { 
		if (root != null) { 
			inorderRec(root.left); 
			System.out.println(root.key); 
			inorderRec(root.right); 
		} 
	} 

	Node merge(Node a, Node b) {

		if (a != null && b != null) {
			Node mNode = new Node(a.key + b.key);
			mNode.left = merge(a.left, b.left);
			mNode.right = merge(a.right, b.right);
			return mNode;
		} else if (a != null && b == null)
			return a;
		else if (a == null && b != null)
			return b;

		return null;
	}

	// Driver Program to test above functions 
	public static void main(String[] args) { 
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTree tree1 = new BinarySearchTree();

		/* Let us create following BST 
		  50 
		/	 \ 
		30	 70 
		/ \ / \ 
	20 40 60 80 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inorderRec(tree.root);
		System.out.println("==========");
		
		tree1.insert(100);
		tree1.insert(50);
		tree1.insert(80);
		tree1.insert(150);
		tree.inorderRec(tree1.root);
		System.out.println("==========");
		
		Node node = tree.merge(tree.root, tree1.root);
		
		tree.inorderRec(node);
		
	} 
} 
//This code is contributed by Ankur Narain Verma 

