package lesson07_2;

public class MethodEx {
	public static void main(String[] args) {// 메인 메서드

		
		int result = add(4, 3);
		System.out.println(result);
		
		print("Hello");
		

		System.out.println(addAll(1,2,3));
		//Stack
	}
	
	static int add(int a, int b) { // static 반환타입 메서드명 매개변수
		return a+b;
	}
	
	static int addAll(int... nums) { // 매개변수 갯수의 제한이 없다, 배열처럼 사용된다
		int ret = 0;
		
		for( int n : nums) {
			ret += n;
		}
		return ret;
	}
	
	static void print(String s) {
		System.out.println(s);
	}
}


