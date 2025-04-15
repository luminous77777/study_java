package student;

import java.util.Scanner;

public class StudentUtils {
	static final Scanner scanner = new Scanner(System.in);// final : 상수
	
	static String nextLine(String msg) { //메서드
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}

}
