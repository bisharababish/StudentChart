
package NodingLeftAndRight;
public class BTandBST {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	static Node root;

	BTandBST() {
		root = null;
	}

	void insert(int key) {
		root = insertRecurion(root, key);
	}

	Node insertRecurion(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRecurion(root.left, key);
		else if (key > root.key)
			root.right = insertRecurion(root.right, key);
		return root;
	}

	void inorder() {
		inorderRecursion(root);
	}

	void inorderRecursion(Node root) {
		if (root != null) {
			inorderRecursion(root.left);
			System.out.println(root.key);
			inorderRecursion(root.right);
		}
	}

	void preorder() {
		preorderRecursion(root);
	}

	void preorderRecursion(Node root) {
		if (root != null) {
			System.out.println(root.key);
			preorderRecursion(root.left);
			preorderRecursion(root.right);
		}
	}

	void postorder() {
		postorderRecursion(root);
	}

	void postorderRecursion(Node root) {
		if (root != null) {
			postorderRecursion(root.right);
			System.out.println(root.key);
			postorderRecursion(root.left);
		}
	}

	static boolean Search(Node root, int key) {
		while (root != null) {
			if (key > root.key)
				root = root.right;
			else if (key < root.key)
				root = root.left;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		BTandBST tree = new BTandBST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		System.out.println("inorder:");
		tree.inorder();
		System.out.println("postorder:");
		tree.postorder();
		System.out.println("preorder:");
		tree.preorder();
		if (Search(root, 20))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
