package lesson06_2;

import java.util.Arrays;


public class ArrEx16 {
	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		
		//index for
		//배열 내부의 값을 변경 가능
		for(int i = 0; i < arrInt.length ; i++) {
			arrInt[i] = arrInt.length - arrInt[i];
			
			System.out.println(arrInt[i]);
		}
		System.out.println();
		
		//향상된 for(Enhanced for)
		//값 변경불가
		for(int number : arrInt) {
			number = 10;
			System.out.println(number);
		}                                            
		System.out.println(Arrays.toString(arrInt));
		System.out.println("=============================");
		//2차배열
		int[][]	arr = {{1,2,3}, {4,5}};
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		//향상 for문
		for(int[] tmp : arr) {
			for(int n : tmp) {
				System.out.println(n);
			}
		}
		//챗 gpt 검색
		int age = 30;
		String name = "1234"; // name 는 1234 라는 값이 있는 객체 주소를 참조
		String name2 = "1234"; // name2 는 1234 라는 값이 있는 객체 주소를 참조
		String n = new String("1234"); // String -> String 객체 생성 //공간을 새로 만든다->값이 같은 것이 있으면 주소를 넣는다.
		System.out.println("====================");
		System.out.println(name);
		System.out.println(name2); 
		System.out.println(n);
 
		
		System.out.println(n.equals(name));
	}
}
