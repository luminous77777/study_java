package lesson08.shape;

public class TriangularPrism extends SolidShape{ // 직각삼각 기둥

	int x,y;
	double height;
	
	public TriangularPrism(int x, int y, double height ) {
		this.x = x;
		this.y = y;
		setHeight(height);
	}
	
	@Override
	public double surfaceArea() {
		
		return x*y + x*getHeight()+ y*getHeight()+ Math.sqrt(x*x+y*y)*getHeight();
	}

	@Override
	public double volume() {
		return (x*y)/2 * getHeight();
	}

}
