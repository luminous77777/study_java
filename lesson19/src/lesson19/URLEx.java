package lesson19;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException {
		String addr = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjRfMzYg%2FMDAxNzQyNzgyMjkxODYy.nmS2GAOA1wJQU6otynSfN4dxLKEb_qGzRVKNSsYbSwUg.njdPDRkv1BIF_JoBXBKFdLzhDfUqyrHfSodTzlttvlAg.PNG%2F110949.png&type=a340#abcd";
		URL url = new URL(addr);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getFile());
		System.out.println(url.getQuery());
		System.out.println(url.getRef());
	}
}
