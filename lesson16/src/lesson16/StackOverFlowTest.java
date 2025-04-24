package lesson16;

public class StackOverFlowTest {
	public static void main(String[] args) throws Exception {
//		new Data();
//		System.out.println("====================");
//		new Data();
		Class.forName("lesson16.Data");
		Data.print(1);
	}
}

class Data{ //클래스의 로딩. 인스턴스를 호출하려면 이미 클래스의 초기화 정보가 있어야한다
	//1. 인스턴스가 생성시
	//2. static 변수가 사용될때
	//3. static 메소드가 호출될때.
//	Data data = new Data();
	
	{ //인스턴스 초기화
		System.out.println("초기화블럭");
	}
	static{
		System.out.println("클래스 초기화 블럭");
	}
	public Data() {
		System.out.println("생성자");
	}
	static int print(int i) {
		System.out.println("print 호출됨 ::" + i);
		return i;
	}
}
