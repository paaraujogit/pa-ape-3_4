package david.chap1.assessment;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
	protected int getTailLength() {return 4;}	//The visibility cannot stricter as the method it overrides.
}
public class Cougar extends Puma {				//The compiler Error oben in the hierarquie is propagated down!!

public static void main(String[] args) {
	Puma puma = new Puma();						//The propagation goes  where the class is used!!
	System.out.println(puma.getTailLength());
}

public int getTailLength(int length) {return 2;}
}