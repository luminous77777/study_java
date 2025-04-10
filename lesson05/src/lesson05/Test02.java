package lesson05;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		int i =1 ;
		while( i <= num) {
			if(num % i == 0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
}
