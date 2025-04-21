package lesson12;

public class WrapperEx {
	public static void main(String[] args) {
		int i = 10;
		
		Integer i2 = 20;
		
		System.out.println(i + i2);
		
		// 기본형 > wrapper (boxing)
		Integer i3 = Integer.valueOf(i);
		
		// wrapper > 기본형 (unboxing)
		int i4 = i2.intValue();
		
		// auto boxing
		Integer i5 = i;
		int i6 = i2;
		
		m(10l); // 오토 박싱. -> 오토박싱이나 형변환 중 한번만, 컴파일러는 둘을 동시에는 못함
		m(Long.valueOf(10)); //명시적
		m((long) i6);
		
		int i7 = Integer.parseInt("1234");
		long l = Long.parseLong("1234");
		boolean b = Boolean.parseBoolean("true");
		
		String input = "";
		boolean c = input.equals("Y");
		System.out.println(b);
	}
	
	static void m(Long l) {
		
	}

	
}
