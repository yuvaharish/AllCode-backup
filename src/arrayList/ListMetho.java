package arrayList;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

public class ListMetho {
	public static void listMethod() {
	
	 List li = new ArrayList<>();
		//assigning a value to a list
		li.add(10);
		li.add("shahul");
		
		//insert a value
		li.add(1, 20);
		
		//replace
		li.set(1, 30);
		
		//to retrive
		Object object = li.get(1);
		System.out.println(object+"first");
		
		//more than value to print from list
		for(int i=0;i<li.size();i++)  {
			Object object2 = li.get(i);
			System.out.println(object2);
		}
		//to find a index of a value
		int indexof = li.indexOf(10);
		System.out.println(indexof);
		
		//last index
		int lastindexof = li.lastIndexOf(10);
		System.out.println(lastindexof);
		
		//removing a value using index
		Object remove = li.remove(0);
		System.out.println(remove);
		
	}
	
	public static void main(String[] args) {
		listMethod();
	}
}
