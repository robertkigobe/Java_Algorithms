package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

	BinaryNode root;

	public BinaryTreeLL() {
		this.root = null;
		System.out.println("BinaryTree with root node null");
	}

	// preorder search
	public void preOrder(BinaryNode node) {

		// if node is null return
		if (node == null) {
			return;
		}

		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// inOrder search
	public void inOrder(BinaryNode node) {

		// if node is null return
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}

	// PostOrder search
	public void postOrder(BinaryNode node) {

		// if node is null return
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}

	// Level Order search
	public void levelOrder() {

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.value + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}

	}

	// Level Order search
	public void searchBT(String value) {

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.value == value) {

				System.out.println("\nThe value " + presentNode.value + " has been found");
				return;
			} else {
				if (presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if (presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
		}

		System.out.println("The value is " + value + " is not found");

	}
}
