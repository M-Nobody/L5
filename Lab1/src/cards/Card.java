package cards;

public class Card {
	private String suit;
	private String face;
	
	// set specific faces
	public void setFace(int f) {
		if (f == 1)
			this.face = "Ace";
		else if (f == 11)
			this.face = "Jack";
		else if (f == 12)
			this.face = "Queen";
		else if (f == 13)
			this.face = "King";
		else
			this.face = Integer.toString(f);
	}
	
	// set specific suits 
	public void setSuit(int s) {
		switch (s) {
		case 1:
			this.suit = "Spades";
			break;
		case 2:
			this.suit = "Hearts";
			break;
		case 3:
			this.suit = "Clubs";
			break;
		case 4:
			this.suit = "Diamonds";
			break;
		}
	}

	public String toString() {
		return face + " of " + suit;
	}
	
	// create random value for suit and face
	public void dealRandomCard() {
		setSuit((int) (Math.random() * 4) + 1);
		setFace((int) (Math.random() * 13) + 1);
	}

}
