package student;

import java.util.Arrays;

public class StudentService { // 핵심 로직 클래스
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	
	int count = 0;

	{ // 초기화 블록. 기본값 매번 넣기 귀찮아서 있는것.
		students[count++] = new Student(1, "A", 50, 80, 70);
		students[count++] = new Student(2, "B", 90, 50, 60);
		students[count++] = new Student(3, "C", 40, 50, 30);
		students[count++] = new Student(4, "D", 100, 100, 100);
		
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}
	
	
	// 학생 등록
	void register() {
		System.out.println("등록가능, 학번은 0번부터");

		
		
		if (count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}

		int no = StudentUtils.nextInt("학번 >");

		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다");
			return;
		}
		
		String name = StudentUtils.nextLine("이름 >");
		int kor = StudentUtils.nextInt("국어 >");
		int eng = StudentUtils.nextInt("영어>");
		int mat = StudentUtils.nextInt("수학 >");
		students[count++] = new Student(no, name, kor, eng, mat); //생성자 호출로 데이터 입력
		
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}

	// 조회
	void read() {
		System.out.println("조회 가능");

		print(students);

	}
	
	void readOrder() { //석차순
		System.out.println("조회 기능");
		print(sortedStudents);
	}
	
	void print(Student[] stu) { // 단순 출력 기능
		for(int i = 0; i<count ;i++) {
			System.out.println(stu[i]);
		}
	}

	// 수정
	void modify() {
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		System.out.println("수정가능, 학번은 0번부터");
		int no = StudentUtils.nextInt("학번 >");

		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		
		s.name = StudentUtils.nextLine("이름 >");
		s.kor = StudentUtils.nextInt("국어 >");
		s.eng = StudentUtils.nextInt("영어>");
		s.mat = StudentUtils.nextInt("수학 >");
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();

	}

	// 삭제
	void remove() { // 학생배열에게 삭제할 인덱스 넘버를 제외하고 자기 자신에게 복사
		System.out.println("삭제기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 >");
		
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i , count-- - 1 - i);
				break;
			}
		}
		
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();


	}
	
	//과목별 평균
	void allavg() {
		// 국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		
		
		for (int i = 0; i < count; i++) { //모든학생의 국어 점수 출력
			avgKor += students[i].kor;
			avgEng += students[i].eng;
			avgMat += students[i].mat;
			avgAll += students[i].average();
		}
		avgKor /= (double)count;
		avgEng /= (double)count;
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat)/3;
		
		System.out.println(count + "명 학생 평균");
		System.out.println("국어 평균" + avgKor);
		System.out.println("영어 평균" + avgEng);
		System.out.println("수학 평균" + avgMat);
		System.out.println("총 평균"+ avgAll);
	}
	
	
	//총점 정렬
	void rank() { 
		System.out.println("학생들의 총점을 기준으로 석차정렬");
		
		
		
		for(int i = 0; i <count - 1 ;i++) {
			int idx = i;
			for(int j = 1 + i; j < count ; j++) {
				if(sortedStudents[idx].total() < sortedStudents[j].total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
		}
		
		
		
		
		
		
		
		
//		int[] arr = {5,4,3,2,1}; // 버블 정렬의 과정예시
//		for(int i = 0; i < arr.length-1; i++) {
//			System.out.println(i+1+"회차");
//			for(int j = 0; j<arr.length - 1 - i ; j++) {
//				if (arr[j] > arr[j+1]) {
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//				System.out.println(Arrays.toString(arr));
//			}
//		}
		
		
	}
	
	Student findBy(int no) { //중복체크, 명명 규칙
		Student student = null;
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				student = students[i];
				return student;
			} 
		}
		return student;
	}

}
