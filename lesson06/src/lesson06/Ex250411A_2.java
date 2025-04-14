package lesson06;


public class Ex250411A_2 {
	public static void main(String[] args) {
		
		//1. 5의 배수
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			if(i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("합계는" + sum);
		
		//2. 1~100까지 짝홀의 합
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 2 ==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("짝수합" + evenSum);
		System.out.println("짝수합" + oddSum);
		
		//3. 두개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를 출력
		for(int x = 1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x+y ==6)
					System.out.println("x : "+x+", y : "+y);
			}
		}
		
		// 별찍기
		for(int i = 0; i<5 ; i++) {
			for(int j =0; j<5; j++) {
				if(j<=i) {
					System.out.print("*");					
				}
				else{
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
		for(int i = 0; i<5 ; i++) {
			for(int j =0; j<5; j++) {
				if(j >=i) {
					System.out.printf("(%d,%d)",i,j);					
				}else {
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i<5 ; i++) {
			for(int j =0; j<5; j++) {
				if(i + j <= 4) {
					System.out.printf("(%d,%d)",i,j);					
				}else {
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i<5 ; i++) {
			for(int j =0; j<5; j++) {
				if(i + j <= 4) {
					System.out.printf("(%d,%d)",i,j);					
				}else {
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
		
		//마름모 //중심값을 옮긴다
		for(int i = -2; i<3 ; i++) {
			for(int j =-2; j<3; j++) {
				if(i*j <2 && i*j > -2) {
					System.out.printf("(%2d,%2d)",i,j);					
				}else {
					System.out.printf("%7c",' ');
				}
			}
			System.out.println();
		}
		
		// 주사위 눈 6이 나올때까지 굴린수.
		int count = 0;
		int dice = 0;
		
		while(dice != 6) {
			dice = (int)(Math.random()*6+1);
			count++;
			System.out.printf("(%d)\n", dice);
		}
		System.out.println("총 주사위 횟수 : " +count);
	}
}
