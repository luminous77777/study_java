package lesson05;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		
		//랜덤값 배정(1~100)
		
		int value = (int)(Math.random() * 100 +1);
		
		Scanner scanner = new Scanner(System.in);
		int count =0;
		int input = 0;
		do {
			System.out.println("1에서 100사이의 숫자를 입력하세요");
			input = scanner.nextInt();
			
			if(input > value)
				System.out.println("입력 값이 크다");
			else if (input < value)
				System.out.println("입력 값이 작다");
			else
				System.out.println("같다");
			count++;
		} while (input != value);
		System.out.println(count + "번째");
	}
}
