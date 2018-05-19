package david.exames.exame1;

public class _22 {

	public static void main(String[] args) {

		Sub s = new Sub(); 
		int k = s.i; //assigns 20 to k.  
		
		System.out.println("Sub s = new Sub();  || s.i: "+k+" s.j: "+s.j);
		
		k = ((Base)s).i;//assigns 10 to k. The cast is used to show the Base's i.  
		Base b = new Sub(); 
		k = b.i;//assigns 10 to k because which field is accessed depends on the class of the variable and not on the class of the actual object. Same rule applies to static methods but the opposite is true for instance methods.
		
		
		
		System.out.println("Base b = new Sub(); || b.i: "+k);					
	}

}


class Base{
	final int i=10; 
	int j=2;
} 

class Sub extends Base{
	int i=20; //This i hides Base's i.    	
} 


