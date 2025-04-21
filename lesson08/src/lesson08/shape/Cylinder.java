package lesson08.shape;

public class Cylinder extends Shape implements Shape3D{ //원기둥
	
	Circle circle;
	int z;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	Cylinder(Circle circle, int z){
		this.circle = circle;
		this.z = z;
	}
	
	public double area() {
		return circle.area() *2 + circle.circum() *2;
	}
	
	public double volume() {
		return circle.area()* z;
		
	}
	

}
