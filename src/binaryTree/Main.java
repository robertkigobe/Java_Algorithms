package binaryTree;

public class Main {
	
	public static void main (String[] args) {
		BinaryTreeLL btll = new BinaryTreeLL();
		
		
		btll.inserBT("N1");
		btll.inserBT("N2");
		btll.inserBT("N3");
		btll.inserBT("N4");
		btll.inserBT("N5");
		btll.inserBT("N6");
		btll.inserBT("N7");
		btll.inserBT("N8");
		btll.inserBT("N9");
		btll.inserBT("N10");
		btll.inserBT("N11");
		btll.inserBT("N12");
		btll.inserBT("N13");
		btll.inserBT("N14");
		btll.inserBT("N15");
		
		
		
		System.out.print("\nPreOrder===>");
		
		btll.preOrder(btll.root);
		
		System.out.print("\nInOrder===>");
		btll.inOrder(btll.root);
		
		System.out.print("\nPostOrder===>");
		btll.postOrder(btll.root);
		
		System.out.print("\nLevelOrder===>");
		btll.levelOrder();
		
		System.out.println("\nDeepest===>"+btll.getDeepestNode().value);
		
		btll.deleteDeepestNode();
		
		System.out.print("\nLevelOrder===>");
		btll.levelOrder();
		
		btll.deleteNode("N44");
		
		btll.deleteBT();
		
		
	}

}
