package lesson13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // 크기 지정 없음 , 제네릭을 통한 지정, 명시하지않으면 obj 타입
		
		for(int i = 1; i<7;i++) {
			list.add(i); //타입 미지정가능 
		}
		list.add((int)'A');
		
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i)); //메서드를 이용한 접근
		}
		
		System.out.println(list);
	}
}
