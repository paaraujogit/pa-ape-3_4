package david.chap4;

public class _04_05_OverloadingAndVarargs{

	public void fly(int[] lengths){}
	//public void fly(int... lengths){}	//DOES NOT COMPILE - Java threats Varargs as an Array
	
	public void fly(int numMiles){}
	public void fly(Integer numMiles){}
	
	public void fly(String s) {
		System.out.print("string ");
	}	
	
	public void fly(Object o) {
		System.out.print("object ");
	}	
	
	public static void main(String[] args){
	
		//The most specific parameter list will be called!!
		new _04_05_OverloadingAndVarargs().fly(4);	//calls fly(int numMiles) //primitive first!!		
		new _04_05_OverloadingAndVarargs().fly("test"); //"string "
		new _04_05_OverloadingAndVarargs().fly(56);		//"object "
		
		Plane p = new Plane();
		p.fly(123); // with the fly(int i) commented prints "long " - Java has no problem finding automatically an wieder variable, otherwise you muss convert with an explicitly Cast.  
		p.fly(123L);		
		
		//TooManyConversions.play(4); // DOES NOT COMPILE - int --> Integer --> Long doesn't work in one operation.
		TooManyConversions.play(4L); // calls the Long version
	}
}

class Plane {

	//public void fly(int i) {
	//	System.out.print("int ");
	//}

	public void fly(long l) {
		System.out.print("long ");
	}
}

class TooManyConversions {
	public static void play(Long l) { }
	public static void play(Long... l) { }
	//public static void play(Object o) { } // In //TooManyConversions.play(4), If this line is not commented, just one convertions is needed, and then compiles!! int --> Integer!! (An Integer is an Object!!	
}	

//Rule Example of what will be chosen for glide(1,2)
//--------------------------------------------------------------
//Exact match by type public String glide(int i, int j) {}
//Larger primitive type public String glide(long i, long j) {}
//Autoboxed type public String glide(Integer i, Integer j) {}
//Varargs public String glide(int... nums) {}

