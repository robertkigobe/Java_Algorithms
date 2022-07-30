package ssspp;
public class GraphNodeAM {
  public String name;
  public int index;
  public boolean isVisited = false;
  public GraphNodeAM parent;

  public GraphNodeAM(String name, int index) {
    this.name = name;
    this.index = index;
  }
}
