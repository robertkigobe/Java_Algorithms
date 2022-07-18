package binaryTree;

public class BinaryTreeLL {
	
	BinaryNode root;
	
	public BinaryTreeLL() {
		this.root = null;
		System.out.println("BinaryTree with root node null");
	}
	
	//preorder search
	public void preOrder(BinaryNode node) {
		
		//if node is null return 
		if (node == null) {
			return; 
		}
			
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//inOrder search
		public void inOrder(BinaryNode node) {
			
			//if node is null return 
			if (node == null) {
				return; 
			}
				
			preOrder(node.left);
			System.out.print(node.value+" ");
			preOrder(node.right);
		}

}
