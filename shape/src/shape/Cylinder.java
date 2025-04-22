package shape;

public class Cylinder extends Shape implements Shape3D{
	Circle circle;
	int z;
	
	Cylinder() {
	}
	
	Cylinder(Circle circle, int z) {
		this.circle = circle;
		this.z = z;
	}

	@Override
	public double volume() {
		return circle.area() * 2 + circle.circum() * z;
	}

	@Override
	public double area() {
		return circle.area() * z;
	}
}
