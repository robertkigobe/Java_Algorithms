package graphs;

import java.util.ArrayList;

public class MainLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraphNodeLL> nodeList = new ArrayList<GraphNodeLL>();
		nodeList.add(new GraphNodeLL("A",0));
		nodeList.add(new GraphNodeLL("B",1));
		nodeList.add(new GraphNodeLL("C",2));
		nodeList.add(new GraphNodeLL("D",3));
		nodeList.add(new GraphNodeLL("E",4));
		
		GraphLL g = new GraphLL(nodeList);
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3,4);
		
		System.out.print(g.toString());
		
		System.out.println();
		//g.bfs(); //.................T = o(V+E)........S = o(V+E)
		
		//g.dfs();//.................T = o(V+E)........S = o(V+E)
		
		// TODO Auto-generated method stub
		ArrayList<GraphNodeLL> nodeListTs = new ArrayList<GraphNodeLL>();
		nodeListTs.add(new GraphNodeLL("A",0));
		nodeListTs.add(new GraphNodeLL("B",1));
		nodeListTs.add(new GraphNodeLL("C",2));
		nodeListTs.add(new GraphNodeLL("D",3));
		nodeListTs.add(new GraphNodeLL("E",4));
		nodeListTs.add(new GraphNodeLL("F",5));
		nodeListTs.add(new GraphNodeLL("G",6));
		nodeListTs.add(new GraphNodeLL("H",7));
		GraphLL gTs = new GraphLL(nodeListTs);
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
