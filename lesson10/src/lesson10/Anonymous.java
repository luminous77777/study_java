package lesson10;

import java.util.Arrays;
import java.util.Comparator;

public class Anonymous {
	public static void main(String[] args) {
		//익명 이름을 숨김
		
		Runnable runnable = new Runnable() { // run 메서드 선언 . 추상메서드 구현 책임
			
			
			@Override
			public void run() {
				System.out.println("실행");
				
			}

		};
		
		runnable.run();
		
		Outer outer = new Outer(){
			void m() {
				System.out.println("오버라이드 메서드");
			}
		};
		outer.m();
		
		Integer[] arr = {1,4,1,2,3};
		
		Comparator<Integer> iter = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		};
		
		Arrays.sort(arr, iter);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
