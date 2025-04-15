package lesson07_2;

public class Var2Ex {
	public static void main(String[] args) {
		
		//클래스 변수 사용
		System.out.println("Avate 제조사 : " + Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		//인스턴스 변수의 값 변경
		
		a1.color = "화이트";
		a2.color = "블랙";
		
		//인스턴스 변수 출력
		
		System.out.println("a1 색상 :" + a1.color);
		System.out.println("a2 색상 :" + a2.color);
		
		//클래스 변수를 인스턴스 객체로 출력
		
		System.out.println("a1 제조사 : " + a1.company); 
		System.out.println("a2 제조사 : " + a2.company);
		
		//클래스 변수의 값 변경
		a1.company = "기아";
		
		//클래스 변수의 값
		System.out.println("Avante 제조사 : " + Avante.company); //Avante.company로 출력하라는 추천 메시지가 출력되는 중 ,클래스명으로 출력하여라. 객체명으로는 가능한 출력 하지 말아라
		System.out.println("a1 제조사 :" + a1.company);
		System.out.println("a2 제조사 :" + a2.company);
	}
}

class Avante { //클래스
	String color;  //인스턴스 변수
	static String company = "현대";  //클래스 변수
}