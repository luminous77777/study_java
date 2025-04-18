package student;

// Data class
public class Student {
	//1.StudentMain의 나머지 기능 구현(메시지 출력)
	//2.Student의 생성자 구현
	//기본생성자 + (학번,이름), (다섯개의 필드를 다 사용)
	//학생 1인의 총점, 평균을 계산한다면
	
	
	
	
	//4월 16일 1.평균계산 double type
	//수정과 삭제 구현. 학번 입력 받고, 그것을 삭제
	//학생 최대수를 넘는 학생을 입력할 경우 배열을 늘리고 추가하기.
	
	
	//인스턴스 변수로 대부분 구성
	//고유키
	int no;
	String name;
	int kor;
	int eng;
	int mat;

	Student() { //기본 생성자
		
	}
	
	Student(int no, String name){ //학번과 이름만 넣는 생성자, 괄호 안에 넣는 그대로 보인다.
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name, int kor, int eng, int mat){
		this(no,name); // 나의 다른 생성자 호출
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	
//		this.no = no;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
	}
	
	int total() { //합계 기능을 처리하는 메서드
		return kor+eng+mat;
	}
	
	double average() { //평균기능을 처리하는 메서드
		return total()/3d; //출력되는 타입을 신경쓰자
	}
	
	void modify(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		return ;
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no,name,kor,eng,mat, average(), total());
	}
	
}
