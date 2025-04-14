package lesson07;

public class MemberMain {
	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member();
		
		m.num=1;
		m.name = "김윤석";
		m.age=28;
		
		m2.num = 2;
		m2.name = "홍길동";
		m2.age = 33;

		m2 = m;
		m2.age = 30;
		m.num=3;
		
		System.out.println(m.num);
		System.out.println(m.name);
		System.out.println(m.age);

		System.out.println(m2.num);
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		
		
		
		if( m == m2) {
			System.out.println("m개체와 m2 객체는 같다");
		}else {
			System.out.println("m개체와 m2 객체는 같지않다");			
		}
		
		//만일 같게 하고싶다면
		
		m2 = m;
		
		if( m == m2) {
			System.out.println("m개체와 m2 객체는 같다");
		}else {
			System.out.println("m개체와 m2 객체는 같지않다");			
		}
		
		Member[] member = new Member[3]; // 기본값은 NULL
		
		Member member1 = new Member(); // 이 안의 기본값은 0 null, 0
		
		
	}
}
