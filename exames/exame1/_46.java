package david.exames.exame1;

public class _46 {

	public static void main(String[] args) {
		
		
		//Members of Boolean
		boolean b1 = Boolean.parseBoolean("false");	//returns a primitive
		Boolean B2 = Boolean.valueOf(false);		//returns a object Boolean
		Boolean b = Boolean.FALSE;
		
		Boolean b2 = new Boolean("True");// produces a Boolean object that represents true. 
		Boolean b3 = new Boolean("yes");// produces a Boolean object that represents false.
		
		System.out.println("b2: "+b2+" || b3: "+b3);

		//if exactly one of the operands is a Boolean wrapper, it is first unboxed into a boolean primitive 
		//and then the two are compared. If both are Boolean wrappers, then their references are compared just 
		//like in the case of other objects. Thus, new Boolean("true") == new Boolean("true") is false, 
		//but new Boolean("true") == Boolean.parseBoolean("true") is true.
		
		System.out.println(new Boolean("true")==new Boolean("true"));		  //false
		System.out.println(new Boolean("true")==Boolean.parseBoolean("true"));//true
		
		
	}

}
