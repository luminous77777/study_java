package lesson07;

import java.util.Arrays;

public class Ex250414_A {
	public static void main(String[] args) {
		//1.피보나치 출력
		/*
		int a= 1;
		int b = 0;
		
		for(int i = 0 ; i < 20;i++) {
			int c = a + b;
			System.out.print(c+ " ");
			a = b;
			b = c;
		}
		*/
		/*
		  1 1 2
		  	1 2 3
		  	  2 3 5
		  	    3 5 8
		 
		 */
		
		
		//2.20개의 난수 50개의 배열 생성, 새로운 중복 제거 배열
		/*
		int[] arr = new int[50];
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random() * 20 + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] tmp = new int[20];
		int length = 0;
		boolean insert = true;
		
		for(int n : arr) {
			for (int i =0 ; i <length ; i++) {
				if(n == tmp[i]) {
					insert = false;
					break;
				}
			}
			if(insert) {
				tmp[length++] = n;
			}
		}
		
		System.out.println(Arrays.toString(tmp));
		tmp = Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		*/
		
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		int[][] result = new int[3][3];
		
		result[0][2] = val[0][0];  // 1
		result[1][2] = val[0][1];  // 2
		result[2][2] = val[0][2];  // 3
		
		result[0][1] = val[1][0];
		result[1][1] = val[1][1];
		result[2][1] = val[1][2];
		
		result[0][0] = val[2][0];
		result[1][0] = val[2][1];
		result[2][0] = val[2][2];
		
		
		for(int i = 0; i < val.length; i++) {
			for(int j = 0 ; j < val[i].length; j++) {
				System.out.print(val[i][j]+" ");
				result[j][3-1-i] = val[i][j];
			}
			System.out.println();
		}
		
		for(int[] t : result) {
			for(int n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
		/*
			741
			852
			963
		*/
		
		char[][] chs= {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		
		char[][] result2 = new char[5][5];
		for(int i = 0; i < chs.length; i++) {
			for(int j = 0 ; j < chs[i].length; j++) {
				System.out.print(chs[i][j]+" ");
				result2[j][5-1-i] = chs[i][j];
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(char[] t : result2) {
			for(char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}
}