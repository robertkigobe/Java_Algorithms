package ssspp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphAM {
  ArrayList<GraphNodeAM> nodeList = new ArrayList<GraphNodeAM>();
  int[][] adjacencyMatrix;

  public GraphAM(ArrayList<GraphNodeAM> nodeList) {
    this.nodeList = nodeList;
    adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
  }

  public void addUndirectedEdge(int i, int j) {
    adjacencyMatrix[i][j] = 1;
    adjacencyMatrix[j][i] = 1;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("   ");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + " ");
    }
    s.append("\n");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j : adjacencyMatrix[i]) {
        s.append((j) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

  // get Neighbors
  public ArrayList<GraphNodeAM> getNeighbors(GraphNodeAM node) {
    ArrayList<GraphNodeAM> neighbors = new ArrayList<GraphNodeAM>();
    int nodeIndex = node.index;
    for (int i=0; i<adjacencyMatrix.length; i++) {
      if(adjacencyMatrix[nodeIndex][i]==1) {
        neighbors.add(nodeList.get(i));
      }
    }
    return neighbors;

  }

  // BSF internall
  void bfsVisit(GraphNodeAM node) {
    LinkedList<GraphNodeAM> queue = new LinkedList<GraphNodeAM>();
    queue.add(node);
    while(!queue.isEmpty()) {
      GraphNodeAM currentNode = queue.remove(0);
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNodeAM> neighbors = getNeighbors(currentNode);
      for (GraphNodeAM neighbor: neighbors) {
        if (!neighbor.isVisited) {
          queue.add(neighbor);
          neighbor.isVisited = true;
        }
      }
    }
  }

  public void bfs() {
    for (GraphNodeAM node : nodeList) {
      if(!node.isVisited) {
        bfsVisit(node);
      }
    }
  }

  void dfsVisit(GraphNodeAM node) {
    Stack<GraphNodeAM> stack = new Stack<>();
    stack.push(node);
    while(!stack.isEmpty()) {
      GraphNodeAM currentNode = stack.pop();
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNodeAM> neighbors = getNeighbors(currentNode);
      for (GraphNodeAM neighbor : neighbors) {
        if (!neighbor.isVisited) {
          stack.push(neighbor);
          neighbor.isVisited = true;
        }
      }

    }
  }

  void dfs() {
    for (GraphNodeAM node : nodeList) {
      if(!node.isVisited) {
        dfsVisit(node);
      }
    }
  }

  //  Topological Sort
  public void addDirectedEdge(int i, int j) {
    adjacencyMatrix[i][j] = 1;
  }

  void topologicalVisit(GraphNodeAM node, Stack<GraphNodeAM> stack) {
    ArrayList<GraphNodeAM> neighbors = getNeighbors(node);
    for (GraphNodeAM neighbor : neighbors) {
      if (!neighbor.isVisited) {
        topologicalVisit(neighbor, stack);
      }
    }
    node.isVisited = true;
    stack.push(node);
  }

  void topologicalSort() {
    Stack<GraphNodeAM> stack = new Stack<>();
    for (GraphNodeAM node : nodeList) {
      if (!node.isVisited) {
        topologicalVisit(node, stack);
      }
    }

    while (!stack.isEmpty()) {
      System.out.print(stack.pop().name + " ");
    }
  }


  //Print path of each of the vertex from source
 public static void pathPrint(GraphNodeAM node) {
   if(node.parent!=null) {
    pathPrint(node.parent);
  }
   System.out.print(node.name+" ");
 }

 public void BFSForSSSPP(GraphNodeAM node) {
   LinkedList<GraphNodeAM> queue = new LinkedList<>();
   queue.add(node);
   while(!queue.isEmpty()) {
     GraphNodeAM currentNode = queue.remove(0);
     currentNode.isVisited = true;
     System.out.print("Printing path for node "+currentNode.name+": ");
     pathPrint(currentNode);
     System.out.println();
     ArrayList<GraphNodeAM> neighbors = getNeighbors(currentNode);
     for (GraphNodeAM neighbor : neighbors) {
       if (!neighbor.isVisited) {
         queue.add(neighbor);
         neighbor.isVisited = true;
         neighbor.parent = currentNode;
       }
     }

   }
 }






}
