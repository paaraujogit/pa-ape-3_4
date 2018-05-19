package david.chap4.reviewQuestions;

public class _13 {

	public static void main(String[] args) {
		new RopeSwing();

	}

}


class RopeSwing {
	//static instance variables must be initialized in the declaration or once in a static block. 
   private static final String leftRope;
   private static final String rightRope;
	//when a variable is not initialized in the right place, we have compilation error in the declaration 
	//and where is tryied to be initialized.	
   private static final String bench;
   private static final String name = "name";
   static {
	   leftRope = "left";
	   rightRope = "right";
   }
   static {
	   name = "name";
	   rightRope = "right";
   }
   public static void main(String[] args) {
	   bench = "bench";
   }
}