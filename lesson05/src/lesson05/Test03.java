package lesson05;

import java.util.Iterator;

public class Test03 {
	public static void main(String[] args) {
		
		// 상자 갯수 세기
		
		int box = 8, apple = 121;
		int result;
		
		
		String msg = "결과는? : ";
		
		//result= apple%box == 0 ? apple/box : apple /box +1;
		System.out.println((apple + box -1)/ box); //올림처리
		
		//System.out.println(msg + result);
		
		
		//2.합계 구하기
		
		int sum = 0;
		
		for(int i = 1 ; i <=100; i++) {
//			if(i % 2 == 0) {
//				sum += -i;
//			} else {
//				sum += i;				
//			}
			
			sum += i%2 == 0 ? -i : i;
		}
		System.out.println(msg+sum);
		
		
		//3. 소수 판정
/*		
		int input_number = 13, count = 0;
		String prime_number;
		
		
		for(int i = 1 ; i<=input_number; i++) {
			if(input_number % i == 0) {
				count++;
			}
		}
		prime_number = count == 2 ? "소수" : "소수가 아님";
		
		System.out.println(msg+prime_number);
*/		
		
		int num = 7;
		int count = 0;
		for (int i = 2; i < num ; i++) {
			System.out.printf("%d : %d >> %s \n", i,num % i, num % i == 0 ? "약수" : "약수아님");
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 0 ? "소수" : "소수아님");
	}
}
