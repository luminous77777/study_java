package lesson01;

public class EscapeEx {
	public static void main(String[] args) {
		
		String greet = "안녕하세요, \n 저는 \"홍길동\" 입니다";
		String greet2 = "\t 반갑습니다";
		
		System.out.println(greet);
		System.out.println(greet2);
		
		
		int i =10;
		long l = 10;
		
		i = (int)l;
		System.out.println(i);
		
		byte b = 127;
		byte c = (byte)128;
		
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(2147483647));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Integer.toBinaryString(300));
		System.out.println((byte)300);
				
		
	}
}
