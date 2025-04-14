package lesson06_2;

import java.util.Arrays;

public class ArrEx13 {
	public static void main(String[] args) {
		//초기의 배열
		//5개의 int 배열생성
		
		
		
		int[] arr = {10,20,30,40,50};
		
		
		//1번 방법
		//기존 배열의 두배의 길이를 가지는 배열을 생성
		int[] tmp = new int[arr.length *2];// 10개 짜리 배열을 생성
		
		//옮기기 방법
		System.out.println("arr의 원래 주소 :"+ arr);
		System.out.println("새 배열 tmp의 원래 주소 :"+ tmp);
		//1번 방법
		for(int i = 0; i<arr.length ; i++) {
			tmp[i] = arr[i];
		}
		//배열의 참조값 복사
		
		arr = tmp;
		System.out.println("arr의 복사된 주소 :"+ arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		//2번
		int[] arr2 = {10,20,30,40,50};
		int[] tmp2 = new int[arr2.length *2];
		
		System.arraycopy(arr2, 1, tmp2, 1, 3);
		System.out.println(Arrays.toString(tmp2));
		
		int[] arr3 = Arrays.copyOf(arr2, 20);
		System.out.println(Arrays.toString(arr3));
		
		int[] result = {1,2,3};
		result= Arrays.copyOf(result, result.length*2);
		System.out.println(Arrays.toString(result));
		                                                                                                                                                                     
		String a = "abc";
		System.out.println(Integer.toHexString(a.hashCode()));
		String b = "BCD";
		System.out.println(Integer.toHexString(b.hashCode()));
		a = b;
		System.out.println(Integer.toHexString(a.hashCode()));

	}
}
	