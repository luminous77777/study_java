package lesson07_3;

public class InitFinal {
	//초기화 순서
	//1.클래스 변수
	//2.클래스 초기화블럭
	//3.인스턴스 변수
	//4.인스턴스 초기화 블럭
	//5. 생성자 
	
	static int si; // 클래스변수
	int i ; // 인스턴스 변수
	
	static void sm() { // 클래스 메서드 //this. 못씀. 인스턴스 그 자체
		System.out.println(si);
//		System.out.println(i);
//		System.out.println(this);
	}
	void m() { //인스턴스 메서드
		System.out.println(si);
		System.out.println(i);
		System.out.println(this);
	}
	
	public static void main(String[] args) { //인스턴스 계열은 인스턴스가 생성 될 때만 사용가능. 메모리의 호출순서
		InitFinal.sm();
		
		new InitFinal().m();
	}
}
