package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("b[a-z]*");
		Pattern d = Pattern.compile("\\d");//숫자
		Pattern d2 = Pattern.compile("[0-9]");//숫자
		Pattern d3 = Pattern.compile("\\D");//숫자아님
		Pattern d4 = Pattern.compile("[^0-9]");//숫자아님
		
		Matcher m;
		
		String[] strs = {"bat", "cat", "bed", "love", "rice", "b" , ""};
		
		//이메일주소패턴
		//휴대전화번호 패턴
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-5461-4223";
		
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s+" =  " +m.matches());
		}
		System.out.println("===================");
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a", "e"));
		System.out.println("abcd1234abcd".replace(".a", "e"));
}
}
