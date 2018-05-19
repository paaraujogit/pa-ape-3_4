package david.chap4;

import static java.util.Arrays;			//DOES NOT COMPILE - Trying to use "static imports" to import a class. "static imports" is only to import static members.
import static java.util.Arrays.asList;	
static import java.util.Arrays.*;		//DOES NOT COMPILE - static cannot come before import.

public class BadStaticImports{

	public static void main(String[] args){
	
		Arrays.asList("one");	//DOES NOT COMPILE. - We imported the "asList" method. However, 
	}
}
