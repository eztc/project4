import java.util.ArrayList;
import java.util.PriorityQueue;

public class BFS {
	
	public void search(Graph g, String start) {
		boolean seen[] = new boolean[g.getNodes().size()];
		int parents[] = new int[g.getNodes().size()];
		PriorityQueue<String> q = new PriorityQueue();
		ArrayList<EdgeNode> adj = new ArrayList<>();
		
		parents[g.getNodes().indexOf(start)] = 0;
		seen[g.getNodes().indexOf(start)] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			for (EdgeNode )
			
			
		}
	}
	
	public ArrayList<EdgeNode> getAdjNodes(Graph g, String letter) {
		for (int i = 0; i < g.getAdjList().size(); i++) {
			if (letter.equals(g.getAdjList().get(i).get(0).getStart())) {
				return g.getAdjList().get(i);
			}
		}
		
		System.out.println("Couldn't find letter");
		return null;
	}
}
