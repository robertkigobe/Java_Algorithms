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
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);

		System.out.print(g.toString());
		System.out.println("Breadth First Traversal");

		//g.bfs();
		System.out.println("\nDeapth First Traversal");

		g.dfs();
		
		// TODO Auto-generated method stub
		ArrayList<GraphNode> nodeListTs = new ArrayList<GraphNode>();
		nodeListTs.add(new GraphNode("A",0));
		nodeListTs.add(new GraphNode("B",1));
		nodeListTs.add(new GraphNode("C",2));
		nodeListTs.add(new GraphNode("D",3));
		nodeListTs.add(new GraphNode("E",4));
		nodeListTs.add(new GraphNode("F",5));
		nodeListTs.add(new GraphNode("G",6));
		nodeListTs.add(new GraphNode("H",7));
		Graph gTs = new Graph(nodeListTs);
		gTs.addUndirectedEdge(0, 2);
		gTs.addUndirectedEdge(2, 4);
		gTs.addUndirectedEdge(4, 7);
		gTs.addUndirectedEdge(4, 5);
		gTs.addUndirectedEdge(5, 6);
		gTs.addUndirectedEdge(1,2);
		gTs.addUndirectedEdge(1,3);
		gTs.addUndirectedEdge(3,5);
		
		gTs.toString();
		System.out.println();
		gTs.topologicalSort();//.................T = o(V+E)........S = o(V+E)

	}

}
