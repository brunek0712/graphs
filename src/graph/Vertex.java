package graph;

import java.util.HashSet;
import java.util.LinkedList;

public class Vertex implements Comparable<Vertex> {
	private int id;
	
	private LinkedList<Edge> outEdges;
	private LinkedList<Edge> inEdges;
	
	public int hashCode() {
		return id;
	}
	
	public int compareTo(Vertex other) {
		return Integer.compare(id, other.id);
	}
	
	public Vertex(int id) {
		this.id = id;
		outEdges = new LinkedList<Edge>();
		inEdges = new LinkedList<Edge>();
	}
	
	public void addOutEdge(Edge e) {
		outEdges.add(e);
	}
	
	public void addInEdge(Edge e) {
		inEdges.add(e);
	}
	
	public int outDegree() {
		return outEdges.size();
	}
	
	public int inDegree() {
		return inEdges.size();
	}
	
	public int degree() {
		return outDegree() + inDegree();
	}
}
