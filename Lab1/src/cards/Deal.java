package cards;

public class Deal {

	public static void main(String[] args) {
		Card C = new Card();

		System.out.println("Your 5 cards are:");

		for (int i = 0; i < 5; i++) {
			C.dealRandomCard();
			System.out.println(C);
		}
	}
}
