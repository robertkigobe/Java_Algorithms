package graphs;

import java.util.ArrayList;

public class GraphNodeLL {
	
	  public String name;
	  public int index;
	  public boolean isVisited = false;

	  public ArrayList<GraphNodeLL> neighbors = new ArrayList<GraphNodeLL>();

	  public GraphNodeLL(String name, int index) {
	    this.name = name;
	    this.index = index;
	  }
}
