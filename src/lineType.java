
public enum lineType {
	HORSE("H"), CABLE("C"), TROLLEY("T"), BUS("B");
	
	private String theType;
	
	private lineType(String s) {
		theType = s;
	}
	
	public String getType() {
		return theType;
	}
}
