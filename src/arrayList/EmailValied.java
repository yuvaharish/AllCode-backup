package arrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValied {

	public static void main(String[] args) {
		String givens ="jackie.raj8@gmail.com";
		
		String emailrejex="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailpattern=Pattern.compile(emailrejex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=emailpattern.matcher(givens);
		System.out.println(matcher.find());
	}
}
