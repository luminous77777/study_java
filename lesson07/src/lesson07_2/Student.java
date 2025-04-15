package lesson07_2;

public class Student {
	
	String name;  //필드가 3개
	int grade;
	String department;
	
	Student(){} // 파라미터 즉, 매개변수가 없는 생성자를 오버로딩할수있다

	Student(String n, int g, String d){ //반환타입자체가 없다
		name = n;
		grade = g;
		department = d;
	}
	
}
