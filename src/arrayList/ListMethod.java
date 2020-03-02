package arrayList;


import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void arryList() {
		List li2 = new ArrayList<>();
		li2.add(10);
		li2.add(2000);
		li2.addAll(li2);
		System.out.println(li2);
		//to find the common values refer notbook
		boolean retainAll = li2.retainAll(li2);
		System.out.println(li2);
		
		//clear
		li2.clear();
		System.out.println(li2);
	}
	public static void main(String[] args) {
		arryList();
	}

}
