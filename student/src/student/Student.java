package student;

// Data class
public class Student {
	
	//인스턴스 변수로 대부분 구성
	//고유키
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	
	public Student() { //기본 생성자
		
	}
	
	
	
	public Student(int no, String name){ //학번과 이름만 넣는 생성자, 괄호 안에 넣는 그대로 보인다.
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
	
}
