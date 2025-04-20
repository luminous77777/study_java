package lesson08.shape;

public class Cylinder extends SolidShape{ //원기둥
	
	int r;
	final double PI = Math.PI;
	double height;
	
	
	public Cylinder(int r, double height) {
		this.r = r;
		setHeight(height);
	}

	@Override
	public double surfaceArea() {
		
		return 2*PI*r*getHeight() + 2*PI*r*r;
	}

	@Override
	public double volume() {
		return PI*r*r*getHeight();
	}

}
