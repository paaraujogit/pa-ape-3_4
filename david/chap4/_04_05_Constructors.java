package david.chap4;

public class _04_05_Constructors{

	private String color;
	private int weight;
	
	public _04_05_Constructors(int weight, String color){ // second constructor
		
		int i;
		
		//i++; 	In Local No-Initialized Variables we get a compiler error when we try to use the variable
		
		this.weight = weight;
		this.color = color;		
	}
	
	public _04_05_Constructors(int weight){ 	// first constructor
		//this(weight, "brown");
		_04_05_Constructors(weight, "brown");	// DOES NOT COMPILE -it should be called with this(...,...)
	}	
	
	public _04_05_Constructors(){ 	// first constructor	
		new _04_05_Constructors(14, "brown");// Compiles but does not do what we want. It constructs a new Object and ignores the new Object.
	}		
}

class MouseHouse{
	
	private final int volume;	//In Instance No-Initialized Variables we get a compiler error in the variable declaration.
	private final String name = "The Mouse Hause";
	
	public MouseHause(int length, int width, int height){
		volume = length * width * height;	//Inicializing a final variable in the constructor is OK, as the constructor is part of the inicialization process. After the constructor runs all final instance variables must have been set.
	}
}
