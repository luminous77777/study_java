package lesson09.sub;

public class Human extends Animal implements Talkable{

	@Override
	public void talk() {
		System.out.println("사람이 말함");
	}

}
