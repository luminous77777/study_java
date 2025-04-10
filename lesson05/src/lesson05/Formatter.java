package lesson05;

public class Formatter {
	public static void main(String[] args) {
		String str = "001 002 003";
		
		System.out.println(str);
		
		System.out.printf("%03d %03d %03d\n",1 , 2 , 3);
		
		String str2 = String.format("%03d %03d %03d\n", 1, 2, 3);
		System.out.println(str2);
		
		//%d 10진수 정수
		//%x 16진수 정수
		//%o  8진수 정수
		//%f  실수
		//%s  문자열
		//%c  문자
		
		System.out.printf("%d %x %o %.15f \n", 30, 30, 30, 30d);
		
		int hex = 0xcafe;
		
		System.out.printf
		("%d \n" + "", hex);
		
		int oct = 0777;
		System.out.println(oct);
		
		int bin = 0b1111;
		System.out.println(bin);
		
		String result = "";
		for (int i = 1; i<=100; i++) {
			result += String.format("%03d ", i);
		}
		System.out.println(result);
	
		int count=0;
		for(int i = '가'; i < '까'; i++) {
			System.out.print((char)i);
			count++;
		}
		System.out.println(count);
		
		System.out.println('까'-'가');
	}

}
