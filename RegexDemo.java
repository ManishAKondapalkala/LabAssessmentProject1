package day3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".[a-z]"); // pattern
		Matcher matcher = pattern.matcher("as"); // string
		System.out.println(matcher.matches());// true

		// Option 2: Pattern.matches()
		System.out.println(Pattern.matches(".a", "as")); //false
		System.out.println(Pattern.matches(".a", "%a"));// true
		System.out.println(Pattern.matches(".a", "as"));
		System.out.println();
		String contactNo = "1888 634 1407 (Toll Free)";
		System.out.println(Pattern.matches("\\d{4}\\s\\d{3}\\s\\d{4}\\s.*", contactNo));
		System.out.println();

		Pattern pattern1 = Pattern.compile("(\\d{4})\\s(\\d{3})\\s(\\d{4})\\s.*"); // pattern
		Matcher matcher1 = pattern1.matcher(contactNo); // string
		System.out.println(matcher1.matches()); // true

		System.out.println(matcher1.group()); // 1888 634 1407 (Toll Free)
		System.out.println(matcher1.group(1));//1888
		System.out.println(matcher1.group(2));//634
		System.out.println(matcher1.group(3));// 1407

		
	}

}
