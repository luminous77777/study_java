package lesson05;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		//3번
		/*
		int colerPen = 5 * 12;
		int studentCount = 27;
		int divColorPen = colerPen / studentCount;
		System.out.println("학생당 나눠가지는 색연필수 : "+ divColorPen);
		
		int remainColorPen = colerPen % studentCount;
		System.out.println("학생당 나눠가지고 남은 색연필수 " + remainColorPen);
		*/
		
		//4번
		/*
		int age= 5, height= 130;
		boolean heartDease =false, parent = false;
		String check;
		
		check = heartDease ? "심장병 탐승불가" : height >=120 ? age >= 6 ? "나이탑승가능": parent ? "부모동반 탑승가능": "부모미동반 탑승 불가" : "키 탑승 불가" ;
		
		System.out.println(check);
		*/
		//4번 답
		/*
		int age = 10, height = 150;
		boolean parent = false ,hearchDease= false;
		
		boolean isRide = !hearchDease && height >= 120 && (age >= 6 || parent) ;
		*/
		
		//5번
		/*
		int year = 2020;
		
		//boolean leapYear = year % 400 == 0 ? true : year % 100 == 0? false : (year % 4 == 0);
		
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
	
		//윤년이면 true, 윤년이 아니면 false
		System.out.println(leapYear);
		*/
		
		
		
		//6번
		/*
		int price = 187_000;
		int oman = price/50_000;
		int ilman = price%50000/10000;
//		int ochun = price%50000%10000/5000;
//		int ilchun = price%50000%10000%5000/1000;
		
		int ochun = price%10000/5000;
		int ilchun = price%5000/1000;
		
		System.out.println("5만원권 : "+oman+"장");
		System.out.println("1만원권 : "+ilman+"장");
		System.out.println("5천원권 : "+ochun+"장");
		System.out.println("1천원권 : "+ilchun+"장");
		*/
		
		//7번
		/*
		int number = 1234;
		int result = number/100*100; // number - number % 100;
		
		System.out.println(result);
		*/
		
		//ex1
		
		/*
		System.out.println("ID를 입력해주세요 ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력해주세요");
		String pw = scanner.nextLine();
		
		/*
		if(id.equals("admin")) {
			if(pw.equals("1234")) {
				System.out.println("로그인 성공");
			} else
				System.out.println("로그인 실패 : 잘못된 비밀번호입니다");
		}else
			System.out.println("로그인 실패 : 없는 계정입니다");
		*/
		/*
		//깔끔한 코드
		if(!id.equals("admin")) { //없는 계정
			System.out.println("로그인 실패 : 없는 계정입니다");
		}else if (pw.equals("1234")) { //로그인 성공
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패 : 잘못된 비밀번호입니다");
			}
		*/
		
		
		
		//ex2
		/*
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 하나 입력해주세요 > ");
		number = scanner.nextInt();
		
		boolean 삼의배수 = number % 3 == 0;
		boolean 짝수 = number % 2 == 0;
		/*
		if(number % 3 == 0 || number % 2 == 0) {
			if(number % 6 == 0) {
				System.out.println("3배수이자 짝수");
			}
			else if( number%3 == 0 && !(number % 2 == 0)) {
				System.out.println("3의 배수");
			} else
				System.out.println("짝수");
		}else
			System.out.println("3의 배수도 짝수도 아니다");
		*/
		/*
		// 깔끔한 코드
		if(삼의배수 && 짝수) {
			System.out.println("3배수이자 짝수");
		}
		else if(삼의배수){
			System.out.println("3의 배수");
		}else if(짝수) {
			System.out.println("짝수");
		}else
			System.out.println("3의 배수도 짝수도 아니다");
		*/
		
		/*
		// 비트 마스크 플래그
		
		int result = 0;
		result += 삼의배수 ? 1:0;
		result += 짝수 ? 2:0;
		String str = "";
		
		switch(result) {
		case 1:
			str += "3의배수";
		case 2:
			str += "짝수";
		case 3:
			str += "3의 배수이자 짝수";
		}
		System.out.println(str);
		*/
		
		
		//ex3
		
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해주세요 >");
		month = scanner.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:{
			System.out.println("봄");
			break;
		}
		case 6: case 7: case 8:{
			System.out.println("여름");
			break;
		}
		case 9: case 10: case 11:{
			System.out.println("가을");
			break;
		}
		case 12: case 1: case 2:{
			System.out.println("겨울");
			break;
		}
		default :
			System.out.println("잘못된 값입니다");
		}
		
	}
	
		
}
