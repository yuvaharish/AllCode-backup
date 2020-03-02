package arrayList;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCommanValue {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("yuva");
		array.add("king");
		array.add("raj");
		ArrayList<String> array1=new ArrayList<>();
		array1.add("yuva");
		array1.add("king");
		array1.add("senthil");
		array1.retainAll(array);
		
		System.out.println(array1);
		
	}
	
}
