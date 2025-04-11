package lesson06;

public class MinMax {
	public static void main(String[] args) {
		int[] arr = {10,1,3,5,6};
		//최대 최소값 구하기
		
		
		int max = arr[0] ,min = arr[0];
		for(int i = 1; i < arr.length ; i ++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값은? " + max);
		System.out.println("최소값은? " + min);
		
		//합계, 평균
		
		int sum = 0, avg;
		
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println("합계는 ? " +sum);
		System.out.println("평균은 ? " +avg);	
	}
	
}
