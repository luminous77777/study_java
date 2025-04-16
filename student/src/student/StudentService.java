package student;

import java.util.Arrays;

public class StudentService { //핵심 로직 클래스 
	Student[] students = new Student[2];
	int count =0;
	
	
	//학생 등록
	void register() {
		System.out.println("등록가능, 학번은 0번부터");
		
		if(count >= students.length) {
			students= Arrays.copyOf(students, students.length*2);
		}
		
		
		int no = StudentUtils.nextInt("학번 >");
		String name = StudentUtils.nextLine("이름 >");
		int kor = StudentUtils.nextInt("국어 >");
		int eng = StudentUtils.nextInt("영어>");
		int mat = StudentUtils.nextInt("수학 >");
		students[count++] = new Student(no, name,kor, eng, mat);
		
		
		
		
		
//			students[0].no = StudentUtils.nextInt("학번을 입력하세요");
//			students[0].name = StudentUtils.nextLine("이름을 입력하세요");
//			students[0].kor = StudentUtils.nextInt("국어점수를 입력하세요");
//			students[0].eng = StudentUtils.nextInt("영어점수를 입력하세요");
//			students[0].mat = StudentUtils.nextInt("수학점수를 입력하세요");
			
			
	}
	
	
	//조회
	void read() {
		System.out.println("조회 가능");
		
		for(int i = 0; i<count ; i++) {
			if(students[i]==null) {
				
			}else
			System.out.println(students[i].no+ ","+students[i].name+","+students[i].total()+","+students[i].average());
		}
		
		
//		System.out.println("학번은 : "+students[0].no);
//		System.out.println("이름은 : "+students[0].name);
//		System.out.println("국어점수 : "+students[0].kor);
//		System.out.println("영어점수 : "+students[0].eng);
//		System.out.println("수학점수 : "+students[0].mat);
//		
//		int sum = students[0].kor + students[0].eng + students[0].mat;
//		System.out.println("합계는 " + sum);
//		System.out.println("세 과목의 평균은 " + sum/3);
		
	}
	
	
	//수정
	void modify() {
		System.out.println("수정가능, 학번은 0번부터");
		int no = StudentUtils.nextInt("학번 >");
		
		for(int i = 0; i<count ; i++) {
			if(students[i].no == no) {
				System.out.println("입력한 학번은 "+students[i].no);
				int kor = StudentUtils.nextInt("국어 점수 수정 >");
				int eng = StudentUtils.nextInt("영어 점수 수정>");
				int mat = StudentUtils.nextInt("수학 점수 수정>");
				
				students[i].modify(kor, eng, mat);
			}
		}

		
	}
	
	
	//삭제
	void remove(){
		System.out.println("삭제 가능, 학번을 입력하세요");
		int no = StudentUtils.nextInt("학번 >");


		
		for(int i = 0; i<count ; i++) {
			if(students[i].no == no) {
				System.out.println("입력한 학번은 "+students[i].no);
				students[i] = null; //해당배열이 삭제
			}
		}
		

	}

}
