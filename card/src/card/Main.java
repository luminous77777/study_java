package card;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		play();
//		Card card = new Card(Kind.CLOVER, 0);
//		System.out.println(card);
//		card.kind = Kind.SPACE;
//		System.out.println(card.kind);
//		
//		Kind kind = Kind.DIAMOND;
//		Kind kind2 = Kind.HEART;
//		System.out.println(kind.ordinal());
//		System.out.println(kind == kind2);
//		System.out.println(kind.name());
//		System.out.println(kind2.getName());
		
	}
	
	static void play() {
		List<Player> players= new ArrayList<Player>();
		
		Deck deck = new Deck().shuffle();
		deck.shuffle();
		players.add(new Player("A")) ;
		players.add(new Player("B")) ;
		players.add(new Player("C")) ;
		players.add(new Player("D")) ;
		
//		for(int i = 0; i< 5 ;i++) {
//			for(int j = 0; j<players.length ;j++) {
//				
//			}
//		}
		
		for(int i = 0 ; i < players.size() ; i++) {
			for(int j = 0; j <5 ; j++) {
				players.get(i).cards.add(deck.pick());				
			}
		}

		for(Player p : players) {
			System.out.println(p);
		}
		
		System.out.println("deck의 남은 카드 갯수 : " + deck.cards.size());
		
	}
}
