package david.exames.exame4;

public class _17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A{
	  public A() {} // A1
	  public A(String s) {  this();  System.out.println("A :"+s);  }  // A2
	}

	class B extends A{
	  public int B(String s) {  System.out.println("B :"+s);  return 0; } // B1
	}
	class C extends B{
	    private C(){ super(); } // C1
	    public C(String s){  this();  System.out.println("C :"+s);  } // C2
	    public C(int i){} // C3
	}
