package lesson07_2;

public class MemberMain {
	public static void main(String[] args) {
		// this 미래에 생활될 객체의 주소값
		Member m = new Member(20);
		System.out.println(m.num);
		System.out.println(m); //주소값 호출
		
		Member member = m.m1(); //객체 생성// 타입만 맞으면 가능
		System.out.println(member); //m과 같은 주소값 호출
		m.m2(m);
		
	}
}

class Member { //컴파일 전에는 주소를 알 수 없음
	int num = 10;  //인스턴스 필드, 필드의 개수는 1개
	
	Member(int num){  //생성자
		this.num = num; //this. 미래에 호출한 미래의 객체 이름의 통합.  //이름이 곂치지 않는다면 스포크가 가까운곳부터 같은 이름이 있는지 탐색 -> 생성자, 필드 순서
	}
	
	
	Member m1() { //메서드 Member는 반환타입
		return this;
	}
	
	void m2(Member m) { //메서드 //입력쪽이 내타입
		System.out.println(m);
	}
	}
