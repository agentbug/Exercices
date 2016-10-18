package chapitre4;

import java.util.LinkedList;
import java.util.stream.Stream;

public class RouteBetweenNodes {

	enum State { Unvisited, visited, visiting;}
	
	class Node {
		String name;
		Node[] children;
		State state = State.Unvisited;
		
		public Node(String name, Node[] children) {
			super();
			this.name = name;
			this.children = children;
		}
	}
	
	class Graph {
		Node[] nodes;

		public Graph(Node[] nodes) {
			super();
			this.nodes = nodes;
		}
		
	}
	
	boolean search(Graph g, Node start, Node end){
		if(start == end) return true;
		
		LinkedList<Node> q = new LinkedList<Node>();
		
		start.state = State.visiting;
		q.add(start);
		Node u;
		while(!q.isEmpty()){
			u = q.removeFirst();
			if( u != null){
				for(Node v : u.children){
					if(v.equals(end)){
						return true;
					}else{
						v.state = State.visiting;
						q.add(v);
					}
				}
			}
			u.state = State.visited;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
