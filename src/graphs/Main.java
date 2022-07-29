package graphs;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));

		Graph g = new Graph(nodeList);
		g.addUnDirectedNode(0, 1);
		g.addUnDirectedNode(0, 2);
		g.addUnDirectedNode(0, 3);
		g.addUnDirectedNode(1, 4);
		g.addUnDirectedNode(2, 3);
		g.addUnDirectedNode(3, 4);

		System.out.print(g.toString());
		System.out.println("Breadth First Traversal");

		//g.bfs();
		System.out.println("\nDeapth First Traversal");

		g.dfs();

	}

}
