package lesson07_2;

import java.util.Scanner;

public class Overloading {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Operator op = new Operator();
		
		System.out.println(op.multiply(5, 8));
		System.out.println(op.multiply(5, 8.5));
		System.out.println(op.multiply(5.5, 8));
		System.out.println(op.multiply(5.5, 8.5));
	}
}

class Operator{
	int multiply(int x, int y) {
		System.out.println("(int,int)");
		return x*y;
	}
	
	double multiply(int x, double y) {
		System.out.println("(int,double)");
		return x*y;
	}
	
	double multiply(double x, int y) {
		System.out.println("(double,int)");
		return x*y;
	}
	
	double multiply(double x, double y) {
		System.out.println("(double,double)");
		return x*y;
	}

}
