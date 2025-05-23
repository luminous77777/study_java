package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}
}
