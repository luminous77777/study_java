package lesson04;

public class OpEx2 {
	public static void main(String[] args) {
		int a = 5+5;
		System.out.println("5+5 = "+a);
		int b = a-5;
		System.out.println("10-5= "+b);
		int c = b*2;
		System.out.println("5*2 = "+c);
		int d = c/5;
		System.out.println("10/5= "+d);
		int e = 10%3;
		System.out.println("10%3 = " + e);
		
		char ch1 = 'A';
		ch1 = (char)(ch1 +1);
		System.out.println(ch1);
		
		ch1++;
		System.out.println(ch1);
		
		//quiz 
//		double val= 1.234567897;
//		val -= val %0.01;
//		System.out.println(val);
	
		// 값을 소수 3째 자리에서 버림
		
		double val = 1.234567; 
		
		val = (int)(val *100);
		val = val/100;
		System.out.println("val : 약"+val);
	}
}
