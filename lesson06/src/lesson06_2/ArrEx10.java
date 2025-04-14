package lesson06_2;

import java.util.Arrays;

public class ArrEx10 {
	public static void main(String[] args) { //폴더 처럼 이해
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(arr[0][1]); //출력 내용은 int 타입
		
		String[][][] strs = {{},{{"A","B","C"},{"가","나","다"},{"1","2"}},{{}}}; //strs.length= 3개
		
		System.out.println(strs.length);
		System.out.println(strs[1]); //출력 타입은 string 2차원 배열 타입
		System.out.println(strs.length);
		System.out.println(strs[1][1]); //출력 string 1차원 배열 타입
		System.out.println(strs[1][1][1]); //출력은 String값
	}
}
