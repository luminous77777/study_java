package lesson16_2;

public	class Students{
	String name;
	int score;
	public Students(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, score=%s]", name, score);
	}		
}

