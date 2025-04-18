package lesson12;

public class Member implements Cloneable{
	String name;
	String tel;
	
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String toString() {
		return "name : " + name + ", tel : "+tel;
	}
	
	@Override // Override의 문법 체크용
	public boolean equals(Object obj) {
		return obj != null && obj instanceof Member && ((Member)obj).tel.equals(this.tel);
	}
	
	@Override
	public Member clone() {
		Member member = null;
		try {
			member = (Member) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
}
