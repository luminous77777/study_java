package lesson18;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("file.txt");
//		int b = fis.read();
//		System.out.println(b); // 문자 1에 대한 코드가 출력
//		b= fis.read();
//		System.out.println(b);
//		b = fis.read();
//		System.out.println(b);
		
//		for(int i = 0; i < 24; i++) {
//			int b = fis.read();
//			System.out.println(b + " :: " + (char)b);
//		}
//		int b = fis.read();
//		System.out.println(b);  // EOF(End Of File)에 도달시 -1
//		int b = 0;
//		while((b = fis.read()) != -1 ) {
//			System.out.println(b + "::" +(char) b );
//		}
		
//		byte[] bs = new byte[50]; //->읽을수 있는 바이트 수까지
////		int ret = fis.read(bs);
////		System.out.println(Arrays.toString(bs));
////		System.out.println(ret);
//		
//		
//		int ret2 = fis.read(bs, 5 , 10);
//		System.out.println(Arrays.toString(bs));
//		System.out.println(ret2);
		
		byte[] bs = fis.readAllBytes();//
		System.out.println(Arrays.toString(bs));
		fis.close();
	}
}
