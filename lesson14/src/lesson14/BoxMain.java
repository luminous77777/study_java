package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoxMain {
	public static void main(String[] args) {
	
		Box<String> box = new Box<>();
		
		box.setItme("양말");
		System.out.println(box.getItme());
		
		Box<Integer> box2 = new Box<>();
		box2.setItme(10);
		
		Comparator<Object> comp = (a,b) -> 0;
		List<Integer> list = new ArrayList<Integer>();
		list.sort(comp);
		
	}
}
class Box<T>{
	private Object itme;

	public Object getItme() {
		return itme;
	}

	public void setItme(T itme) {
		this.itme = itme;
	}
	
	public static <T> void sm (T t) {
		System.out.println(t);
	}
	
	
}
