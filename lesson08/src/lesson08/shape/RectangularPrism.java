package lesson08.shape;

public class RectangularPrism extends Shape3D{ //육면체

	int x,y;
	
	public RectangularPrism(int x, int y, double height) {
		this.x = x;
		this.y = y;
		setHeight(height);
	}
	
	@Override
	public double surfaceArea() {
		
		return 2*x*y+2*x*getHeight()+2*getHeight()*y;
	}

	@Override
	public double volume() {
		
		return x*y*getHeight();
	}

}
