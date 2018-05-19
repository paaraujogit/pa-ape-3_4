package david.exames.exame1;

import java.util.ArrayList;
import java.util.List;


//A functional interface is an interface that contains exactly one abstract method. 
//It may contain zero or more default methods and/or static methods. 
interface Predicate<T> {
	boolean test(T t); 
}


class Data{ public int value; public Data(int i) {this.value = i; }}
class ImplementsFunctional{
	
	//You could have a method that takes an instance of class that implements this interface defined like this 
	public void printImportantData(List<Data> dataList, Predicate<Data> p){
		for(Data d: dataList){
			if(p.test(d)) System.out.println(d.value);
		}
	}	
}


public class _64 {

	public static void main(String[] args) {

		List<Data> a1 = new ArrayList<>() ;
		a1.add(new Data(-1));
		a1.add(new Data(2));
		a1.add(new Data(3));
		
		new ImplementsFunctional().printImportantData(a1, (Data d)->{ return d.value>1; } );

	}

}


