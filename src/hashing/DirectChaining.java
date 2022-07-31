package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {
	
	LinkedList<String>[] hashTable;
	int maxChainSize = 5;
	
	public DirectChaining(int size) {
		hashTable = new LinkedList[size];	
	}
	
	public int modASCII(String word, int M) {
		
		char ch[];
		ch = word.toCharArray();
		int sum,i;
		for(sum =0, i=0; i<word.length(); i++) {
			sum = sum + ch[i];
		}
		
		return sum % M;
		
	}
	
	public void insterHashTable(String word) {
		
		int newIndex = modASCII(word,hashTable.length);
		if(hashTable[newIndex]==null) {
			hashTable[newIndex] = new LinkedList<>();
			hashTable[newIndex].add(word);
		} else {
			hashTable[newIndex].add(word);
		}
	}
	
	//display values in the hashtable
	public void displayHashTable() {
		if(hashTable==null) {
			System.out.println("Hash Table doesnt exist");
			return;
		} else {
			System.out.println("=====>Hash Table<=======");
			for(int i=0; i<hashTable.length; i++) {
				System.out.println("index: "+i +" Key: " + hashTable[i]);	
			}
			
		}
	}
	
	//search hash table
	public boolean searchHashTable(String word) {
		int newIndex = modASCII(word,hashTable.length);
		if(hashTable[newIndex]!= null && hashTable[newIndex].contains(word)) {
			System.out.println("\n: "+"\""+word +" found at location: " + newIndex);	
			return true;
		} else {
			System.out.println("\n: "+"\""+word +" not found in hash table");	
			return false;
		}
		
		
	}
	
	//delete from direct chain 
	public void delete(String word) {
		int newIndex = modASCII(word,hashTable.length);
		Boolean result = searchHashTable(word);
		if(result) {
			hashTable[newIndex].remove(word);
			System.out.println("\n: "+"\""+word + " deleted from hash table");	
			return;
		} else {
			System.out.println("\n: "+"\""+word +" not found in hash table");	
			return;
		}
		
		
	}

}
