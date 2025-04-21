package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println(circle.area()); //넓이
		System.out.println(circle.circum()); // 둘래
		
		Rect rect = new Rect(4,5);
		System.out.println(rect.area());
		System.out.println(rect.circum());
		
	
		
		Cylinder cylinder = new Cylinder(new Circle(4),5);
		Shape[] shapes = {cylinder};
		
		System.out.println(shapes[0].area());
		if(shapes[0] instanceof Plane2D) {
			System.out.println("둘레 : " + ((Plane2D) shapes[0]).circum());
		}else if(shapes[0] instanceof Shape3D){
			System.out.println("부피 : " + (Shape3D)shapes[0].volume));
		}
	}
}
