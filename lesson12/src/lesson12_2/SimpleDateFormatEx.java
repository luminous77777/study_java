package lesson12_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
	public static void main(String[] args) throws ParseException {
		String str = "2025-12-25";
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		
		sdf.parse(str);
		Date date = sdf.parse(str);
		
		System.out.println(date);
		
	}
}
