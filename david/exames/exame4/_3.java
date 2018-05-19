package david.exames.exame4;

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class DaysTest{      
	static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };          
	public static void main(String[] args) {                  
		int index = 0;   
		
//		if(index == 3){                 
//			break;             
//		}else {                  
//			continue;             
//		} 		
		
		for(String day : days){                          
			if(index == 3){                 
				break;             
			}else {                  
				continue;             
			}             
			index++;             
			if(days[index].length()>3){                 
				days[index] = day.substring(0,3);             
			}         
		}         
		System.out.println(days[index]);     
	} 
}