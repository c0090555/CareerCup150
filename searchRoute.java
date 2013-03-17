
package TreesAndGraphs;
import java.util.LinkedList;



public class searchRoute {
	public enum State{
		Unvisited, Visited, Visiting;
	}
	
	public static boolean search(Graph g, Node start, Node end){
		LinkedList<Node> q = new LinkedList<Node>(); //Operate as a Stack
		for(Node u: g.getNodes()){
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		q.add(start);
		Node u;
		while(!q.isEmpty()){
			u = q.removeFirst();// i.e. pop()
			if(u != null){
				for(Node v: u.getAdjacent()){
					if(v.state == State.Unvisited){
						if(v == end)
							return true;
						else{
							v.state = State.Visiting;
							q.add(v);
						}
					}
						
				}
				u.state = State.Visited;
			}
			
			
		}
		
		return false;	
	}

}

class Node{
	private int value;
	public searchRoute.State state;
}


