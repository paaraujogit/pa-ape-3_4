package david.exames.exame1;

public class _23 {

	public static void main(String[] args) {
		
		int i=10;
		float f = 10.0f;
		
		//1. Only String, byte, char, short, int, and enum values can be used as types of a switch variable.
		//   Wrapper classes Byte, Character, Short, and Integer are allowed as well.
		//2. The case constants must be assignable to the switch variable. For example, if your switch variable 
		//	 is of class String, your case labels must use Strings as well.
		//3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable 
		//	 is of type char, then none of the case constants can be greater than 65535 because a char's range is from 
		//	 0 to 65535.
		//the following will not compile because 300 cannot be assigned to 'by', which can only 
		//hold values from -128 to 127.		
		byte by = 10; 
		switch(by){
			case 200://some code; ����
			case 300://some code; 		
		}
		
		//4.��All case labels should be COMPILE TIME CONSTANTS.  
		//5. No two of the case constant expressions associated with a switch statement may have the same value.  
		//6. At most one default label may be associated with the same switch statement.		
		
		switch(i){
			case 10:
				//break;		
				continue;
		};
		
//		switch(f) {
//		case 10.0:
//			break;
//		}
		
		Integer x = 1;// int x = 1; is valid. 
		switch(x){
			case 'a' : System.out.println("a"); 
		}	
		
		char ch = 'x'; 
		switch(ch){ 
			case -1 :System.out.println("-1");	//with case 1 would be compile. 
					break; // This will not compile : "possible loss of precision" ����������
			default:System.out.println("default");
		}
	}
}
