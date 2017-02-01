package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * A graph.
 * @author Paul Olsen
 *
 */
public class Graph extends TreeMap<Integer, Vertex> {
	
	/**
	 * Creates a <b>directed</b> graph from the file.  If the File cannot be read for any reason, an useless RuntimeException is thrown.
	 * @param filename
	 */
	public Graph(String filename) {
		super();
		String line = null;
		try { for(Scanner scan = new Scanner(new File(filename)); scan.hasNextLine(); line = scan.nextLine()) {
			if(line == null) line = scan.nextLine();
			if(line.startsWith("#")) continue;
			String[] parts = line.split("\\s+");
			int source = new Integer(parts[0]);
			int destination = new Integer(parts[1]);
			addEdge(source, destination);
		}} catch(FileNotFoundException fnfe) {
			throw new RuntimeException("Could not open file: " + filename);
		}
	}

	/**
	 * Adds a new edge to the graph.  You must specify the from and to ends of the edge.
	 * @param source the from end of the directed edge.
	 * @param destination the to end of the directed edge.
	 */
	public void addEdge(int source, int destination) {
		if(! containsKey(source)) {
			put(source, new Vertex(source));
		}
		if(! containsKey(destination)) {
			put(destination, new Vertex(destination));
		}
		Edge e = new Edge(get(source), get(destination));
		get(source).addOutEdge(e);
		get(destination).addInEdge(e);
	}
}
