package student;

public class StudentService { //핵심 로직 클래스 
	Student[] students = new Student[10];
	
	
	
	//학생 등록
	void register() {
		System.out.println("등록가능");
			students[0] = new Student();
			students[0].no = StudentUtils.nextInt("학번을 입력하세요");
			students[0].name = StudentUtils.nextLine("이름을 입력하세요");
			students[0].kor = StudentUtils.nextInt("국어점수를 입력하세요");
			students[0].eng = StudentUtils.nextInt("영어점수를 입력하세요");
			students[0].mat = StudentUtils.nextInt("수학점수를 입력하세요");
	}
	
	
	//조회
	void read() {
		System.out.println("조회 가능");
		System.out.println("학번은 : "+students[0].no);
		System.out.println("이름은 : "+students[0].name);
		System.out.println("국어점수 : "+students[0].kor);
		System.out.println("영어점수 : "+students[0].eng);
		System.out.println("수학점수 : "+students[0].mat);
		
		System.out.println("총점 : "+ (int)students[0].kor+ (int) students[0].eng+ (int)students[0].mat);
	}
	
	
	//수정
	void modify() {
		System.out.println("수정가능");
	}
	
	
	//삭제
	void remove(){
		System.out.println("삭제 가능");
		students[0].no = 0;
		students[0].name = null;
		students[0].kor = 0;
		students[0].eng = 0;
		students[0].mat = 0;
	}

}
