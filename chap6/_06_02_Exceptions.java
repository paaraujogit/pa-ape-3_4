package david.chap6;

public class _06_02_Exceptions{

	//If one of the static initializers throws an exception, Java can’t start using the class. 
	//It declares defeat by throwing an ExceptionInInitializerError.
	static {
		int[] countsOfMoose = new int[3];
		int num = countsOfMoose[-1];	//java.lang.ArrayIndexOutOfBoundsException: -1
	}	


	public static void main(String[] args){
		
		//_06_02_Exceptions instance = null;
		
		stackOverflowError();
		noClassDefFoundError(); //Don't come in the Exam - occurs when Java can’t find the class at runtime.
	}
	
	static void stackOverflowError(){
		stackOverflowError();
		//It is better than an infi nite loop because at least Java will catch it and throw the error. 
		//With an infi nite loop, Java just uses all your CPU until you can kill it.		
	}
	
	static void noClassDefFoundError(){
		
	}	
	
	
}