package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
		List<Integer> l =new ArrayList<Integer>(Arrays.asList(10,20,30,50,80,15,1,5,478,9,12,3,5,1,35));
		System.out.println(l);
//		Arrays.asList(new Integer[] {10,20,30});//위와 같은식
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		};
		
		l.sort(comparator);
		System.out.println(l);
		
//		l.sort(new Comparator<Integer>(){
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2- o1;
//			}
//			
//		});
		
//		l.sort((Integer o1, Integer o2) -> {
//			return o2 - o1;
//			});
		
//		l.sort((o1,o2) -> o2- o1);
		
	}
}
