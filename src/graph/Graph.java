package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Graph extends TreeMap<Integer, Vertex> {
	
	public Graph(String filename) {
		super();
		String line = null;
		try { for(Scanner scan = new Scanner(new File(filename)); scan.hasNextLine(); line = scan.nextLine()) {
			if(line == null) line = scan.nextLine();
			if(line.startsWith("#")) continue;
			String[] parts = line.split("\t");
			int source = new Integer(parts[0]);
			int destination = new Integer(parts[1]);
			addEdge(source, destination);
		}} catch(FileNotFoundException fnfe) {
			System.out.println("Could not open file: " + filename);
		}
	}

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
