package lesson07_3;

public class Ins { //인스턴스란
	public static void main(String[] args) {
		String str = new String();
		//1. String : 구조상 : 클래스, 데이터 타입
		//2. str : 구조상 : 객체이자, 지역변수
		//3. = : 대입연산자. 할당의 기능
		//4. new : 연산자, 인스턴스 생성 트리거. 생성자를 필요로 한다.
		//5. String() : 생성자 호출, 기본생성자 이다. 인자가 없기 대문
		// 4와 5 : 새로운 인스턴스 생성. ||필드 초기화 -> 주소 출력 -> 출력된 주소를 필요로 하는곳에 전달 -> 그것을 객체

		//2 객체. 4+5 부분은 인스턴스. 인스턴스는 참조자료형의 본질, 위치
		
		//new String().length(); // 객체로 할당되지 않은 인스턴스 기때문에 객체로는 접근 불가능
		
		//String s; 객체이자, 지역변수
		//String s = null; 인스턴스가 부여되지 않은 객체, 이자 지역변수
	}
}
