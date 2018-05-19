/*
Keyword   |			Type	   			|							Range								|		Example
----------------------------------------------------------------------------------------------------------------------------------
boolean		true or false					  true	<------------------------------->  false					  true
byte		 8-bit integral value			  -128	<---------------2^8------------->	127						  123
short		16-bit integral value			  -32.768 <-------------2^16------------>	32.767					  123
int			32-bit integral value			  2.147.483.648 <-------2^32-------> -2.147.483.647					  123
long		64-bit integral value		9.223.372.036.854.775.808<--2^64--> -9.223.372.036.854.775.807			  123L
float		32-bit floating-point value 																		  123.45f
double		64-bit floating-point value																			  123.456
char		16-bit Unicode value																				  'a'
*/
package david.chap1;

public class _01_02_Types{
	
	public static void main(String[] args){
		
		System.out.println("\n Boolean\n Values: "+Boolean.TRUE+"/"+Boolean.FALSE);
		//System.out.println("\n Max: "+Boolean.FALSE);
		System.out.println("\n Byte(8-bit integral value) \n Min: "+Byte.MIN_VALUE);
		System.out.println(" Max: "+Byte.MAX_VALUE);
		System.out.println("\n Short(16-bit integral value)\n Min: "+Short.MIN_VALUE);
		System.out.println(" Max: "+Short.MAX_VALUE);
		System.out.println("\n Character(16-bit Unicode value)\n Min: "+Character.MIN_VALUE);
		System.out.println(" Max: "+Character.MAX_VALUE);			
		System.out.println("\n Integer(32-bit integral value)\n Min: "+Integer.MIN_VALUE);
		System.out.println(" Max: "+Integer.MAX_VALUE);
		System.out.println("\n Long(64-bit integral value)\n Min: "+Long.MIN_VALUE);
		System.out.println(" Max: "+Long.MAX_VALUE);
		System.out.println("\n Float(32-bit floating-point value)\n Min: "+Float.MIN_VALUE);
		System.out.println(" Max: "+Double.MAX_VALUE);
		System.out.println("\n Double(64-bit floating-point value)\n Min: "+Float.MAX_VALUE);
		System.out.println(" Max: "+Double.MAX_VALUE);	
		
		System.out.println("\n\nNumeric Bases");
		System.out.println("\nDecimal (56)  : "+56);		//56
		System.out.println("Binary      (0b11): "+0b11);	// 3
		System.out.println("Octal       (017) : "+017);	//15
		System.out.println("Hexadecimal (0x1F): "+0x1F);	//31
				
		System.out.println("\nJava 7 - 1_000_000");
		System.out.println("million 1_000_000 (Java 7)			: "+1_000_000);
		System.out.println("AnnoyingButLegal 1_00_0.0_0 (Java 7): "+1_00_0.0_0);
		
	}
}