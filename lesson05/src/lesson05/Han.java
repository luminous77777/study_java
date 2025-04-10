package lesson05;

import java.util.Scanner;

public class Han {
	public static void main(String[] args) {
//		//한글의 갯수
//		System.out.println('힝'-'가' + 1);
//		//초성당 글자 갯수
//		System.out.println("초성의 하나당 문자 개수 : " + ('힣'-'하' + 1));
//		//초성의 갯수
//		System.out.println("초성의 갯수 19종, 실제 값 : " + 11172 / 588);
//		//종성간 거리
//		System.out.println("종성간 거리 : " + ('개' - '가'));
//		
//		//특정 글자가 받침이 있는지 없는지 boolean
//		char ch = '미';
//		System.out.println((ch-'가') % 28 != 0);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단어를 입력하세요 > ");
		String inputStr = scanner.nextLine();
		
		//문자열의 내의 특정위치의 글자하나만 char로 변환
		char ch = inputStr.charAt(inputStr.length() - 1);
		boolean hasLast = (ch-'가') % 28 != 0;
		
		String output = "사용 단어의 예시는 아래와 같습니다\n";
		output += inputStr + (hasLast ? "은" : "는") +  "\n";
		output += inputStr + (hasLast ? "이" : "가") +  "\n";
		output += inputStr + (hasLast ? "을" : "를") +  "\n";
		
		System.out.println(output);
		
	}
}
