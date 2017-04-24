
public enum lineColor {
	RED("R"), GREEN("G"), BLUE("B");
	
	private String theColor;
	
	private lineColor(String s) {
		theColor = s;
	}
	
	public String getColor() {
		return theColor;
	}
}
