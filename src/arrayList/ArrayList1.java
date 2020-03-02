package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	public static void MethodList() {
		List li = new ArrayList<>();
		li.add(20);
		li.add("shahul");
		li.add("hameed");
		
		List li2 = new ArrayList<>();
		li2.add(10);
		li2.add("shahul");
		li2.add("hameed");
		int lastIndexOf = li.lastIndexOf("shahul");
		int lastIndexOf2 = li.lastIndexOf(20);		
		li.add(li2);
		
		
		System.out.println(li);
		
		/*for (int i = 0; i < li.size(); i++) {	
			for (int j = 0; j < li2.size(); j++) {
				
				if (li.get(i).equals(li2.get(j))) {
					System.out.println("the commann values are;" + li.get(i));

				}

			}

		}*/
	}

	public static void main(String[] args) {
		MethodList();
	}
}
