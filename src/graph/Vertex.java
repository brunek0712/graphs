package graph;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * This class stores information about the vertices of a graph.
 * Each vertex has an id.
 * @author Paul Olsen
 *
 */

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
	
	/**
	 * Creates a new Vertex with the given id and no edges.
	 * @param id the name of the vertex (an integer).
	 */
	public Vertex(int id) {
		this.id = id;
		outEdges = new LinkedList<Edge>();
		inEdges = new LinkedList<Edge>();
	}
	
	/**
	 * Adds an edge coming out of the vertex.
	 * @param e the edge.
	 */
	public void addOutEdge(Edge e) {
		outEdges.add(e);
	}
	
	/**
	 * Adds an edge going into the vertex.
	 * @param e the edge.
	 */
	public void addInEdge(Edge e) {
		inEdges.add(e);
	}
	
	/**
	 * Returns the out degree of the vertex.
	 * @return the out degree of the vertex.
	 */
	public int outDegree() {
		return outEdges.size();
	}
	
	/**
	 * Returns the in degree of the vertex.
	 * @return the in degree of the vertex.
	 */
	public int inDegree() {
		return inEdges.size();
	}
	
	/**
	 * Returns the degree of the vertex.  The degree is the out degree plus the in degree.
	 * @return The degree of the vertex.
	 */
	public int degree() {
		return outDegree() + inDegree();
	}
	
	/**
	 * Returns the outgoing edges of the vertex.
	 * @return the outgoing edges of the vertex.
	 */
	public Iterable<Edge> outEdges() {
		return outEdges;
	}
	
	/**
	 * Returns the in edges of the vertex.
	 * @return the in edges of the vertex.
	 */
	public Iterable<Edge> inEdges() {
		return inEdges;
	}
}
