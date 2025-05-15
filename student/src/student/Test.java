package student;

public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		Student s = m1(student);
		System.out.println(s);
		m2(student);
		System.out.println(student);
		
		int num = 10;
		int result = m3(num);
		m4(num);
		
		
	}
	// 함수형
	static Student m1(Student student) {
		student.setKor(50);
		return student;
	}
	//프로시저형 정의
	static void m2(Student student) {
		student.setKor(70);
	}
	
	static int m3(int i) {
		System.out.println(i*i);
		return 0;
	}
	
	static void m4(int i) {
		System.out.println(i*i);
	}
}
