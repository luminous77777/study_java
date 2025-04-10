package lesson05;

public class ForEx2 {
	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//			System.out.printf("i : %d, sum : %d\n", i, sum);
//		}
//		System.out.println(sum);
		
		int sum = 0;
		
		for (int i = 0; i <= 100/3; i ++) {
				sum += i * 3;
		}
		System.out.println(sum);
	}
}
