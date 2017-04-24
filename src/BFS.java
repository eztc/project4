import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class BFS {

	public EdgeNode search(Graph g, EdgeNode source) {
		PriorityQueue<EdgeNode> q = new PriorityQueue<>();
		ArrayList<EdgeNode> vertices = new ArrayList<>();

		for (EdgeNode node : g.edges) {
			if (node.getStart() != "A") {
				node.setDist(Integer.MAX_VALUE);
				vertices.add(node);
			}
		}


		ArrayList<EdgeNode> adj = new ArrayList<>();
		source.setParent(null);
		source.setDist(0);
		q.add(source);

		while(!q.isEmpty()) {
			EdgeNode temp = q.remove();
			if (temp.getDest().equals("j")) {
				return temp;
			}

			adj = getAdjNodes(g, temp);
			if (adj != null) {
				for (EdgeNode node : adj) {
					if (node.getDist() == Integer.MAX_VALUE && (node.getColor().equals(temp.getColor()) ||
							node.getType().equals(temp.getType())) && temp.getStart() != node.getDest()) {
						node.setDist(temp.getDist() + 1);
						node.setParent(temp);
						q.add(node);
					}
				}
			}
		}
		return null;
	}

	public ArrayList<EdgeNode> getAdjNodes(Graph g, EdgeNode node) {
		for (int i = 0; i < g.getAdjList().size(); i++) {
			if (node.getDest().equals(g.getAdjList().get(i).get(0).getStart())) {
				return g.getAdjList().get(i);
			}
		}

		return null;
	}
}
