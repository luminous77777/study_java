package student;

import java.util.Arrays;

public class StudentService { // 핵심 로직 클래스
	Student[] students = new Student[2];
	int count = 0;

	{ // 초기화 블록. 기본값 매번 넣기 귀찮아서 있는것.
		students[count++] = new Student(1, "A", 90, 80, 90);
		students[count++] = new Student(2, "B", 90, 50, 60);
	}
	
	
	// 학생 등록
	void register() {
		System.out.println("등록가능, 학번은 0번부터");

		if (count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}

		int no = StudentUtils.nextInt("학번 >");
		String name = StudentUtils.nextLine("이름 >");
		int kor = StudentUtils.nextInt("국어 >");
		int eng = StudentUtils.nextInt("영어>");
		int mat = StudentUtils.nextInt("수학 >");
		students[count++] = new Student(no, name, kor, eng, mat); //생성자 호출로 데이터 입력


	}

	// 조회
	void read() {
		System.out.println("조회 가능");

		for (int i = 0; i < count; i++) {
				System.out.println(students[i].no + "," + students[i].name + "," + students[i].total() + ","+ students[i].average());
		}

	}

	// 수정
	void modify() {
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		System.out.println("수정가능, 학번은 0번부터");
		int no = StudentUtils.nextInt("학번 >");

		Student s = null;
		
		for(int i = 0; i < count ; i ++) { //메서드로 분리 가능
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		
		s.name = StudentUtils.nextLine("이름 >");
		s.kor = StudentUtils.nextInt("국어 >");
		s.eng = StudentUtils.nextInt("영어>");
		s.mat = StudentUtils.nextInt("수학 >");
		
		
//		for (int i = 0; i < count; i++) {
//			if (students[i].no == no) {
//				System.out.println("입력한 학번은 " + students[i].no);
//				int kor = StudentUtils.nextInt("국어 점수 수정 >");
//				int eng = StudentUtils.nextInt("영어 점수 수정>");
//				int mat = StudentUtils.nextInt("수학 점수 수정>");
//
//				students[i].modify(kor, eng, mat);
//			}
//		}

	}

	// 삭제
	void remove() { // 학생배열에게 삭제할 인덱스 넘버를 제외하고 자기 자신에게 복사
		System.out.println("삭제기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 >");
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, +1, students, i, count-- - 1 -i);
//				count--;
				break;
			}
		}

	}
	
	//과목별 평균
	
	//총점 정렬

}
