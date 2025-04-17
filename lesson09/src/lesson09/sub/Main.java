package lesson09.sub;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Human();
		animals[1] = new Human();
		animals[2] = new Dog();
		animals[3] = new Parrot();
		
		
		Talkable[] talkables = new Talkable[3];
		talkables[0] = new Human();
		talkables[1] = new Parrot();
		talkables[2] = new Speaker();
		for(Talkable t : talkables) {
			t.talk();
		}
		
		
		Human human = new Human();
		Dog dog = new Dog();
		System.out.println(human instanceof Human); //휴먼 클래스의 인스턴스 인가?
		System.out.println(human instanceof Animal); //애니멀을 상속받았기 때문에 참
		System.out.println(human instanceof Talkable); //톡커블을 구현했기 때문에 참
		System.out.println(dog instanceof Talkable);//  거짓 
		//인스턴스가 그 타입으로 형변환 가능한가를 묻는다
	}
}
