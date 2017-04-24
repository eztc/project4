
public class mazeSolve {

	public static void main(String[] args) {
		Graph graph = new Graph();
		BFS bfs = new BFS();
		graph.initialize();
		bfs.search(graph, "A");

	}

}
