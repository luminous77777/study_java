package card;

public class Card {
	Kind kind; // SPADE, DIAMONE, HEART, CLOVER
	int number; // 2~ 10~ jqkA
	
	Card(Kind kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		String numbers = "23456789XJQKA";
//		String kinds = "♣♥◆♠";
		return "[" + kind.getName()+","+numbers.charAt(number)+"]";
	}
}
