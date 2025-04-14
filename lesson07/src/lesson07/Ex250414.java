package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		//1. 피보나치 수열 출력 
				//반복문 관련 배열은 아님
				// 피보나치수열 숫자 20 개 출력
				// 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속
				/*
				int FibonacciSequence = 1; //시작값
				int number=1, tmp = 0;
				for(int i = 0 ; i<20; i++) {
					System.out.print(FibonacciSequence+" ");
					FibonacciSequence = tmp + number;
					tmp = number;
					number = FibonacciSequence;
				}
				*/
				
				//2.50개의 길이를 가지는 정수 배열, 각 값은 1~20사이의 숫자로 채우기
				//이후 중복된 값을 제거한 새로운 배열을 생성
				
				int[] arr1 = new int[10];
				int[] arr2 = new int[10];
				int count =0;
				
				
				
				for(int i=0; i<arr1.length; i++) {
					arr1[i] = (int)(Math.random()* 20 +1);
					
					
					}
				System.out.println(Arrays.toString(arr2));
				
				
				}
				
				//3. 2차월 배열문제
				//특정패턴. 별로 만들것. 2차월 배열로 구성
				/*
				 * **
				 * **
				 * **
				 * *****
				 * ***** 
				 * */
				
				/*
				char[][] chs= {
						{'*','*',' ',' ',' '},
						{'*','*',' ',' ',' '},
						{'*','*',' ',' ',' '},
						{'*','*','*','*','*'},
						{'*','*','*','*','*'}
				};
				
				//90도 시계방향 회전의 결과를 result에 담으시오
				char[][] result = new char[5][5];
				// 여러번 사용할 수 있도록 만들어라
				
				//임의의 값 중복제거.
				*/
	}
