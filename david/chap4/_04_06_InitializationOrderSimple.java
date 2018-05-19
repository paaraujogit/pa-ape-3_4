package david.chap4;

//1. If there is a superclass, initialize it first.
//2. Static variable declarations and static initializers in the order they appear in the file.
//3. Instance variable declarations and instance initializers in the order they appear in the file.
//4. The constructor.

public class _04_06_InitializationOrderSimple{

	private String name = "Torchie";
	{ System.out.println(name); }
	static { System.out.println("COUNT"+COUNT); }	
	private static int COUNT = 0;
	static { System.out.println("COUNT"+COUNT); }
	static { COUNT += 10; System.out.println(COUNT); }
	
	public _04_06_InitializationOrderSimple() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		_04_06_InitializationOrderSimple init = new _04_06_InitializationOrderSimple();
	}
	
}


class YetMoreInitializationOrder{
	
	static { add(2); }
	static void add(int num) { System.out.print(num + " "); }
	YetMoreInitializationOrder() { add(5); }
	static { add(4); }
	{ add(6); }
	static { new YetMoreInitializationOrder(); }
	{ add(8); }
	
}