package david.chap4;

/** 
* Immutable class, because we cannot change the Objects after the initialization.
* In this case we eliminate the Setters. 
*
*/
public class _04_07_ImmutableSwan{

	private int numberEggs;
	
	public ImmutableSwan(int numberEggs){
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs(){
		return numberEggs;
	}		
	
	
	public void static void main(String[] args){

		//Using NotImmutable
		StringBuilder sb = new StringBuilder("initial");
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());	
	}
}


class NotImmutable{
	
	private StringBuilder builder;
	public NotImmutable(StringBuilder b){
		builder = b;
	}
	
	public StringBuilder getBuilder(){
		return builder;
	}
	
	//The problem is resolved creating a new object
	public Mutable(StringBuilder b) {
		builder = new StringBuilder(b);
	}	
	
	//Another approach for the getter is to return an immutable object:
	public String mutableAnotherApproach() {
		return builder.toString();
	}	
}

