package lesson06;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		// 정렬
		//버블 정렬
		
		//{3,4,1,5,2}
		
		// 34152
		// 31452
		// 31452
		// 31425
		
		// 13425
		// 13425
		// 13245
		
		// 13245
		// 12345
		
		// 12345
	
		int[] arr = {5,4,3,2,1};
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println(i+1+"회차");
			for(int j = 0; j<arr.length - 1 - i ; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
	}
}
