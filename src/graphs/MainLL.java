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
		
		g.dfs();
		

	}

}
