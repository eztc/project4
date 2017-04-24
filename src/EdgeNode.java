
public class EdgeNode {
	private String destination;
	private lineColor color;
	private lineType type;
	private String start;
	
	public EdgeNode() {
		
	}
	
	public EdgeNode(String start, String dest, String color, String type) {
		setStart(start);
		setDestination(dest);
		setColor(color);
		setType(type);
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
}
