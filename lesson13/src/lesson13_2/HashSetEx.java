package lesson13_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Addr> set = new HashSet<Addr>();
		set.add(new Addr("김윤석","1234"));
		System.out.println(set);
		Addr addr = new Addr("김윤석", "5678");
		set.add(addr);
		System.out.println(set);
		set.add(addr);
		System.out.println(set);
		
		//equals(), hashcode()
		Addr addr2 = new Addr("B","1234");
		set.add(addr2);
		System.out.println(set);
		
		for(Addr a : set) {
			System.out.println(a.hashCode());
		}
		
	}

	
}
class Addr implements Comparable<Addr>{
	String name;
	String tel;
	
	
	public Addr(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}


	@Override
	public String toString() {
		return String.format("Addr [name=%s, tel=%s]", name, tel);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return tel.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		return tel.equals(((Addr)obj).tel);
	}
	@Override
	public int compareTo(Addr o) {
		return name.compareTo(o.name);
	}
	
	
	
	
	
}
