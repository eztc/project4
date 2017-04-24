
public class Indicator {
	private String letter;
	private String parent;
	
	public Indicator() {
		this.letter = "";
		this.parent = "";
	}
	
	public Indicator(String letter, String parent) {
		this.letter = letter;
		this.parent = parent;
	}
	
	public String getLetter() {
		return this.letter;
	}
	
	public String getParent() {
		return this.parent;
	}
	
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public void setParent(String parent) {
		this.parent = parent;
	}
}
