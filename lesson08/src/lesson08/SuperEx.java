package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child(); //인스턴스 직접 호출 = 객체의 리터럴
		child.print();
	}
}

class Parent {
	int number = 3;
	
	Parent(){ //생성자
//		super();//생략되어있음
		System.out.println("부모객체 생성");
	}
}

class Child extends Parent{
	int number =2 ;
	
	Child(){//생성자
//		super(); //생략되어있음
		System.out.println("자식객체 생성");
	}
	
	void print() {
		int number =1;
		System.out.println(number); //메서드 지역변수
		System.out.println(this.number); //자신 객체의 number
		System.out.println(super.number); //부모객체의 number
	}
}