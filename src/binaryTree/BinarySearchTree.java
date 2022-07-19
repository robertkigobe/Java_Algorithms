package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	BinarySTNode root;

	BinarySearchTree() {
		root = null;
	}

	// Insert Method
	private BinarySTNode insert(BinarySTNode currentNode, int value) {
		if (currentNode == null) {
			BinarySTNode newNode = new BinarySTNode();
			newNode.value = value;
			// System.out.println("The value successfully inserted");
			return newNode;
		} else if (value <= currentNode.value) {
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		} else {
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
	}

	void insert(int value) {
		root = insert(root, value);
	}

	// PreOrder Traversal

	public void preOrder(BinarySTNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// Inorder Traversal
	public void inOrder(BinarySTNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);

	}

	// PostOrder Traversal
	public void postOrder(BinarySTNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}

	// Level Order

	void levelOrder() {
		Queue<BinarySTNode> queue = new LinkedList<BinarySTNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinarySTNode presentNode = queue.remove();
			System.out.print(presentNode.value + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}

	// Search Method
	BinarySTNode search(BinarySTNode node, int value) {
		if (node == null) {
			System.out.println("Value: " + value + " not found in BST");
			return null;
		} else if (node.value == value) {
			System.out.println("Value: " + value + " found in BST");
			return node;
		} else if (value < node.value) {
			return search(node.left, value);
		} else {
			return search(node.right, value);
		}
	}

	// Minimum node
	public static BinarySTNode minimumNode(BinarySTNode root) {
		if (root.left == null) {
			return root;
		} else {
			return minimumNode(root.left);
		}
	}

	// Delete node
	public BinarySTNode deleteNode(BinarySTNode root, int value) {
		if (root == null) {
			System.out.println("Value not found in BST");
			return null;
		}
		if (value < root.value) {
			root.left = deleteNode(root.left, value);
		} else if (value > root.value) {
			root.right = deleteNode(root.right, value);
		} else {
			if (root.left != null && root.right != null) {
				BinarySTNode temp = root;
				BinarySTNode minNodeForRight = minimumNode(temp.right);
				root.value = minNodeForRight.value;
				root.right = deleteNode(root.right, minNodeForRight.value);
			} else if (root.left != null) {
				root = root.left;
			} else if (root.right != null) {
				root = root.right;
			} else {
				root = null;
			}
		}

		return root;

	}

	public void deleteBST() {
		root = null;
		System.out.println("BST has been deleted successfully");
	}

}
