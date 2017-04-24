
public class EdgeNode implements Comparable<EdgeNode>{
	private String destination;
	private lineColor color;
	private lineType type;
	private String start;
	private int dist;
	private EdgeNode parent;
	
	public EdgeNode() {
		
	}
	
	public EdgeNode(String start, String dest, String color, String type) {
		setStart(start);
		setDestination(dest);
		setColor(color);
		setType(type);
	}
	
	public EdgeNode getParent() {
		return this.parent;
	}
	
	public void setParent(EdgeNode parent) {
		this.parent = parent;
	}
	
	public int getDist() {
		return this.dist;
	}
	
	public void setDist(int dist) {
		this.dist = dist;
	}
	
	public String getStart() {
		return this.start;
	}
	
	public String getDest() {
		return this.destination;
	}
	
	public lineColor getColor() {
		return this.color;
	}
	
	public lineType getType() {
		return this.type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public void setDestination(String dest) {
		this.destination = dest;
	}
	
	public void setColor(String color) {
		switch(color) {
		case("R"):
			this.color = lineColor.RED;
		break;
		case("G"):
			this.color = lineColor.GREEN;
		break;
		case("B"):
			this.color = lineColor.BLUE;
		break;
		}
	}
	
	public void setType(String type) {
		switch(type) {
		case("H"):
			this.type = lineType.HORSE;
		break;
		case("C"):
			this.type = lineType.CABLE;
		break;
		case("T"):
			this.type = lineType.TROLLEY;
		break;
		case("B"):
			this.type = lineType.BUS;
		break;
		}
	}
	
	public String toString() {
		return start + " " + destination + " " + color + " " + type;
	}
	
	public int compareTo(EdgeNode other) {
		return this.getStart().compareTo(other.getStart());
	}
}
