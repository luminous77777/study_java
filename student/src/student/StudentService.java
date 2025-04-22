package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService { // 핵심 로직 클래스
	private List<Student> students = new ArrayList<Student>();
	
	private List<Student> sortedStudents = new ArrayList<Student>();
	
//	private Student[] students = new Student[4];
//	private Student[] sortedStudents = new Student[students.length];
	
//	private int count = 0;
	
	
	
	{ // 초기화 블록. 기본값 매번 넣기 귀찮아서 있는것.
		
		students.add(new Student(1, "A", randScore(),randScore(),randScore()));
		students.add(new Student(2, "B", randScore(),randScore(),randScore()));
		students.add(new Student(3, "C", randScore(),randScore(),randScore()));
		students.add(new Student(4, "D", randScore(),randScore(),randScore()));
		
//		students[count++] = new Student(1, "A", randScore(), randScore(), randScore());//랜덤값을 적게 하기.

		
//		sortedStudents = Arrays.copyOf(students, students.length);
		sortedStudents.addAll(students);  // 이것을 해결해야
		rank();
	}
	
	private int randScore() {
		return (int)(Math.random()* 41 +60);
	}
	
	
	public void checkRange(String subject,int input ,int start, int end) { //범위체크, 예외처리 메서드
		boolean ret = true;
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위가 벗어났습니다." +start +"~"+end+"사이의 입력을 해주세요");
		}
	}
	public void checkRange(String subjectg, int input) { //오버로딩
		checkRange(subjectg, input,0,100);
	}
	
	public String inputName() {
		String name = StudentUtils.nextLine("이름 >");
		if(!(name.matches("^.{2,4}$"))) {
		throw new IllegalArgumentException("이름은 2 글자 이상, 4글자 이하여야 한다");
		}
		
		
		for (int i = 0; i < name.length(); i++) {
	    if (!(name.matches("^[가-힣]+$"))) {
	        throw new IllegalArgumentException("이름은 한글만 입력해야 합니다.");
	    }
	}
	return name;
	}
	
	
	
	
	// 학생 등록
	public void register() {
		System.out.println("등록가능");

		
//			if (count == students.length) { list로 변경했으므로 필요없어짐
//				students = Arrays.copyOf(students, students.length * 2);
//			}

			int no = StudentUtils.nextInt("학번 >");
//			if(findBy(no) != null) {
//				throw new Exception("중복된 학번입니다");
//			}else if(no < 0){
//				throw new Exception("0이상의 정수를 입려해주세요");
//			}
			
			Student s = findBy(no);
			if(s != null) {
				System.out.println("중복된 학번이 존재합니다");
				return;
			}
			
//			String name = StudentUtils.nextLine("이름 >");

			String name = inputName(); 

			
			int kor = StudentUtils.nextInt("국어 >");
			checkRange("국어",kor); //예외처리 메서드
			
			int eng = StudentUtils.nextInt("영어>");
			checkRange("영어",eng);
			int mat = StudentUtils.nextInt("수학 >");
			checkRange("수학",mat);

			
			students.add(new Student(no, name, kor, eng, mat)); //생성자 호출로 데이터 입력
			
			sortedStudents = List.copyOf(students);
			rank();
		
	}

	
	
	
	// 조회
	public void read() {
		System.out.println("조회 가능");
		print(students);

	}
	
	public void readOrder() { //석차순
		System.out.println("조회 기능");
		print(sortedStudents);
	}
	
	private void print(List<Student> stu) { // 단순 출력 기능
		for(int i = 0; i<stu.size() ;i++) {
			System.out.println(stu.get(i));
		}
	}

	// 수정
	public void modify() {
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		System.out.println("수정가능");
		int no = StudentUtils.nextInt("학번 >");

		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}

			int kor = StudentUtils.nextInt("국어 >");
			checkRange("국어",kor);
			
			int eng = StudentUtils.nextInt("영어>");
			checkRange("영어",eng);
			
			int mat = StudentUtils.nextInt("수학 >");
			checkRange("수학",mat);
			

			s.modify(kor, eng, mat); //setter로 하나씩 바꾸는 방법도 있다
			sortedStudents = List.copyOf(students);
			rank();

		
		

	}

	// 삭제
	public void remove() { // 학생배열에게 삭제할 인덱스 넘버를 제외하고 자기 자신에게 복사
		System.out.println("삭제기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 >");
		
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		
		for(int i = 0; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				students.remove(i);
//				System.arraycopy(students, i+1, students, i , count-- - 1 - i);
				break;
			}
		}
		
		sortedStudents = List.copyOf(students);
		rank();


	}
	
	//과목별 평균
	public void allAvg() {
		// 국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		
		
		for (int i = 0; i < students.size(); i++) { //모든학생의 국어 점수 출력
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat();
			avgAll += students.get(i).average();
		}
		avgKor /= (double)students.size();
		avgEng /= (double)students.size();
		avgMat /= (double)students.size();
		
		avgAll = (avgKor + avgEng + avgMat)/3;
		
		System.out.println(students.size() + "명 학생 평균");
		System.out.println("국어 평균" + avgKor);
		System.out.println("영어 평균" + avgEng);
		System.out.println("수학 평균" + avgMat);
		System.out.println("총 평균"+ avgAll);
	}
	
	
	//총점 정렬
	private void rank() { 
		System.out.println("학생들의 총점을 기준으로 석차정렬");
		
//		for(int i = 0 ; i < sortedStudents.size() - 1 ; i++ ) {
//			int idx = i; // 임시 인덱스
//			for(int j = 1 + i; j < sortedStudents.size() ; j ++) { //중복없이 모든 학생과 비교
//				if(sortedStudents.get(idx).total() > sortedStudents.get(j).total()) { //이전 리스트 보다 다음 리스트가 클 경우
//					idx = j; // 
//				}
//			}
//			
//		}
		
		
		for(int i = 0; i <sortedStudents.size() - 1 ;i++) {
			int idx = i;
			for(int j = 1 + i; j < sortedStudents.size() ; j++) {
				if(sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents.get(i);
			sortedStudents.set(i, sortedStudents.get(idx));
			
//			sortedStudents[i] = sortedStudents[idx];
			sortedStudents.set(idx, tmp);
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
	
	private Student findBy(int no) { //중복체크, 명명 규칙
		Student student = null;
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
				return student;
			} 
		}
		return student;
	}

}