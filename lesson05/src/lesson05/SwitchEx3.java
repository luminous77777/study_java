package lesson05;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요 >");
		Scanner scanner = new Scanner(System.in);
		
		int me = scanner.nextInt();
		
		switch(me) {
			case 1:
				System.out.println("가위를 냈습니다");
				break;
			case 2:
				System.out.println("바위를 냈습니다");
				break;
			case 3:
				System.out.println("보를 냈습니다");
				break;
		}
		
		
		
		int com = (int)(Math.random() * 3 + 1); // 0이상 1 미만의 실수값 > 0 이상 3미만의 실수 > 정수화

		String [] values = {"가위", "바위", "보"};
		System.out.println("내가낸것 :"+ values[me -1] + ", 컴퓨터가 낸 것:" + values[com-1]);
		
		
		switch (me - com) {
			case 0:
				System.out.println("무승부");
				break;
			case 1: case -2:
				System.out.println("우승");
				break;
			case -1:
			case 2:
				System.out.println("패배");
				break;
			default :
				System.out.println("잘못된 값");
		}
	}
}
