package david.chap5;

public class _05_01_OverridingVsHiding{

	public static void main(String[] args){
		
		System.out.println("SuperClass.(static)isBiped()--> false; || SubClass.(static)isBiped()--> true;");
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();	
		
		System.out.println("\n");

		System.out.println("SuperClass.isBiped()--> false; || SubClass.isBiped()--> true;");		
		Kangaroo2 joey2 = new Kangaroo2();
		joey2.getMarsupialDescription();
		joey2.getKangarooDescription();			
		
		Marsupial2 superReference = joey2;
		System.out.println("superReference.a = "+superReference.a);
		System.out.println("subReference.a = "+joey2.a);
	}
}

class Marsupial {

	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
	}
}

class Kangaroo extends Marsupial {

	public static boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "+isBiped());
	}
}

class Marsupial2 {

	int a=0;
	
	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
	}
}

class Kangaroo2 extends Marsupial2 {

	int a=1;
	public boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "+isBiped());
	}
}
