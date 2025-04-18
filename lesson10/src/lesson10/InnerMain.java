package lesson10;

public class InnerMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		
		Outer.Inner i; //Inner 객체
		Outer.SInner si;// SInner 객체
		
		i= outer.new Inner();
		
//		i = new Outer().new Inner();  //맴버 클래스의 인스턴스
		si = new Outer.SInner(); //로컬
	}
}

class Outer{
	class Inner{ //인스턴스 변수의 특징을 가진다
		
	}
	
	static class SInner{ //로컬 클래스
		
	}
	
	void m() {
		class Local{ //지역 클래스
			
		}
	}
}
