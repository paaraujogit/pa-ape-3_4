package david.exames.exame4;

public class _21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface A1 {
	default void hello() {} 
}  

interface B1 extends A1{
	default void hello() {
		//super.hello();    //This is NOT valid.        
		A1.super.hello();    //This is valid.    
	} 
}  

class TestClass implements B1 {
	public void hello() {
		//super.hello();//This is NOT valid.       
		//A.super.hello(); //This is NOT valid because TestClass does not implement A directly.       
		B1.super.hello(); //This is valid.    
	} 

}
