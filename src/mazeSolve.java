import java.util.ArrayList;

public class mazeSolve {

	public static void main(String[] args) {
		Graph graph = new Graph();
		BFS bfs = new BFS();
		graph.initialize();
		EdgeNode temp = bfs.search(graph, graph.getEdges().get(0));
		
		ArrayList<String> print = new ArrayList<>();
		print.add(temp.getDest());
		print.add(temp.getStart());
		while(temp.getParent() != null) {
			print.add(temp.getParent().getStart());
			temp = temp.getParent();
		}
		
		for (int i = print.size() - 1; i >= 0; i--) {
			System.out.print(print.get(i) + " ");
		}
	}

}
