package lesson07_3;

public class Access {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.getI());
		target.setI(100);
		
		System.out.println(target.getI());
	}
}

class Target {
	private int i;
	
	
	//getter
	public int getI() {
		return i;
	}
	//setter
	public void setI(int i) {
		
		if(i >= 0 && i <= 100) { //입력받는 값의 제한
			this.i = i;			
		}
	}
}