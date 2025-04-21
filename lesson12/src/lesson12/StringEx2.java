package lesson12;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "";
		long start = System.currentTimeMillis();
		//1970.01.01 00:00:00 시작해서 현재까지 흘러간 ms
		//간격계산의 목적으로 사용, D - day
		
		for(int i = 0 ; i<300000;i++) {
//			str +="0";
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		System.out.println(str.length());
		System.out.println(System.currentTimeMillis());
		
		System.out.println("========================== String Buffer");
		StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 0 ; i<30000;i++) {
		sb.append("0");
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		System.out.println(sb.length());
		
		//String > StringBufffer
		StringBuffer sb2 = new StringBuffer(str);
		//StringBuffer > String
		String str2 = sb2.toString();
		
		
	}
}
