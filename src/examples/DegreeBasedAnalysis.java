package examples;

import java.util.HashMap;

import graph.Graph;
import graph.Vertex;

/**
 * Prints the degree of each vertex and the sum of the degrees.  This is, of course, exactly twice the number of
 * edges in the graph...
 * @author Paul Olsen
 *
 */
public class DegreeBasedAnalysis {
	public static void main(String[] args) {
		Graph g = new Graph(args[0]);
		
		HashMap<Vertex, Integer> degrees = new HashMap<Vertex, Integer>();
		for(Vertex v : g.values()) {  //this loop stores the information.
			degrees.put(v, v.outDegree());  //notice how we use the hashmap...
		}
		
		int sum = 0;
		for(Vertex v : degrees.keySet()) { //notice how we loop over the stuff in the hash map...
			System.out.println("deg(" + v.id() + ") = " + degrees.get(v));
			sum += degrees.get(v);
		}
		System.out.println("sum of degrees = " + sum);
	}
}
