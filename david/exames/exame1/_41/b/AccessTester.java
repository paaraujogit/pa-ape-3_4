package david.exames.exame1._41.b;

import david.exames.exame1._41.a.AccessTest;


public class AccessTester extends AccessTest {

	public static void main(String[] args) {
		
		AccessTest ref = new AccessTest();
		
		ref.c();				//c() is protected and can only be accessed in the Sublass through a instance of the Subclass!! :) 
		new AccessTester().c();
		
	}

}
