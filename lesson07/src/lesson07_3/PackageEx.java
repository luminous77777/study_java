package lesson07_3;

import java.util.Date;
import java.util.*;

//import lesson07.TvMain;

public class PackageEx {
	public static void main(String[] args) {
//		TvMain main = new TvMain();//import로 가져와 사용가능한 상태
		lesson07.TvMain main = new lesson07.TvMain();// 07패키지의 TvMain을 호출

		java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in); //디 컴파일시 이런식으로 출력되어있다.
		Scanner scanner2 = new java. util.Scanner(java.lang.System.in);
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString());
	}
}
