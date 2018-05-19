package david.chap4;

public class _04_01_VarArgs{

	public static void walk(int start, int... nums){
	
		System.out.println(nums.length); // walk(1, null); => throws a NullPointerException.
	}


	public static void main(String[] args){
		walk(1, new int[]{4, 5});	//2
		//walk(1, null); // throws a NullPointerException //throws an exception because it tries to determine the length of null.
		
		
	}

}