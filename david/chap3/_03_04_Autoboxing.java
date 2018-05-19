package david.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _03_04_Autoboxing{

	public static void main(String[] args){
		
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);				// [50.5]
		weights.add(new Double(60));	// [50.5, 60.0]
		weights.remove(50.5);			// [60.0]
		double first = weights.get(0);	// 60.0
		
		//trying to unbox a null Object
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0);		//NullPointerException
		
		//Be carful removing Integer
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);				//It removes the element in the position "1" and not the Integer(2)		
		System.out.println(numbers);	//[1]
		numbers.remove(new Integer(2));	// This removes the 2
		System.out.println(numbers);	//[]		
		
		//Converting between Array and List
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);				// 2
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length);				// 2
		
		//Converting List to Array
		List<String> listArray = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray1 = list.toArray();
		System.out.println(objectArray1.length);		// 2
		String[] stringArray1 = list.toArray(new String[0]);
		System.out.println(stringArray1.length);		// 2
		
		//Converting Array to List
		String[] array = {"hawk", "robin"};			// [hawk, robin]
		List<String> list1 = Arrays.asList(array);	// returns fixed size list
		System.out.println(list1.size());			// 2
		list1.set(1, "test");						// [hawk, test]
		array[0] = "new"; 							// [new test]
		for(String b : array)	System.out.println(b + " ");	// new test
		//list.remove(1);							//throws UnsupportedOperation Exception - We are not allowed to change the size of the list.
		
		//create and populate an ArrayList in one line.
		List<String> list2 = Arrays.asList("one", "two");
		
		//ArrayList - Sorting
		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(99);
		numbers1.add(5);
		numbers1.add(81);
		Collections.sort(numbers1);
		System.out.println(numbers1);	//[5, 81, 99]				
	}
}