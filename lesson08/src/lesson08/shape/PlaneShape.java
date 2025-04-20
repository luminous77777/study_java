package lesson08.shape;

public abstract class PlaneShape implements Shape{ //abstract를 사용해서 추상클래스가 되었다
	public abstract double circum(); //도형의 둘래
	
	
//	{ //구현부는 의미가 없음 추상메서드 가 될수 있따
//		return 0;
//	}
	
	
	
	public abstract double area(); //도형의 넓이
	
//	{
//		return 0;
//	}
}
