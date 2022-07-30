package ssspp;

import java.util.ArrayList;

public class MainAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<GraphNodeAM> nodeList = new ArrayList<GraphNodeAM>();
		
		nodeList.add(new GraphNodeAM("A", 0));
		nodeList.add(new GraphNodeAM("B", 1));
		nodeList.add(new GraphNodeAM("C", 2));
		nodeList.add(new GraphNodeAM("D", 3));
		nodeList.add(new GraphNodeAM("E", 4));
		nodeList.add(new GraphNodeAM("F", 5));
		nodeList.add(new GraphNodeAM("G", 6));

		GraphAM g = new GraphAM(nodeList);
		
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(1, 3);
		g.addUndirectedEdge(1, 6);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(2, 4);
		g.addUndirectedEdge(3, 5);
		g.addUndirectedEdge(4, 5);
		g.addUndirectedEdge(5, 6);
		
		g.BFSForSSSPP(nodeList.get(0));

	}

}
