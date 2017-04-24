import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Graph {
	ArrayList<ArrayList<EdgeNode>> adjList;
	ArrayList<EdgeNode> edges;
	ArrayList<String> nodes;
	int nVertices;
	int nEdges;

	public void initialize() {
		adjList = new ArrayList<>();
		edges = new ArrayList<>();
		nodes = new ArrayList<>();
		fileInput();

	}

	public void fileInput() {
		BufferedReader br = null;
		FileReader fr = null;
		String str;

		try {
			fr = new FileReader("transit.txt");
			br = new BufferedReader(fr);		
			str = br.readLine();

			String[] split = str.split(" ");
			this.nVertices = Integer.parseInt(split[0]);
			this.nEdges = Integer.parseInt(split[1]);
			
			for (int i = 1; i <= nEdges; i++) {
				str = br.readLine();
				split = str.split(" ");
				edges.add(new EdgeNode(split[0], split [1], split [2], split[3]));
				edges.add(new EdgeNode(split[1], split [0], split [2], split[3]));
				if (!nodes.contains(split[0])) {
					nodes.add(split[0]);
				}
			}
			
/*			for (EdgeNode node : edges) {
				System.out.println(node.toString());
			}
	*/		
			
			nodes.add("j");
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file");                
		}
		catch(IOException ex) {
			System.out.println("Error reading file");                  
		}
		
		generateAdjList();
	}

	public void generateAdjList() {
		ArrayList<ArrayList<EdgeNode>> list = new ArrayList<>();
		ArrayList<EdgeNode> copy = new ArrayList<>();
		copy = (ArrayList<EdgeNode>) edges.clone();
		ArrayList<EdgeNode> temp;

		while (!copy.isEmpty()) {
			temp = new ArrayList<>();
			temp.add(copy.get(0));
			for (Iterator<EdgeNode> iterator = copy.iterator(); iterator.hasNext();){
				EdgeNode hold = iterator.next();
				
				if (!temp.contains(hold) && hold.getStart().equals(temp.get(0).getStart())) {
					temp.add(hold);
					//System.out.println("Adding " + hold);		
					iterator.remove();
				}
			}
			list.add(temp);	
			copy.remove(0);
		}	
		this.adjList = list;
		
/*				
		for (ArrayList<EdgeNode> arr : this.adjList) {
			System.out.println(arr);
		}

		System.out.println(list.size());
		*/
		 
	}

	public ArrayList<String> getNodes() {
		return nodes;
	}
	
	public ArrayList<EdgeNode> getEdges() {
		return edges;
	}
	
	public ArrayList<ArrayList<EdgeNode>> getAdjList() {
		return adjList;
	}
}


