package david.chap3;

public class _03_02_Equality{
	
	public static void main(String[] args){

		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		System.out.println("StringBuilder one = new StringBuilder(); StringBuilder two = new StringBuilder(); one == two: "+(one == two));	//false
		StringBuilder three = one.append("a");
		System.out.println("StringBuilder three = one.append(\"a\"); || one == two : "+(one == two)); //false
		System.out.println("one == three("+three+") : "+(one == three)); //true
		
		//String Equality
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); //true  - String are pooled
		
		//The two Strings differ with a space.
		String w = "Hello World";
		String z = " Hello World".trim();
		System.out.println("String w = \"Hello World\"; || String z = \" Hello World\".trim(); || (w == z): "+(w == z)); //false - Since it isn't the same String in Compilation Time, a new String is created.
		
		
		//String Creation with/out new Keyword
		String a = new String("Hello World");
		String b = "Hello World";
		System.out.println("String a = new String(\"Hello World\"); String b = \"Hello World\"; a == b: "+a == b); //false - Since you have specifically requested a different object, the pooled value isn't shared.
		
		//Strings equality with .equals()
		System.out.println("String w.equals(z):"+w.equals(z)); //false - Since you have specifically requested a different object, the pooled value isn't shared.
		
		//.equals is not implemented in StringBuilder class	
	}	
}