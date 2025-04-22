package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //Vector, ArrayList 인터페이스로 구현되어있음
		
		list.add("김윤석");
		list.add("A");
		list.add("B");
		
		list.remove(0);
		list.add("C");
		list.remove("A");
		list.set(0, "V");
		list.add(0, "DI");
		
		for(String s: list) {
			System.out.println(s);
		}
		
		System.out.println(list);
		System.out.println(list.size());
		
	}
}
