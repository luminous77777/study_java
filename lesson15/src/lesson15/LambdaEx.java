package lesson15;

public class LambdaEx {
	public static void main(String[] args) {
//		MyInter inter = new MyInter() {
//			
//			@Override
//			public int la(int i) {
//				// TODO Auto-generated method stub
//				return i * i;
//			}
//		};
		MyInter inter = i -> i * i;
		
		Runnable runnable = () -> {
			System.out.println("Runnable");
		};
		runnable.run();
		
		System.out.println(inter.la(10));
		
	}
}

@FunctionalInterface
interface MyInter{
	int la(int i);
}

