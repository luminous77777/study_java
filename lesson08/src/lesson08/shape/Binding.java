package lesson08.shape;

public class Binding {
	public static void main(String[] args) {
		A obj = new B();
		
		System.out.println(obj);
		System.out.println(obj.si); 
		System.out.println(obj.i);
		obj.sm();
		obj.m();  //선언 당시의 타입이 바인딩으로 끝. 동일한 이름으로 정의된 타입만 오버라이딩 되었음. static은 오버라이딩되지 않음.
		
		///////////////////////
		A a = new A();
		B b = new B();
		
		A c = b;// 조상의 타입으로 선언했기 때문. 부모의 타입으로 자손 인스턴스 삽입 가능.
		
//		B d = a;
		B e = (B)c; //실제 인스턴스는 B이지만. 타입이 A 이기 때문에 강제 형변환을 해야한다.
		
		
	}
}

class A{
	 static int si = 1;
	 int i = 2;
	 static void sm() { System.out.println("A.sm()");}
	 void m() {System.out.println("A.m()");}
}

class B extends A{
	 static int si = 3;
	 int i = 4;
	 static void sm() { System.out.println("B.sm()");}
	 void m() {System.out.println("B.m()");}
}