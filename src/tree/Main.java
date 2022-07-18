package tree;

public class Main {
	
	public static void main(String[] args) {
		
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		drinks.addChild(cold);
		drinks.addChild(hot);
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		TreeNode wine = new TreeNode("Wine");
		TreeNode beer = new TreeNode("Beer");
		hot.addChild(coffee);
		hot.addChild(tea);
		cold.addChild(beer);
		cold.addChild(wine);
		System.out.println(drinks.print(0));
		
	}

}
