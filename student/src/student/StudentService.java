package student;

public class StudentService { //핵심 로직 클래스 
	Student[] students = new Student[10];
	
	
	
	//학생 등록
	void register() {
		System.out.println("등록가능");
	}
	
	
	//조회
	void read() {
		System.out.println("조회 가능");
	}
	
	
	//수정
	void modify() {
		System.out.println("수정가능");
	}
	
	
	//삭제
	void remove(){
		System.out.println("삭제 가능");
	}

}
