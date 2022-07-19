package binaryTree;

public class MainBST {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
		bst.preOrder(bst.root);
		System.out.println();
		bst.inOrder(bst.root);
		System.out.println();
		bst.postOrder(bst.root);
		System.out.println();
		bst.levelOrder();
		System.out.println();
		bst.search(bst.root, 40);
		System.out.println();
		int value = bst.minimumNode(bst.root).value;
		
		System.out.println(value);
		bst.deleteNode(bst.root, 60);
		System.out.println();
		bst.levelOrder();
		System.out.println();
		bst.deleteBST();
	}

}
