package lesson06;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int idx = 0;
		
		while(true) {  // 무한루프
			int number = (int)(Math.random() * 45 +1);  //정수값 1부터 45까지 랜덤 출력
			
			boolean insert = true; //insert 기본값 선언
			
			
			//중복체크
			for(int i=0; i <= idx ; i ++) { //배열내의 값을 중복 체크
				if(lotto[i] == number) {
					insert = false;
					break; //for 문의 break;
				}
			}
			//배열에 값 입력
			if(insert) {  // 위 for문에서 false가 나오면 실행 하지 않음
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break; //while의 브레이크
		}
		//System.out.println(Arrays.toString(lotto));
		
		//정렬
		int[] arr = lotto;
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
