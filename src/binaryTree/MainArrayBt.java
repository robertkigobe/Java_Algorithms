package binaryTree;

public class MainArrayBt {
	
	public static void main(String[] args) {
		
		BinaryTreeArray bta = new BinaryTreeArray(14);
		
		int root = 1;
		bta.insert("N1");
		bta.insert("N2");
		bta.insert("N3");
		bta.insert("N4");
		bta.insert("N5");
		bta.insert("N6");
		bta.insert("N7");
		bta.insert("N8");
		bta.insert("N9");
		bta.insert("N10");
		bta.insert("N11");
		bta.insert("N12");
		bta.insert("N13");
		bta.insert("N14");
		bta.insert("N15");
		
		bta.preOrder(1);
		
		
	System.out.print("\nPreOrder===>");
		
		bta.preOrder(1);
		
		System.out.print("\nInOrder===>");
		bta.inOrder(1);
		
		System.out.print("\nPostOrder===>");
		bta.postOrder(1);
		
		System.out.print("\nLevelOrder===>");
		bta.levelOrder();
		
		
		bta.search("N11");
		
		bta.delete("N11");
		
		System.out.print("\nLevelOrder===>");
		bta.levelOrder();
	}
	

}
