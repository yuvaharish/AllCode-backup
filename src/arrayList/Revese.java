package arrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Revese {

	public static void main(String[] args) {
		
			String givens ="yuvaraj4123";						
			
		System.out.println(givens.length());
			
			
		char[] charary =givens.toCharArray();
		
		int length=0;
		for(char c:charary) {
			length++;
		}
		System.out.println(length);
}
}