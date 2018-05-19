package david.chap4;

import java.util.ArrayList;

public class _04_02_Static{

	public static void main(String[] args){	//static method
		Koala.main(args);
	}
}

class Koala{

	public static int count = 0;			//static variable	
	private String name = "Static class";	
	public void third() { System.out.println(name); }	
	
	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		//We just got through saying that final variables aren’t allowed to
		//be reassigned. The key here is that the static initializer is the first assignment.
		//And since it occurs up front, it is okay.		
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}		
	
	public static void main(String[] args){	//static method

		System.out.println(count);
		//There is one rule that is trickier. You can use an instance of the object to call a static method.
		Koala k = new Koala();
		System.out.println(k.count); // k is a Koala
		k = null;
		System.out.println(k.count); // k is still a Koala		
		
		//A static member cannot call an instance member.		
		//third(); // DOES NOT COMPILE		
	}			
}


//LEGAL!! :)
//public class _04_02_StaticTester{
//	public static void main(String[] args){	//main can be called as other static member!! :)
//		_04_02_Static.main(new String[0]);	//call static method
//	}
//}


class Gorilla {
	public static int count;
	public static void addGorilla() { count++; }
	public void babyGorilla() { count++; }
	public void announceBabies() { //fine because an instance method can call a static method.
 		addGorilla();
		babyGorilla();
	}

	public static void announceBabiesToEveryone() {
		addGorilla();
		//babyGorilla(); // DOES NOT COMPILE
	}
	//public int total;
	//public static int average = total / count; // DOES NOT COMPILE (Change total to static)
	
}

//A common use for static variables is counting the number of instances
class Counter {
	private static int count;
	public Counter() { count++; }

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(count); // 3
	}
}

//Constants
class Initializers {
	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>();
	public static void main(String[] args) {
		//NUM_BUCKETS = 5; // DOES NOT COMPILE
		values.add("changed"); //COMPILES
	} 
}

//There is a common case to use a static initializer: when you need to initialize a static field and the 
//code to do so requires more than one line. This often occurs when you want to initialize a collection like 
//an ArrayList. When you do need to use a static initializer, put all the static initialization in the same 
//block. That way, the order is obvious.
class StaticInitializer{
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	//private static final int four; // DOES NOT COMPILE - The Compiler sees that the constant is not initialized!!

	static {
		one = 1;
		two = 2;
		//three = 3; // DOES NOT COMPILE
		//two = 4; // DOES NOT COMPILE
	}	

}