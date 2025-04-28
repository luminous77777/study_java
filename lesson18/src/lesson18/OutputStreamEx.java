package lesson18;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output.txt", true);
		fos.write('A');
		fos.write('B');
		fos.write('C');
		byte[] bs = {' ',48,49,50,51};
		fos.write(bs);
		
		fos.write(13);
		fos.write(10);
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		//A-Z 문자 첫줄
		//a-z 문자 둘째줄
		//0-9 문자들은 셋째줄에 표현
		FileOutputStream fos2 = new FileOutputStream("test.txt");
		for(int i = 'A' ; i <= 'Z' ; i++) {
			fos2.write(i);
		}
		fos2.write(10);
		for(int i = 'a' ; i <='z' ; i++) {
			fos2.write(i);
		}
		fos2.write('\n');
		for(int i = '0' ; i <='9' ; i++) {
			fos2.write(i);
		}
		
		
		fos.close();
		}
}
