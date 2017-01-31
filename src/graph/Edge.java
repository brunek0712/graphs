package graph;

/**
 * A <b>directed</b> edge.
 * @author olsenp
 *
 */
public class Edge {
	private Vertex source;
	private Vertex destination;
	
	/**
	 * Creates a directed edge with a vertex at each end.
	 * @param in the edge is from this vertex
	 * @param out the edge goes to this vertex.
	 */
	public Edge(Vertex in, Vertex out) {
		source = in;
		destination = out;
	}

	public int hashCode() {
		return source.hashCode() ^ destination.hashCode();
	}
	
	/**
	 * Returns the vertex this edge came out of.
	 * @return the vertex this edge came out of.
	 */
	public Vertex source() {
		return source;
	}
	
	/**
	 * Returns the vertex this edge is going to.
	 * @return the vertex this edge is going to.
	 */
	public Vertex destination() {
		return destination;
	}
}
