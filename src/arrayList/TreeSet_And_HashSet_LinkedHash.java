package arrayList;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_And_HashSet_LinkedHash {
	public static void setTest() {

		
		Set<Integer> s1 = new HashSet<>();
		s1.add(50);
		s1.add(70);
		s1.add(80);
		System.out.println(s1);
		
		LinkedHashSet<Integer> s2=new LinkedHashSet<>();
		s2.add(10);
		s2.add(30);
		s2.add(5);
		System.out.println(s2);
		
		Set<Integer> s = new TreeSet<>();
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(50);
		System.out.println(s);
	
		
		
		
		/*//toadd to collections
		s.addAll(s1);
		System.out.println(s);
		
		//to remove one value from a set
		s.remove(50);
		System.out.println(s);
		
		//to print the common value between two set
		s.retainAll(s1);
		System.out.println(s);
		
		//to remove one collection from another
		s.removeAll(s1);
		System.out.println(s);
		
		//to print all values in set
		
		for(Integer a:s1){
		System.out.println(a);
			
		}*/
	}
public static void main(String[] args) {
	setTest();

}
}
