package lesson04;

public class OpEx4 {
	public static void main(String[] args) {
		int a= 10;
		int b = 5;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean c = a ==b;
		System.out.println("c : " + c);
		boolean d = c == false;
		System.out.println("d : " + d);
		
		int ko1 = '가';
		int ko2 = '힣';
		System.out.println(ko1);
		System.out.println(ko2);
		System.out.println(ko2 - ko1 +1);

		//boolean e
		//a의 값이 양수 이면서 20보다 작은지
		
		boolean e = a > 0 && a < 20;
		System.out.println(e);

		// a의 값이 홀수 이거나 5의 배수 인지를 e에 저장
		
		e = a % 2 == 1 || a % 5 == 0 ;
		System.out.println(e);
		
		//비트 연산
		System.out.println(9 & 5);
		System.out.println(9 | 5);
		System.out.println(9 ^ 5);
		System.out.println(~7);
		
		//쉬프트 연산
		// 1001
		// 9 << 2 == 100100
		System.out.println(9 << 2);
		System.out.println(9 >> 2);
		
		System.out.println(-4 >>1);
		System.out.println(-4 >>>1);
		
		System.out.println(Integer.toBinaryString(-4 >>>1));
		
		
		
		
		//나누는 수가 0이면 안된다.
		
	}
}
