package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class FileDownloader {
	public static void main(String[] args) throws Exception {
		String img = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjBfMjEx%2FMDAxNzQyMzk3MTc1OTQz.fbtocNfXfrFKvFvfgf9otFH3sfLQwzsel8fEBk8gWaQg.ZeZBhEao3PLDHuffz6E1Ge-e6104_8eEnV4a_eHAswsg.PNG%2Fc60dc48e-a964-45d3-8563-9cf387e718eb.png&type=a340";
	
		URL url = new URL(img);
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("cat.png");
		
		int b = 0;
		while( (b = is.read()) != -1 ) {
			fos.write(b);
		}
		fos.close();
	}
}