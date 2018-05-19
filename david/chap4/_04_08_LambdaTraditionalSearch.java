package david.chap4;

import java.util.*;
import java.util.funtion.*; //To use Predicate<T>

//public interface Predicate<T>{
//	boolean test(T t);
//}

class Animal{
	
	private String species;
	private boolean canHop;  //pode pular.
	private boolean canSwim;
	
	public _04_08_LambdaAnimal(String species, boolean hopper, boolean swimmer){
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop(){ return canHop; }
	public boolean canSwim(){ return canSwim; }	
	
	public String toString(){ return species; }	
}


//Trait - Traços / Caracteristica.
/*public*/ interface CheckTrait {
	boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
	
	public boolean test(Animal a) {
		return a.canHop();
	}
}


public class _04_08_LambdaTraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, new CheckIfHopper()); // pass class that does check
		
		//Or using Lambdas
		//
		//This code uses a concept called deferred execution. Deferred execution
		//means that code is specifed now but will run later. In this case, later is when the print()
		//method calls it.
		//
		//This means that Java should call a method with an Animal parameter that returns a
		//boolean value that’s the result of a.canHop().
		print(animals, a-> a.canHop());
		print(animals, a-> a.canSwim());
		
		//The syntax of lambdas is tricky because many parts are optional. These two lines do the
		//exact same thing.
		a -> a.canHop();
		(Animal a) -> { return a.canHop(); };
		
		//a -> a.canHop();
		//Let’s look at what is going on here. The first example, shown in Figure 4.5, has
		//three parts:
		//-->Specify a single parameter with the name a
		//-->The arrow operator to separate the parameter and body
		//-->A body that calls a single method and returns the result of that method
		
		//VALID LAMBDAS
		print(()-> true);									//0 parameters
		print(a-> a.startsWith("test"));					//1 parameter
		print((String a) -> a.startsWith("test"));			//1 parameter
		print((a, b) -> a.startsWith("test"));				//2 parameters
		print((String a, String b) -> a.startsWith("test"));//2 parameters
		
		//INVALID LAMBDAS
		print(a, b -> a.startsWith("test"));				//DOES NOT COMPILE
		print(a -> {a.startsWith("test"); });				//DOES NOT COMPILE
		print(a -> {return a.startsWith("test") });			//DOES NOT COMPILE
		(a, b) -> { int a = 0; return 5;} 					//DOES NOT COMPILE
		
		//Using Predicate
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		print(animals, a->a.canHop());
		
		//(ArrayList a).removeIf() takes a predicate
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);	//[long ear, floppy, hoppy]
		bunnies.removeIf(s->s.charAt(0) != 'h');
		System.out.println(bunnies);	//[hoppy]
		
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
	
	//import java.util.funtion.*; //To use Predicate<T>
	//import java.util.*;
	//public interface Predicate<T>{
	//	boolean test(T t);
	//}	
	
	private static void print(List<Animal> animals, Predicate<Animal> checker){
		for(Animal animals : animals){
			if(checker.test(animal)){
				System.out.print(animal + " ");
			}
			System.out.println();
		}
	}
	
	
}






