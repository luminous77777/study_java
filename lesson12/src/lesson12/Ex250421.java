package lesson12;

import java.net.URL;
import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=71o2wt49";
		// 프로토콜 ://도메인/파일명?쿼리스트링(파라미터)
		// 1. 위 항목에 맞춰 문자열 자르기
		// 2. 쿼리 스트링 추출후. 쿼리스트링은 키=값1&키=값2&....
		
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println(protocol);
//		url = url.substring(url.indexOf("://")+"://".length());
//				
//		String domain = url.substring(0,url.indexOf("/"));
//		System.out.println(domain);
//		url = url.substring(url.indexOf("/")+"/".length());
//				
//		String fileName = url.substring(0,url.indexOf("?"));
//		System.out.println(fileName);
//		url = url.substring(url.indexOf("?")+"?".length());
//		
//		
//		String queryString = url;
//		System.out.println(queryString);
		
		MyUrl myUrl = new MyUrl(url);
		System.out.println(myUrl);
		
		
		
		
		
//		protocol = url.substring(0,url.indexOf("://"));
//		url = url.substring(url.indexOf("://"));
//		domain =url.substring(3,url.lastIndexOf("/"));
//		url = url.substring(url.lastIndexOf("/"));
//		fileName=url.substring(1,url.lastIndexOf("?"));
//		url = url.substring(url.lastIndexOf("?"));
//		queryString = url.substring(1);
//		
//		System.out.println("프로토콜   :"+protocol);
//		System.out.println("도메인     :"+domain);
//		System.out.println("파일이름   :"+fileName);
//		System.out.println("쿼리스트링 :"+queryString);
//		
//		// 문자열 > 문자열 배열
//		String[] strs = queryString.split("&");
//		String[] key = new String[strs.length];
//		String[] value = new String[strs.length];
//		for(int i=0; i< strs.length; i++) {
//			key[i]=strs[i].substring(0, strs[i].indexOf("="));
//			value[i]=strs[i].substring(strs[i].indexOf("=")+1);
//			
//			System.out.print("키"+ i+ "의 내용 :"+key[i]+" ");
//			System.out.println("값"+ i+ "의 내용 :"+value[i]);
			
		}
		
	}

class MyUrl{
	String portocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;
	
	public MyUrl(String url) {
		portocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://")+"://".length());
				
		domain = url.substring(0,url.indexOf("/"));
		url = url.substring(url.indexOf("/")+"/".length());
				
		fileName = url.substring(0,url.indexOf("?"));
		url = url.substring(url.indexOf("?")+"?".length());
		
		queryString = url;
		String[] tmps = queryString.split("&");
		params = new Param[tmps.length];
		for(int i = 0; i < tmps.length ; i++) {
			String[]t = tmps[i].split("=");
			params[i] = new Param(t[0], t[1]);
		}
		
		
	}
	// code 자주사용되는 기능 > 자동생성 //source 메뉴
	@Override
	public String toString() {
		return String.format("MyUrl [portocol=%s, domain=%s, fileName=%s, queryString=%s,\n params=%s]", portocol, domain,
				fileName, queryString, Arrays.toString(params));
	}




	class Param{
		
		String key;
		String value;
		
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		@Override
		public String toString() {
			return String.format("Param [key=%s, value=%s]", key, value);
		}
	}
	
}


