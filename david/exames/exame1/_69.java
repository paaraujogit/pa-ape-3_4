package david.exames.exame1;

public class _69 {

	public static void main(String[] args) {

		Integer i1=1;
		Integer i2=new Integer(1);
		int i3=1;
		Byte b1=1;
		Long g1=1L;
		
		System.out.println("i1==i2 :"+(i1==i2)+"");
		//will return true because one operand is a primitive int and so the other will be unboxed and then the value will be compared.
		System.out.println("i1==i3 :"+(i1==i3)+""); 
		//System.out.println("i1==b1 :"+(i1==b1)+"");	//Doesn't compile because of diferent Types of diferent hierarchies!
		System.out.println("i1.equals(i2) :"+(i1.equals(i2))+"");
		//will return false because they are pointing to objects of different types.
		System.out.println("i1.equals(g1) :"+(i1.equals(g1))+"");		
		System.out.println("i1.equals(b1) :"+(i1.equals(b1))+"");

	}

}
