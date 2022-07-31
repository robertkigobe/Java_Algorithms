package hashing;

public class MainLP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearProbing lp = new LinearProbing(4);
		lp.insertInHashTable("The");
		lp.insertInHashTable("quick");
		lp.insertInHashTable("brown");
		lp.insertInHashTable("fox");
		lp.insertInHashTable("jumped");
		lp.insertInHashTable("over");
		
		lp.displayHashTable();
		lp.searchHashTable("fox");
		lp.deleteKeyHashTable("fox");
		lp.displayHashTable();

	}

}
