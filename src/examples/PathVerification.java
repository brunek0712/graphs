package examples;

import java.util.Scanner;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
/**
 * This program prints nothing if the path is a valid one.  
 * Otherwise it prints the first fictitious vertex or edge in the path.
 * @author Paul Olsen
 *
 */
public class PathVerification {
	public static void main(String[] args) {
		Graph g = new Graph(args[0]);
		
		Scanner scan = new Scanner(System.in);
		
		int next = scan.nextInt();
		while(next != -1) {
			Vertex v = g.get(next);
			if(v == null) {
				System.out.println("No Vertex #" + next);
				break;
			}
			next = scan.nextInt();
			if(next == -1) break;
			boolean valid = false;
			for(Edge e : v.outEdges()) {
				if(e.destination().id() == next) {
					valid = true;
				}
			}
			if(!valid) {
				System.out.println("No edge from Vertex #" + v.id() + " to Vertex #" + next);
				break;
			}
		}
	}
}
