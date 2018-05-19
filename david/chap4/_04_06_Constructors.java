package david.chap4;

public class _04_06_Constructors {
	private String color;
	private int height;
	private int length;

	public _04_06_Constructors(int length, int theHeight) {
		length = this.length; // backwards – no good!
		height = theHeight; // fine because a different name. height is the instance variable.
		this.color = "white"; // fine, but redundant
	}

	public static void main(String[] args) {
		_04_06_Constructors b = new _04_06_Constructors(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	} 
}