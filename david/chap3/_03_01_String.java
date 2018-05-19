package david.chap3;
public class _03_01_String{
	
	public static void main(String[] args){
		
		//String Creation
		String name = "Fluffy";
		//String name = new String("Fluffy");	//Less efficient. The JVM muss create a Object instead using an existing one from the "String Poll"
		
		//length
		String string = "animals";
		System.out.println("animals (length): "+string.length());	// 7		
		
		//charAt()
		System.out.println("string.charAt(0): "+string.charAt(0));	// a
		System.out.println("string.charAt(6): "+string.charAt(6));	// s
		//System.out.println(string.charAt(7));	// throws exception //java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		
		//indexOf()
		//
		//int indexOf(int ch)
		//int indexOf(char ch, int fromIndex)
		//int indexOf(String str)
		//int indexOf(String str, index fromIndex)
		System.out.println("string.indexOf('a'): "+string.indexOf('a'));		// 0
		System.out.println("string.indexOf(\"al\"): "+string.indexOf("al"));		// 4
		System.out.println("string.indexOf('a', 4): "+string.indexOf('a', 4));		// 4
		System.out.println("string.indexOf(\"a\", 5): "+string.indexOf("a", 5));		// -1	//The character 'a' doesn't exist from position 5
		
		
		//substring()
		//
		//String substring(int beginIndex)
		//String substring(int beginIndex, int endIndex())

		System.out.println("string.substring(3): "+string.substring(3));	//mals
		System.out.println("string.substring(string.indexOf('m')): "+string.substring(string.indexOf('m')));	//mals
		System.out.println("string.substring(3, 4): "+string.substring(3, 4));	//m
		System.out.println("string.substring(3, 7): "+string.substring(3, 7));	//mals
				
		//toLowerCase() and toUpperCase()
		//
		//String toLowerCase()
		//String to UpperCase()
		System.out.println("string.toLowerCase(): "+string.toLowerCase()+" and toUpperCase(): "+string.toUpperCase());
		
		
		//equals() and equalsIgnoreCase()
		//
		//boolean equals(Object obj)
		//boolean equalsIgnoreCase(String str)
		
		
		//startsWith() and endsWith()
		//boolean startsWith(String prefix)
		//boolean endsWith(String suffix)
		System.out.println("'abc'.startsWith('a')"+"abc".startsWith("a")); //true
		System.out.println("'abc'.startsWith('A')"+"abc".startsWith("A"));	//false
		System.out.println("'abc'.endsWith('c')"+"abc".endsWith("c"));	//true
		System.out.println("'abc'.endsWith('a')"+"abc".endsWith("a"));	//false
		
		//contains()
		//
		//boolean contains(String str)
		System.out.println("\"abc\".contains(\"b\")"+"abc".contains("b"));	//true
		System.out.println("\"abc\".contains(\"B\")"+"abc".contains("B"));	//false
		
		//replace()
		//
		//String replace(char oldChar, char newChar)		
		System.out.println("'abcabc'.replace('a', 'A')"+"abcabc".replace('a', 'A'));	//AbcAbc
		//String replace(CharSequence oldChar, CharSequence newChar) //CharSequence is a Super Interface from String and StringBuilder
		System.out.println("\"abcabc\".replace(\"a\", \"A\")"+"abcabc".replace("a", "A"));	//AbcAbc
		
		//trim()
		//
		//public String trim()
		System.out.println("\"abc\".trim()"+"abc".trim());	//AbcAbc
		System.out.println("\\t		a b c\\n\".trim()"+"\t	a b c\n".trim());	//AbcAbc
		
		
		//Method Chaining
		//
		String a = "abc";
		//a.reverse();				//Method from StringBuilder!!
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C','3');
		System.out.println("String a = \"abc\"; String b = a.toUpperCase(); b = b.replace(\"B\", \"2\").replace('C','3'): "+b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		//Using the StringBuilder Class
		//
		//How many Objects creates the following code?
		//
		String alpha = "";		// 1 Object created
		for(char current = 'a'; current <= 'z'; current++){
			alpha += current;	// 26 Object created			
		}
		System.out.println(alpha);
		
		
		//With StringBuilder
		StringBuilder alpha2 = new StringBuilder(); //1 Object is created and no more.
		for(char current = 'a'; current <= 'z'; current++){
			alpha2.append(current);
		}
		System.out.println(alpha2);
		
		
		//Mutability and Chaining
		//
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");							//sb = "start+middle"
		StringBuilder same = sb.append("+end");			// "start+middle+end"
		
		//String Builder - Constructors
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);		//The size can increases without exceptions, depending of the needs.
		
		//StringBuilder default capacity - 16bits
		StringBuilder sb4 = new StringBuilder("animals");
		String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));	//substring returns a String
		int len = sb4.length();
		char ch = sb4.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		
		//StringBuilder - append()  //there are more than 10 method signatures
		StringBuilder sbc = new StringBuilder().append(1).append('c').append(true);
		System.out.println("StringBuilder sbc = new StringBuilder().append(1).append('c').append(true); sbc = "+sbc);
		
		//StringBuilder - insert()	//there are lots of method signatures. One is:
		//StringBuilder insert(int offset, String str)
		StringBuilder sbcd = new StringBuilder("animals");
		sbcd.insert(7, "-");		//sbcd = animals-
		sbcd.insert(0, "-");		//sbcd = -animals-
		sbcd.insert(4, "-");		//sbcd = ani-mals-
		System.out.println("StringBuilder sbc = new StringBuilder().append(1).append('c').append(true); sbc = "+sbcd);
		
		//StringBuilder - delete() and deleteCharAt()
		//StringBuilder delete(int start, int end)
		//StringBuilder deleteCharAt(int index)
		StringBuilder sbcde = new StringBuilder("abcdef");
		sbcde.delete(1,3);			//sbcde = adef
		System.out.println("StringBuilder sbcde = new StringBuilder(\"abcdef\") || sbcde.delete(1,3): "+sbcde);
		//sbcde.deleteCharAt(5);		//throws an exception
		
		
		//StringBuilder - reverse()
		//StringBuilder reserse()
		//
		StringBuilder sbcdf = new StringBuilder("ABC");
		sbcdf.reverse();
		System.out.println(sbcdf);
		
		//StringBuilder - toString()
		//String toString()
		sbcdf.toString();
		
		//StringBuffer does the same thing as StringBuilder but more slowly				
	}
}