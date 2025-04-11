package lesson06;

import java.util.Arrays;

public class ArrEx1 {
	public static void main(String[] args) {
		int i = 10;
		
		//배열 초기화
		int[] arr = {10,20,30, 50};
		
		System.out.println(i);

		//배열의 값에 접근 >> index
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		arr[0] = 60;
		
		arr[1] = arr[2];
		
		arr[3] = i;
		System.out.println("==================");
		System.out.println(arr[1]);
		
		int[] arr1 = {1,2,3}; // 값을 이용한 초기화
		
		int[] arr2 = new int[3]; //길이를 통한 초기화 기본값 영으로 0기화
		
		int[] arr3 = new int[] {5,6,7,8}; //정석적인 초기화
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
	}
} 
