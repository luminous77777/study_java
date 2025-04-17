package student;

import java.util.Arrays;

public class arrarydel {
	public static void main(String[] args) { //인덱스 삭제 코드 예시
		int[] arr = {1,2,3,4,5};
		
		int idx = 0; //0,번 인덱스 삭제
		
		System.arraycopy(arr, idx+1, arr, idx, arr.length -1 - idx);
		System.out.println(Arrays.toString(arr));
	}
}
