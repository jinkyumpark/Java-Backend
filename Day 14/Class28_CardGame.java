package days14;

public class Class28_CardGame {
	public static void main(String[] args) {
		CardDeck d = new CardDeck();
		d.shuffle();
		
		Card[][] players = new Card[4][5];
		
		int index = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				players[i][j] = d.pick(index);
				index++;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("Player%d : ", i);
			for(int j = 0; j < 5; j++) {
				System.out.printf("%s ", players[i][j]);
			}
			System.out.println();
		}
	}
}

class CardDeck {
	private Card[] cards = new Card[52];
	
	CardDeck() {
		int index = 0;
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 13; j++) {
				cards[index] = new Card(i, j);
				index++;
			}
		}
	}
	
	public Card pick(int i) {
		return cards[i];
	}
	
	public void shuffle() {
		for(int i = 0; i < 52; i++) {
			int randomNum = (int)(Math.random() * 52);
			Card temp = cards[randomNum];
			cards[randomNum] = cards[i];
			cards[i] = temp;
		}
	}
}
