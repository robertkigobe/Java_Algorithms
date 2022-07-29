package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class GraphLL {

	public ArrayList<GraphNodeLL> nodeList = new ArrayList<GraphNodeLL>();
	

	public GraphLL(ArrayList<GraphNodeLL> nodeList) {
	    this.nodeList = nodeList;
	  }

	  public void addUndirectedEdge(int i, int j) {
	    GraphNodeLL first = nodeList.get(i);
	    GraphNodeLL second = nodeList.get(j);
	    first.neighbors.add(second);
	    second.neighbors.add(first);
	  }



	// For printing Graph to the console

	  public String toString() {
	    StringBuilder s = new StringBuilder();
	    for (int i = 0; i < nodeList.size(); i++) {
	      s.append(nodeList.get(i).name + ": ");
	      for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
	        if (j == nodeList.get(i).neighbors.size()-1 ) {
	          s.append((nodeList.get(i).neighbors.get(j).name) );
	        } else {
	          s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
	        }
	      }
	      s.append("\n");
	    }
	    return s.toString();
	  }

	  // BFS internall
	  void bfsVisit(GraphNodeLL node) {
	    LinkedList<GraphNodeLL> queue = new LinkedList<GraphNodeLL>();
	    queue.add(node);
	    while (!queue.isEmpty()) {
	      GraphNodeLL currentNode = queue.remove(0);
	      currentNode.isVisited = true;
	      System.out.print(currentNode.name + " ");
	      for (GraphNodeLL neighbor : currentNode.neighbors) {
	        if (!neighbor.isVisited) {
	          queue.add(neighbor);
	          neighbor.isVisited=true;
	        }
	      }
	    }
	  }

	  void bfs() {
	    for (GraphNodeLL node : nodeList) {
	      if (!node.isVisited) {
	        bfsVisit(node);
	      }
	    }
	  }
	  /*

	  void dfsVisit(GraphNode node) {
	    Stack<GraphNode> stack = new Stack<>();
	    stack.push(node);
	    while (!stack.isEmpty()) {
	      GraphNode currentNode = stack.pop();
	      currentNode.isVisited = true;
	      System.out.print(currentNode.name + " ");
	      for (GraphNode neighbor : currentNode.neighbors) {
	        if (!neighbor.isVisited) {
	          stack.push(neighbor);
	          neighbor.isVisited=true;
	        }
	      }
	    }
	  }

	  void dfs() {
	    for (GraphNode node : nodeList) {
	      if(!node.isVisited) {
	        dfsVisit(node);
	      }
	    }
	  }

*/


	}

