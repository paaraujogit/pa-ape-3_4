package david.chap5;

import java.io.FileNotFoundException;

public class _05_00_ClassDesignRules {}

//Overriding - Rules
//
// 1 - The method in the child class must have the same signature as the method in the parent class.
// 2 - The method in the child class must be at least as accessible or more accessible than the method in the parent class.
// 3 - The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
// 4 - If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.

class SuperClass{
	protected Number method1(int i) throws Exception{
		return i;
	}
}

class SubClass extends SuperClass{
	protected Integer method1(int i) throws FileNotFoundException, RuntimeException{
		return i;
	}	
}


//Hiding Static Methods - Rules
//
// 1 - The method in the child class must have the same signature as the method in the parent class.
// 2 - The method in the child class must be at least as accessible or more accessible than the method in the parent class.
// 3 - The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
// 4 - If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
// 5 - The method defined in the child class must be marked as static if it is marked as static if it is marked as static in the parent class (method hiding). 
//	   Likewise, the method must not be marked as static in the child class if it is not marked as static in the parent class (method overriding).

class SuperClass1{
	protected static Number method1(int i) throws Exception{
		return i;
	}
}

class SubClass1 extends SuperClass1{
	protected static Integer method1(int i) throws FileNotFoundException, RuntimeException{
		return i;
	}	
}