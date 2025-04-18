package lesson12;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member("김", "010-5461-4563");
		Member member2 = new Member("이", "010-5461-4563");
		
		System.out.println(member.equals(member2)); //존재이유, 필요에 따라 오버라이드 하여라 주소비교이기대문에 보통은 ==와 용법이 같다
		System.out.println(member == member2);
		
		Member m =  member.clone();
		System.out.println(m);
	}
}
