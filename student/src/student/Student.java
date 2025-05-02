package student;

import java.io.Serializable;
import java.lang.Thread.Builder;

// Data class
public class Student implements Comparable<Student>, Serializable{
	
	//인스턴스 변수로 대부분 구성
	//고유키
	private int no;
	private String name;
	private int kor = 1;
	private int eng;
	private int mat;

	
	public Student() { //기본 생성자
		
	}
	
	
	
	public Student(int no, String name){ //학번과 이름만 넣는 생성자, 괄호 안에 넣는 그대로 보인다
		this.no = no;
		this.name = name;
	}
	
	public Student(int no, String name, int kor, int eng, int mat){
		this(no,name); // 나의 다른 생성자 호출
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	
	public int total() { //합계 기능을 처리하는 메서드
		return kor+eng+mat;
	}
	
	public double average() { //평균기능을 처리하는 메서드
		return total()/3d; //출력되는 타입을 신경쓰자
	}
	
	public void modify(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		return ;
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no,name,kor,eng,mat, average(), total());
	}



	@Override
	public int compareTo(Student o) {

		return name.compareTo(o.name);
	}
	
	
	static Builder builder() {
		return new Builder();
	}
	static class Builder{
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Builder no(int no){
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder kor (int kor) {
			this.kor = kor;
			return this;
		}
		public Builder eng (int eng) {
			this.eng = eng;
			return this;
		}
		Builder mat (int mat) {
			this.mat = mat;
			return this;
		}
		Student build() {
			return new Student(no, name, kor, eng, mat);
		}
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
	public static void main(String[] args) {
		Student student = Student.builder().no(1).name("김").kor(90).build();
		System.out.println(student);
	}
	
}
