package lesson08.shape;

public abstract class SolidShape implements Shape{ //입체도형
	
	private double height;
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public abstract double surfaceArea(); //겉넓이
	
	public abstract double volume(); //부피
}
