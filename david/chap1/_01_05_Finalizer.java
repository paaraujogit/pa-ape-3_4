package david.chap1;

public class _01_05_Finalizer{

	// This method it might not get called and that it definitely won't be called twice
	@Override
	protected void finalize(){
		System.out.println("Calling finalize");		
	}
	
	public static void main(String[] args){
		_01_05_Finalizer f = new _01_05_Finalizer();
	}
}
