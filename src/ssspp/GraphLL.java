package ssspp;

import java.util.*;

public class GraphLL {

	ArrayList<GraphNodeLL> nodeList = new ArrayList<GraphNodeLL>();

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
			for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
				if (j == nodeList.get(i).neighbors.size() - 1) {
					s.append((nodeList.get(i).neighbors.get(j).name));
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
					neighbor.isVisited = true;
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

	void dfsVisit(GraphNodeLL node) {
		Stack<GraphNodeLL> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNodeLL currentNode = stack.pop();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			for (GraphNodeLL neighbor : currentNode.neighbors) {
				if (!neighbor.isVisited) {
					stack.push(neighbor);
					neighbor.isVisited = true;
				}
			}
		}
	}

	void dfs() {
		for (GraphNodeLL node : nodeList) {
			if (!node.isVisited) {
				dfsVisit(node);
			}
		}
	}

	// Topological Sort
	public void addDirectedEdge(int i, int j) {
		GraphNodeLL first = nodeList.get(i);
		GraphNodeLL second = nodeList.get(j);
		first.neighbors.add(second);
	}

	void topologicalVisit(GraphNodeLL node, Stack<GraphNodeLL> stack) {
		for (GraphNodeLL neighbor : node.neighbors) {
			if (!neighbor.isVisited) {
				topologicalVisit(neighbor, stack);
			}
		}
		node.isVisited = true;
		stack.push(node);
	}

	void topologicalSort() {
		Stack<GraphNodeLL> stack = new Stack<>();
		for (GraphNodeLL node : nodeList) {
			if (!node.isVisited) {
				topologicalVisit(node, stack);
			}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().name + " ");
		}
	}

	public static void pathPrint(GraphNodeLL node) {
		if (node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + " ");
	}

	public  void BFSForSSSPP(GraphNodeLL node) {
		LinkedList<GraphNodeLL> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNodeLL currentNode = queue.remove(0);
			currentNode.isVisited = true;
			System.out.print("Printing path for node " + currentNode.name + ": ");
			pathPrint(currentNode);
			System.out.println();
			for (GraphNodeLL neighbor : currentNode.neighbors) {
				if (!neighbor.isVisited) {
					queue.add(neighbor);
					neighbor.isVisited = true;
					neighbor.parent = currentNode;
				}
			}

		}
	}

}
