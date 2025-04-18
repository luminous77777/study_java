package lesson06;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		// 정렬
		
		System.out.println("================버블정렬==============");
		int[] arr = {5,3,2,1,4};
		
		//버블 정렬
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
		System.out.println("================선택정렬==============");
		//선택정렬
		int[] arr1 = {5,3,2,1,4};
		
		//탐색 n 번 최솟값 
		
		
		for(int i = 0; i <arr1.length - 1 ;i++) {
			int idx = i;
			for(int j = 1 + i; j < arr1.length ; j++) {
				if(arr1[idx] > arr1[j]) {
					idx = j;
				}
			}
			int tmp = arr1[i];
			arr1[i] = arr1[idx];
			arr1[idx] = tmp;
			
			System.out.println(Arrays.toString(arr1));

		}		
	}
}
