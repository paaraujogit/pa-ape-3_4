package david.exames.exame3;

public class _50 {

}

class Discounter {     
	static double percent; //1     
	int offset = 10, base= 50; //2     
	public static double calc(double value) {         
		int coupon, offset, base; //3         

//		coupon = 15;             
//		offset = 20;             
//		base = 10; 		
		
		if(true/*percent <10*/){ //4             
			coupon = 15;             
			offset = 20;             
			base = 10;         
		}         
		return coupon*offset*base*value/100; //5     
		}     
	public static void main(String[] args) {         
		System.out.println(calc(100));     
	} 
	
}

