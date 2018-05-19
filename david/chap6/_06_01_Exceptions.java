/*
									--------------------
									| java.lang.Object |
									--------------------
											  ^
											  |
								   -----------------------
								   | java.lang.Throwable |
								   -----------------------																				  
											  ^
											  |
						---------------------------------------------
						|											|
			-----------------------						   -------------------
			| java.lang.Exception |						   | java.lang.Error |
			-----------------------						   -------------------																
						^
						|
						--------------------------------------------- ...												
						|									|
		------------------------------  		--------------------  ...
		| java.lang.RuntimeException |			| CheckedException |
		------------------------------			--------------------


		
		
Type				How to recognize				Okay for Program to catch?		Is Program required to handle or declare?		
------------------------------------------------------------------------------------------------------------------------------
Runtime exception	Subclass of RuntimeException			YES											NO
Checked Exception	Subclass of Exception but not
					of RuntimeException						YES											YES
Error				Subclass of Error						NO											NO


Runtime Exceptions
----------------------------------------------------------------------------------------------------------------------------------------------------------------
ArithmeticException 			-Thrown by the JVM when code attempts to divide by zero
ArrayIndexOutOfBoundsException 	-Thrown by the JVM when code uses an illegal index to access an array
ClassCastException 				-Thrown by the JVM when an attempt is made to cast an exception to a subclass of which it is not an instance
IllegalArgumentException 		-Thrown by the programmer to indicate that a method has been passed an illegal or inappropriate argument.
NullPointerException 			-Thrown by the JVM when there is a null reference where an object is required.
NumberFormatException 			-Thrown by the programmer when an attempt is made to convert a string to a numeric type but the string doesn’t have an appropriate format.

*/

//LEGAL CODE
//thow new Exception
//thow new Exception("Ow! I fell.");
//thow new RuntimeException();
//thow new RuntimeException("Ow! I fell.");
//
//try{
//	fall();
//}finally{
//	System.out.println("all better");
//}

//ILEGAL STATEMENTS
 //try{	//DOES NOT COMPILE
//	fall();
//} finally{
//	System.out.println("all better");
//}catch(Exception e){
//	System.out.println("get up");
//}

package david.chap6;

public class _06_01_Exceptions{

	public static void main(String[] args){
		exceptions();
		
		//Runtime Exceptions
		arithmeticException();
		arrayIndexOutOfBoundsException();
		classCastException();
		illegalArgumentException(-2);
		nullPointerException();
		
		numberFormatException();
		
		//Checked Exceptions
		fileNotFoundException();
		ioException();
		
		
		
	}
	
	public void arithmeticException(){		
		int answer = 11 / 0;	//Exception in thread "main" java.lang.ArithmeticException: / by zero.		
	}
	
	public void arrayIndexOutOfBoundsException(){
		int[] countsOfMoose = new int[3];
		System.out.println(countsOfMoose[-1]);	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1	
	}
	
	public void classCastException(){
		String type = "moose";
		//Integer number = (Integer) type; // DOES NOT COMPILE		
		//
		String type2 = "moose";
		Object obj = type2;
		Integer number = (Integer) obj;	//Exception in thread "main" java.lang.ClassCastException: java.lang.String	cannot be cast to java.lang.Integer	
	}
	
	public void illegalArgumentException(int numberEggs){
		
		//The program throws an exception when it’s not happy with the parameter values.
		if (numberEggs < 0){
			throw new IllegalArgumentException("# eggs must not be negative");
		}			
		numberEggs = numberEggs;		
	}
	
	public void nullPointerException() throws NullPointerException{
		//Exception in thread "main" java.lang.NullPointerException
		String name=null;
		name.length();		
	}
	
	public void numberFormatException(){
		Integer.parseInt("abc");	// Exception in thread "main" java.lang.NumberFormatException: For input string:"abc"		
	}
	
	//CHECKED EXCEPTIONS
	public void fileNotFoundException(){
		//Thrown programmatically when code tries to reference a file that does not exist.
	}
	
	public void ioException(){
		//Thrown programmatically when there’s a problem reading or writing a file.
	}
	

	public String exceptions() {
		String result = "";
		String v = null;

		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}	
	//before catch finally done
}



