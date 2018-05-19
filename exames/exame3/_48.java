package david.exames.exame3;

public class _48 {

	public static void main(String[] args) {
		Sub.main(args);
	}
}

class Base{
   void methodA(){
      System.out.println("base - MethodA");
   }
}

class Sub extends Base{
   public void methodA(){
      System.out.println("sub - MethodA");
   }
   public void methodB(){
      System.out.println("sub - MethodB");
   }
   
   public static void main(String args[]){
      Base b=new Sub(); //1
      b.methodA(); //2
      b.methodB(); //3
   }
}