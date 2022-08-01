package trie;

public class Main {

	public static void main(String[] args) {

		Trie newTrie = new Trie();
		newTrie.insert("API");
		newTrie.insert("APIS"); //....T =o(N) size of word..........S = O(N)
		newTrie.search("AP"); //....T =o(N) size of word..........S = O(1)

	}
}
