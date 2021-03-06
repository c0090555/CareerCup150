package ObjectOrientedDesign;

public class Card {
	public enum Suit{
		CLUBS(1), SPADES(2), HEARTS(3), DIAMONDS(4);
		int value;
		private Suit(int v){
			value = v;
		}
	}
	
	private int card;
	private Suit suit;
	
	public Card(int r, Suit s){
		card = r;
		suit = s;
	}
	
	public int value(){
		return card;
	}
	
	public Suit suit(){
		return suit;
	}
}


class BlackJackCard extends Card{
	public BlackJackCard(int r, Suit s){
		super(r, s);
	}
	
	public int value(){
		int r = super.value();
		if(r == 1) return 11;
		if(r < 10) return r;
		return 10;
	}
	
	boolean isAce(){
		return super.value() == 1;
	}
	
	
	
}
