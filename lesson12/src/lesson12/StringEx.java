package lesson12;

import java.io.File;
import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcd1234abcd";
		
		System.out.println(str.length());
		
		//indexOf
		System.out.println(str.indexOf("d")); //첫글자 위치를 찾음
		System.out.println(str.indexOf("d2")); // 찾는것이 없을때 -1
		System.out.println(str.indexOf("d",4));// 4부터 찾기
		System.out.println(str.indexOf("d",4,10));// 4이상 10미만에서 찾기
		
		//lastIndexOf
		System.out.println(str.lastIndexOf("d"));//오른쪽에서 찾음
		System.out.println(str.lastIndexOf("d",4)); 
		
		//substring
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,10));
		
		// 첫번째 "c"에서부터 마지막 "c"위치까지 문자열 자르기
		System.out.print(str.substring(str.indexOf("c"),str.lastIndexOf("c"))+"\n");
		
		System.out.println(str.toUpperCase());
		System.out.println("++++++++++++++++++++++++++++++++++++");
		String[] fileNames = {"abcd.txt", "1234.txt", "abcd.exe", "abcd.bin"};
		//startwith와 endwith를 사용해서
		//확장자가 txt인 파일만 출력
		// 파일명이 abcd인 파일만 출력
		
		for(int i = 0; i < fileNames.length; i++){
			if(fileNames[i].startsWith("abcd")) {
				System.out.println(fileNames[i]);				
			}
			
			
		}
		for(int i = 0; i < fileNames.length; i++){
			if(fileNames[i].endsWith(".txt")) {
				System.out.println(fileNames[i]);
			}
		}
		for(String s : fileNames) {
			if(s.endsWith(".txt")){
				System.out.println(s);
			}
		}
		
		
		File dir = new File("C:\\Users\\TJ\\workspace_java_KYS");
		System.out.println(dir.isFile());
		System.out.println(dir.isDirectory());
		System.out.println("========================================");
		//lesson으로 시작하지 않는 이름만 출력
		String[] list = dir.list();
		
		for(String s : list) {
			if(!s.startsWith("lesson")) {
				System.out.println(s);				
			}
		}
		System.out.println("========================================");
		
		// 문자열 > 문자열 배열
		String[] strs = str.split("c");
		System.out.println(Arrays.toString(strs));
		// 문자열 배열 > 문자열
		System.out.println(String.join("+", strs));
		
		
		
		//문자열 > 문자 배열
		char[] chs = str.toCharArray();
		for(char c : chs) {
			System.out.print(c);
		}
		System.out.println();
		//문자 배열 > 문자열
		String str2 = new String(chs);
		System.out.println(str2);
		
	}
}
