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
//		int age= 5, height= 130;
//		boolean heartDease =false, parent = false;
//		String check;
//		
//		check = heartDease ? "심장병 탐승불가" : height >=120 ? age >= 6 ? "나이탑승가능": parent ? "부모동반 탑승가능": "부모미동반 탑승 불가" : "키 탑승 불가" ;
//		
//		System.out.println(check);
		
		
		//5번
		/*int year = 2460;
		
		boolean leapYear = year % 400 == 0 ? true : year % 100 == 0? false : (year % 4 == 0) ;
		
		//윤년이면 treu, 윤년이 아니면 false
		System.out.println(leapYear);*/
		
		//6번
		/*
		int price = 187000;
		int oman = price/50000;
		
		price = price - oman * 50000;
		
		int ilman = price/10000;
		
		price = price - ilman * 10000;
		
		int ochun = price/5000;
		
		price = price - ochun*5000;
		
		int ilchun = price/1000;
		
		System.out.println("5만원권 : "+oman+"장");
		System.out.println("1만원권 : "+ilman+"장");
		System.out.println("5천원권 : "+ochun+"장");
		System.out.println("1천원권 : "+ilchun+"장");
		*/
		
		//7번
		/*
		int number = 123;
		int result = (number/100)*100;
		
		System.out.println(result);
		*/
		
		//ex1
		
		/*
		System.out.println("ID를 입력해주세요 ");
		Scanner input_id = new Scanner(System.in);
		String id = input_id.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		Scanner input_pw = new Scanner(System.in);
		int pw = input_pw.nextInt();
		
		String check = "로그인 성공";
		
		if(id.equals("admin")) {
			if(pw == 1234) {
				System.out.println("로그인 성공");
			} else
				System.out.println("로그인 실패 : 잘못된 비밀번호입니다");
		}else
			System.out.println("로그인 실패 : 없는 계정입니다");
		*/
		
		int number;
	}
	
		
}
