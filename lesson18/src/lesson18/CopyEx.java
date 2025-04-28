package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CopyEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream file1 = new FileOutputStream("output2.txt");
		
		file1.write('A');
		file1.write('B');
		file1.write('B');
		file1.write('C');	
		
		FileInputStream file2 = new FileInputStream("output2.txt");
		FileOutputStream file3 = new FileOutputStream("output3.txt");
		
//		file3.wirte(fis.readAllByte()); //int 타입임으로 터질가능성 있음
		
		
//		while(true) {
//			int b = file2 .read();
//			if(b == -1) break;
//			file3.write(b);
//			
//		}
//		int b = 0;
//		while((b = file2 .read()) != -1) {
//			file3.write(b);
//		}
		
		byte[] bs = new byte[10];
		int length = 0;
		while ((length = file2.read(bs)) != -1) {
			file3.write(bs,0,length);
		}
		
		
		
		
//		byte[] bs = file2.readAllBytes();//
//		System.out.println(Arrays.toString(bs));
//		
//		for (byte b : bs) {
//			file3.write(b);
//		}
		
		file2.close();
		file3.close();
		
	}
}
