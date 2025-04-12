package lesson06;

import java.util.Arrays;

public class Ex250411 {
	public static void main(String[] args) {
		// 187000원
		// 50000,10000,5000,1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		//배열 사용
		/*
		int money = 187000;
		int[] units = {50000,10000, 5000, 1000};
		int[] count = new int[units.length];
		
		for(int i = 0; i < units.length ; i++) {
			if(i != 0) {
				count[i] = money % units [i-1] / units[i];
			}else
				count[i] = money / units[i];
			
			System.out.println(units[i] + "원권은 "+count[i]+"장 필요");
		}
		*/
		
		// 이하 코드 작성 후 갯수 출력
		
		// 2. 임의의 문자열 생성 exCAPTCHA생성 String [] 잘 사용
		// 문자열의 범위는 숫자,영대,영소 10글자
		
		char randUpper, randLower, randNumber;

		char[] captcha = new char[9];
		int seed;
		
		for(int i =0; i<captcha.length;i++) {
			seed = (int)(Math.random()*3);
			randUpper = (char)((int)(Math.random()*26)+65);
			randLower = (char)((int)(Math.random()*26)+97);
			randNumber = (char)((int)(Math.random()*10)+48);
			
			if(seed==0) {
				captcha[i]=randUpper;
			}else if(seed == 1) {
				captcha[i] = randLower;
			}
			else {
				captcha[i] = (char) randNumber;
			}
			
			System.out.print(captcha[i]);
		}
		
		//3. 배열에 임의값 채우기 
		//100개의 공간을 가지는 배열 (0~9 사이의 아무 값)
		/*
		int[] number = new int[100];
		int random_num;

		for(int i=0; i<number.length; i++) {
			random_num = (int)(Math.random()*10);
			number[i]= random_num;
		}
		System.out.println(Arrays.toString(number));

		//3-2  위의 배열의  빈도수 구하기 =>허프만 코딩 압축 배열
		// 배열의 길이는 10

		int[] count = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			for(int j = 0; j<count.length;j++) {
				if(j == number[i]) {
					count[j]++;
				}
			}
		}
		for(int i = 0; i< count.length; i++) {
			System.out.println(i+"의 개수는 "+count[i]+"개");
		}
		*/
		// 교재 연습문제 p111
		
		//ex1 
		/*
		int sum = 0;
		
		for(int i = 0; i<=100 ; i++) {
			if(i%5 == 0) {
				sum += i;
			}
		}

		System.out.println("5의 배수의 합계는 " + sum);
		*/
		
		//ex2
		/*
		int evenSum= 0 ;
		int oddSum = 0;
		
		for(int i = 1; i<=100;i++) {
			if(i%2==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		
		System.out.println("짝수의 합계는 = "+evenSum);
		System.out.println("홀수의 합계는 = "+oddSum);
		*/
		/*
		//ex3 
		for (int x = 1; x <=6; x++) {
			for(int y=1; y<=6;y++) {
				if(x+y==6) {
					System.out.println(x+ ","+y);
				}
			}
		}
		*/
		//ex4
		/*
		for(int i =1; i<=5; i++) {
			for(int j = 1; j<= 5; j++) {
				if(j<=i) {
					System.out.print("*");									
				}
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i =0; i<=5; i++) {
			for(int j = 1; j<= 5 - i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		*/
		
		/*
		int star = 9, line= 5;
		for(int i =0; i<line; i++) {
			for(int j = 1; j<=star; j++) {
				if(j <= line+i && j >= line-i) {
					System.out.print("*");					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		/*
		int dice, sum=0;
		while(true) {
			dice = (int)(Math.random() * 6 )  +1;
			System.out.print(dice+", ");
			sum += dice;	
			if(dice == 6) break;
		}
		System.out.println("\n6이 나왔습니다. 지금까지의 합 : "+sum);
		*/
	}
	
}
