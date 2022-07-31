package dijkastra;
import java.util.*;

public class WeightedGraph {
  ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

  public WeightedGraph(ArrayList<WeightedNode> nodeList) {
    this.nodeList = nodeList;
  }

  void dijkstra(WeightedNode node) {
    PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
    node.distance = 0;
    queue.addAll(nodeList);
    while(!queue.isEmpty()) {
      WeightedNode currentNode = queue.remove();
      for (WeightedNode neighbor : currentNode.neighbors) {
        if(queue.contains(neighbor)) {
          if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
            neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
            neighbor.parent = currentNode;
            queue.remove(neighbor);
            queue.add(neighbor);
          }
        }
      }
    }

    for (WeightedNode nodeToCheck : nodeList) {
      System.out.print("Node " +nodeToCheck+", distance: "+nodeToCheck.distance+", Path: ");
      pathPrint(nodeToCheck);
      System.out.println();
    }
  }

  public static void pathPrint(WeightedNode node) {
   if (node.parent  != null) {
     pathPrint(node.parent);
   }
   System.out.print(node.name + " ");
 }

  public void addWeightedEdge(int i, int j, int d) {
    WeightedNode first = nodeList.get(i);
    WeightedNode second = nodeList.get(j);
    first.neighbors.add(second);
    first.weightMap.put(second,d);
  }
}
