package lesson07_2;

public class LocalValEx {
	public static void main(String[] args) {
		
		Local local = new Local();
		
		
		System.out.println(local.name);
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		
		for (int i = 0; i<10; i++) {
			int temp = 0;
			temp += i;
			System.out.print(temp);
		}
		
		//System.out.println(temp); // for문 안에서 선언된 지역 변수를 호출했기 때문에 에러
	}
}

class Local {
	String name; //인스턴스 변수 //지역 변수가 아님
	void process() {
//		String name;
		name = "홍길동";
	}
	
	void printAge1() {
		int age = 20; //지역변수
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30; //지역변수
		System.out.println(age);
	}
}
