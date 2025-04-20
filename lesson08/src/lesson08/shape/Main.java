package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println(circle.area()); //넓이
		System.out.println(circle.circum()); // 둘래
		
		Rect rect = new Rect(4,5);
		System.out.println(rect.area());
		System.out.println(rect.circum());
		
		
		PlaneShape rightT = new RightTright(3,4);
		System.out.println("========" + rightT.getClass().getSimpleName()+"============");
		System.out.println(rightT.area());
		System.out.println(rightT.circum());
		
		SolidShape triP = new TriangularPrism(3,4,4.0);
		System.out.println("========" + triP.getClass().getSimpleName()+"============");
		System.out.println(triP.surfaceArea());
		System.out.println(triP.volume());

		
		SolidShape recP = new RectangularPrism(3,4,4.0);
		System.out.println("========" + recP.getClass().getSimpleName()+"============");
		System.out.println(recP.surfaceArea());
		System.out.println(recP.volume());

		SolidShape cylin = new Cylinder(3,4.0);
		System.out.println("========" + cylin.getClass().getSimpleName()+"============");
		System.out.println(cylin.surfaceArea());
		System.out.println(cylin.volume());
		
		
		
//		PlaneShape[] shapes = {circle, rect}; //? 이 객체는 어디서 생성 되었는가?
		
		PlaneShape[] shapes = {circle, rect};
		
		for(int i = 0; i<shapes.length ; i++) {
			System.out.println("========" + shapes[i].getClass().getSimpleName()+"============");
			
			System.out.println(shapes[i].area());
			System.out.println(shapes[i].circum());
		}
	}
}
