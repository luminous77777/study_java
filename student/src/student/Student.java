package student;

// Data class
public class Student {
	//1.StudentMain의 나머지 기능 구현(메시지 출력)
	//2.Student의 생성자 구현
	//기본생성자 + (학번,이름), (다섯개의 필드를 다 사용)
	
	//인스턴스 변수로 대부분 구성
	//고유키
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	Student() { //기본 생성자
		
	}
	
	Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name, int kor, int eng, int mat){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
}
