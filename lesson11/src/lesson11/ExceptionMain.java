package lesson11;

public class ExceptionMain {
	public static void main(String[] args) {
		//try catch finally throw throws
		
		System.out.println(1);		
		try {
			System.out.println(2);
			System.out.println(args[0]);
			System.out.println(3/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		} catch (NullPointerException e) {
			System.err.println("a");
		}
		catch(RuntimeException e) {
			System.out.println("b");
		}
		
		
		System.out.println(6);		
		
	}
}
