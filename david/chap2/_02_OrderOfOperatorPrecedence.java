/*
Operator							Symbols and examples
---------------------------------------------------------------------
Post-unary operators				expression++, expression--
Pre-unary operators					++expression, --expression
Other unary operators				~, +, -, !
Multiplication/Division/Modulus		*, /, %
Addition/Subtraction				+, -
Shift operators						<<, >>, >>>
Relational operators				<, >, <=, >=, instanceof
Equal to/ not Equal to/				==, !=
Logical Operators					&, ^, |
Short-circuit logical operators		&&, ||
Ternary Operators					boolean expression ? expression1 : expression2
Assignment operators				=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=

*/

package david.chap2;

public class _02_OrderOfOperatorPrecedence{
	
	public static void main(String[] args){
			
		System.out.println("\nint y = 4; double x = 3 + 2 * --y; <=> x = 3 + 2 * 3; <=> x = 3 + 6; <=> x = 9; x <=> 9.0");	
		System.out.println("\nint int x = 2 * 5 + 3 * 4 - 8; <=> x = 10 + 12 -8; <=> x = 14;");	
		System.out.println("\nint x = 2 * ((5 + 3) * 4 - 8 ); <=> x = 2 * (8 * 4 - 8); <=> x = 2 * (32 - 8); <=> x = 2 * 24; x <=> x = 48;");	

		System.out.println("9 / 3 = "+9/3);
		System.out.println("9 % 3 = "+9%3);
		System.out.println("10 / 3 = "+10/3);
		System.out.println("10 % 3 = "+10%3);
		System.out.println("11 / 3 = "+11/3);
		System.out.println("11 % 3 = "+11%3);
		System.out.println("12 / 3 = "+12/3);
		System.out.println("12 % 3 = "+12%3);
		
		System.out.println("\nint x = 1; long y = 33; <=> x * y; <=> ((long) x) * y = (long)33");	
		System.out.println("\ndouble x = 39.21; float y = 2.1; (compiler Error --> float y = 2.1f");	
		System.out.println("\ndouble x = 39.21; float y = 2.1f; x + y; <=> 39.21 + ((double) 2.1) <=> 41,31"+((double)39.21) + 2.1);	
		System.out.println("\nshort x = 10; short y = 3; <=> x/y; <=> ((int) 10 + (int) 3; <=> (int) 13");	
		System.out.println("\nshort x = 14; float y = 13; double z = 30; <=> x * y / z; <=> ((int)14) * y / z ; <=> ((float) 14) * 13 / z <=> 182 / z <=> ((double) 182) / 30 <=> 6.06..67");	
		System.out.println("\nlong x = 10; int y = 5; y = y * x => Compiler Error(cannot convert from long to int); || y*= x; => Compiles");		
		
		long x = 5; long y = (x=3);
		System.out.println("\nlong x = 5; long y = (x=3); x = "+(x=3)+" y = "+y);				
		
		x= 3;
		y = ++x * 5 / x-- + --x;
		System.out.println("\nint y = 4 * 5 / x-- + --x <=> y="+y+"; x="+x+";");		

		System.out.println("2147483647+1 <=>"+ 2147483647+1);

		//Relational Operators
		int a = 6;
		boolean b = (a >= 6) || (++x <= 7);
		System.out.println("\nint a = 6; boolean b = (a >= 6 || (++x <= 7) <=> a=="+a+" (the 2nd expression of the Logical Operators was never evaluated)");		
		
		//Ternary Operator
		//System.out.println("\n(y > 5) ? 21 : \"Zebra\" = "(y > 5) ? 21 : "Zebra");	//DOESNT COMPILE!!!
		System.out.println("\nint animal = (y > 5) ? 21 : \"Zebra\" => COMPILE ERROR");
		//int/String h = (y > 5) ? 21 : "Zebra";
		
		
		//Switch -- boolean/Boolean long/Long don't compiling in Case Statement
		//Case Statement must be a literal. Just Constants are evaluated to compile
		System.out.println("Switch: dayOfWeek=5; case 0: Sunday; default: Weekday; case 6: Saturday; break; -->");
		int dayOfWeek = 5;
		switch(dayOfWeek){
			case 0:
				System.out.println("Sunday");
			default:
				System.out.println("Weekday");
			case 6:
				System.out.println("Saturday");
				break;		
		}		
				
		//for - Classic
		//int c = 0;
		//for(long d=0, x = 41; x < 5 && y < 10; x++, y++){}	//DOES NOT COMPILE - Is trying redeclaring a variable in the initialization Block
		
		//int c = 0;
		//int d = 10;
		//for(c=0, d = 41; c < 5 && d < 10; c++, d++){}	//COMPILES
		

		//for(long c=0, int d = 41; c < 5 && d < 10; c++, d++){}	//DOESNOT COMPILE - All variables ion the initialization Block should have the same Type
		
	}
}

