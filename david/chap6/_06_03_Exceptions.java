package david.chap6;

public class _06_03_Exceptions{
	
	public static void main(String[] args){
		new _06_03_Exceptions().bad();
		
		try{
			new _06_03_Exceptions().good();
		} catch (NoMoreCarrotsException e ) {
			System.out.print("sad rabbit");			
		}
	}
	
	public void bad() {
	
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
			System.out.print("sad rabbit");
		}
	}
	
	public void good() throws NoMoreCarrotsException {
		eatCarrot();
	}
	
	private static void eatCarrot() { }	

}

class NoMoreCarrotsException extends Exception{
	
}