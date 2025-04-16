package lesson07_3;

public class Init2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
//		InitEx ex = new InitEx();
		Class.forName("lesson07_3.InitEx"); // 클래스를 이름으로 탐색, 클래스를 로드
	}
}
