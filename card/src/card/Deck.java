package card;

public class Deck {
	int count =0;
	Card[] cards = new Card[52]; //초기값 널값
	{ // 초기화 블럭
		for(int i = 0; i <4 ;i++) { //아니면 카운트로 하여도 된다
			for(int j = 0; j <13 ; j++) {
				cards[i * 13 + j] = new Card(i, j);
			}
		}
	}
	
	Deck print() {
		for(Card c : cards) {
		System.out.println(c);
		}
		return this;
	}
	
	Deck shuffle() {
		for(int i = 0; i < cards.length ; i++) {
			int r = (int)(Math.random() * 52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
		return this;
	}
	
	Card pick() {
		return cards[count++];
	}
	
	public static void main(String[] args) {
		new Deck().shuffle().print().shuffle().print();
	}
	
}
