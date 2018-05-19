package david.exames.exame1;

public class _35 {

	public static void main(String[] args) {

		StringBuilder b1 = new StringBuilder("snorkler");
		StringBuilder b2 = new StringBuilder("yoodler");
		
		b1.append(b2.substring(2, 5).toUpperCase());
		System.out.println("b1: "+b1+" || b2: "+b2);
		
		b1 = new StringBuilder("snorkler");
		b2 = new StringBuilder("yoodler");
		
		b2.insert(3, b1.append("a"));
		System.out.println("b1: "+b1+" || b2: "+b2);
		
		b1 = new StringBuilder("snorkler");
		b2 = new StringBuilder("yoodler");

		b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
		System.out.println("b1: "+b1+" || b2: "+b2);
		
		
	}

}
