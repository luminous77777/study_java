package lesson11;

import java.util.Scanner;

public class ExceptionEx8 {
	//나중에 완성하기
	static String user_id = "seo";
	static String user_pw = "smg1234";

	public static void main(String[] args) throws Exception{
		
		try {
			Scanner scan = new Scanner(System.in);
//			throw new LoginException("아이디가 올바르지 않습니다")
			System.out.print("아이디");
			String input_id = scan.nextLine();
			
			System.out.println("비밀번호");
			String input_pw = scan.nextLine();
		} catch (Exception e) {
			throw new LoginException("비밀번호가 올바르지 않습니다");
		}

	}
}
