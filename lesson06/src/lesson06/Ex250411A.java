package lesson06;

import java.util.Arrays;

public class Ex250411A {
	public static void main(String[] args) {
		//18700원
		// 1.50000,10000,5000,1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		/*
		int money = 187000;
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];
//		count[0] = money /units[0]; //3 = 18700 => 37000
//		money %= units[0];
		
		for(int i = 0; i<units.length ; i++) {
			count[i] = money /units[i]; //3 = 18700 => 37000
			money %= units[i];
			System.out.printf("%d원 %d장 \n", units[i],count[i]);
		}
		*/
		//이하 코드 작성 후 갯수 출력
		
		//2. 임의의 문자열 생성 , CAPTCHA 생성
		//문자열의 범위는 숫자,영대,영소 10글자
		
		String captcha = "";
		// 난수위 범우 0~61, 0~9는 그대로 숫자, 10~35까지는 숫자, 36~이상은 영소
		
		for(int i = 0; i<10; i++) {
			int ch = (int)(Math.random() *62);
			if(ch <10) { // 0~9
				captcha += ch;
				
				//captcha[i] = (char)(ch + '0' - 0)
			}
			else if(ch <36) { //10~35
				captcha += (char)(ch +'A' -10); //ch
			}
			else { // 36~60
				captcha += (char)(ch + 'a' -36);
			}
		}
		System.out.println((int)'A');
		System.out.println(captcha);
		
		
		//3.빈도수 구하기
		//100개의 공간, 범위는 0~9;
		int[] arr = new int[100];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] counts = new int[10];
		
		for(int i = 0; i < arr.length ; i++) {  // arr[1]이 0인경우 counts[0]의 값이 올라간다.
			counts[arr[i]]++;
		}
		System.out.println(Arrays.toString(counts));
	}
}
