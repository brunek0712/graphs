package graph;

public class Edge {
	private Vertex source;
	private Vertex destination;
	
	public Edge(Vertex in, Vertex out) {
		source = in;
		destination = out;
	}
	
	public int hashCode() {
		return source.hashCode() ^ destination.hashCode();
	}
	
	public Vertex source() {
		return source;
	}
	
	public Vertex destination() {
		return destination;
	}
}
