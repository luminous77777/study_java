package lesson08.shape;

public class RightTright extends PlaneShape {

	int x,y;
	
	public RightTright() {
	}
	
	public RightTright(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double circum() { //넓이
		
		return x+y+(Math.sqrt(x*x+y*y));
	}

	@Override
	public double area() { //넓이
		// TODO Auto-generated method stub
		return (x*y)/2;
	}
	
	

}
