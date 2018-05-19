package david.chap3;

import java.util.*;			//import whole package including Arrays. We need this two imports with Arrays.sort()
import java.util.Arrays;	//import just Arrays

public class _03_03_Arrays{

	public static void main(String[] args){
	
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[]{42, 55, 99};
		int[] numbers22= {42, 55, 99};	// This array is called anonymous Array
		//numbers1 = {1, 2, 3};   The initialization above is just allowed in the declaration!!!
		
		//they are valid
		int[] numAnimals;
		int [] numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
		
		//This is valid
		int ids[], types;	// the first variable is an int Array, the other is an int.
		
		
		//Object[] objects = new StringBuilder();	//careful! It throws a ArrayStoreException
		
		//Using an Array		
		String[] mammals  = {"monkey", "chimp", "donkey"};	
		System.out.println(mammals.length);					//3
		System.out.println(mammals[0]);						//monkey
		System.out.println(mammals[1]);						//chimp
		System.out.println(mammals[2]);						//donkey
		
		
		//Sorting - Arrays.sort()
		int[] numbers = {6, 9, 1};
		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length; i++){
			System.out.print( numbers[i] + " ");
		}
		
		//Sorting with Strings
		String[] strings = {"10", "9", "100"};
		Arrays.sort(strings);
		for(String string: strings){		// 1 < A < a 
			System.out.print(string+" ");	// 10 100 9 - Numbers sorts before letters and Uppercase before lowercase
		}
		
		
		//Searching - int binarySearch(string str, int index) - returns the index if finds the int. 
		//In case the Array is sorted by Ascending way, it returns the sugested index * (-1) -1.		
		//If is not sorted the return is unpredictable.
		int[] numbers_s = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers_s, 2));	//0
		System.out.println(Arrays.binarySearch(numbers_s, 4));	//1
		System.out.println(Arrays.binarySearch(numbers_s, 1));	//0 - 1 = -1
		System.out.println(Arrays.binarySearch(numbers_s, 3));	//1 * -(1) -1 = -2
		System.out.println(Arrays.binarySearch(numbers_s, 9));	//4 * (-1) -1 = -5
		
		//Now with an unsorted Array -Output not predictable!!!
		int[] numbers_u = new int[]{3, 2, 1};
		System.out.println("numbers_u{3, 2, 1} || Arrays.binarySearch(numbers_u, 2): "+Arrays.binarySearch(numbers_u, 2));
		System.out.println("numbers_u{3, 2, 1} || Arrays.binarySearch(numbers_u, 3): "+Arrays.binarySearch(numbers_u, 3));
		
		
		//Multidimensional Arrays
		int[][] vars1;				//2D array
		int vars2[][];				//2D array
		int[] vars3[];				//2D array
		int[] vars4[], space[][];	//a 2D AND a 3D array
		
		//specifying the size
		String[][] rectangle = new String[3][2];
		int [][] args1 = new int[4][];
		args1[0] = new int[5];
		args1[1] = new int[3];
		
		//using a Multidimensional Array
		int[][] twoD = new int[3][2];
		for(int i =0; i < twoD.length; i++){
			for(int j = 0; j < twoD[i].length; j++){
				System.out.print(twoD[i][j] + " ");	//print element							
			}
			System.out.println();					//time for a new row
		}
		
		for(int[] inner: twoD){
			for(int num : inner){
				System.out.print(num + " ");	//print element							
			}
			System.out.println();			//time for a new row			
		}
		
		//ArrayList		
		//Creating an ArrayListArrayList list1 = new ArrayList();
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list1); //Copy the size and content of list1 ArrayList
		
		//Put List in the Game		
		List<String> list6 = new ArrayList<>();
		
		//ArrayList - add()
		// boolean add(E element)
		// void add(int index, E element)
		ArrayList list = new ArrayList();
		list.add("hawk");				// [hawk]
		list.add(Boolean.TRUE);			// [hawk, true]
		System.out.println(list);		// [hawk, true] // We didn't specify a TypeCode
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE);		// DOES NOT COMPILE
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");				// [hawk]
		birds.add(1, "robin");			// [hawk, robin]
		birds.add(0, "blue jay");		// [blue jay, hawk, robin]
		birds.add(1, "cardinal");		// [blue jay, cardinal, hawk, robin]
		System.out.println(birds);		// [blue jay, cardinal, hawk, robin]
		
		//ArrayList - remove
		//boolean remove(Object object)
		//E remove(int index)
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk");			// [hawk]
		birds2.add("hawk");			// [hawk, hawk]
		System.out.println(birds.remove("cardinal"));	//prints false
		System.out.println(birds.remove("hawk"));		//prints true
		System.out.println(birds.remove(0));			//prints hawk
		System.out.println(birds);						//[]
		//birds.remove(100);//Trying to remove under a index that doesn't exit, throws IndexOutOfBoundsException

		
		//ArraList - set()
		// E set(int index, E newElement)
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk");					//[hawk]
		System.out.println(birds3.size());	// 1
		birds.set(0, "robin");				//[robin]
		System.out.println(birds3.size());	// 1
		//birds.set(1, "robin");			// IndexOutOfBoundsException
		
		//ArrayList - isEmpty() // size()
		//boolean isEmpty()
		//int size()
		//----------------------------------------------------------------
		//ArrayList - clear()
		//void clear()
		//----------------------------------------------------------------
		//ArrayList - contains
		//boolean contains(Object object)
		//----------------------------------------------------------------
		System.out.println(birds.contains("hawk"));	//true - Since String implements equals, this works
		System.out.println(birds.contains("robin"));//false
		
		//ArrayList - equals()
		//boolean equals(Object object)
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));	// true
		one.add("a");							// [a]
		System.out.println(one.equals(two));	// false
		two.add("a");							// [a]
		System.out.println(one.equals(two));	// true
		one.add("b");							// [a,b]
		two.add(0,"b");							// [b,a]
		System.out.println(one.equals(two));	// false
	}
}