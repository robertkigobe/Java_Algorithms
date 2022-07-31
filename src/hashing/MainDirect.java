package hashing;

public class MainDirect {
	
	public static void main(String[] args) { 
		
		DirectChaining directChaining = new DirectChaining(13);
		
		directChaining.insterHashTable("The");
		directChaining.insterHashTable("quick");
		directChaining.insterHashTable("brown");
		directChaining.insterHashTable("fox");
		directChaining.insterHashTable("jumped");
		directChaining.insterHashTable("over");
		
		directChaining.displayHashTable();
		
		directChaining.searchHashTable("fox");
		
		directChaining.delete("fox");
		
		directChaining.searchHashTable("fox");
		
		
	}

}
