package card;

public class Main {
	public static void main(String[] args) {
		play();
	}
	
	static void play() {
		Player[] players = new Player[4];
		
		Deck deck = new Deck().shuffle();
		
		players[0] = new Player("A");
		players[1] = new Player("B");
		players[2] = new Player("C");
		players[3] = new Player("D");
		
//		for(int i = 0; i< 5 ;i++) {
//			for(int j = 0; j<players.length ;j++) {
//				
//			}
//		}
		
		for(int i = 0 ; i < players.length ; i++) {
			for(int j = 0 ; j < players[i].cards.length; j++) {
				players[i].cards[j] = deck.pick();
			}
		}

		for(Player p : players) {
			System.out.println(p);
		}
		
	}
}
