package lesson08_2;

public class AbsMain {

}

abstract class Parent{//추상클래스도 클래스이므로 규칙이므로 생성자는 존재
	abstract void m(); //추상메서드
}

abstract class Child extends Parent{  //추상 클래스로부터상속을 받았으므로 자식 클래스도 추상메서드를 가지고 있는 상황이다.. 그래서 추상 클래스가 되거나. 메서드의 구현을 해야한다
	
}
abstract class GrandChild extends Child{ // 추상 클래스라고 하더라도 추상메서드를 가질 필요는 없다
	
	void m() { // 추상 메서드의 구현부를 구현
		
	}
		
}
class GrandGrandChild extends GrandChild{
	
}