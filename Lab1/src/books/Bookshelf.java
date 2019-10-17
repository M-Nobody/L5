package books;

public class Bookshelf {

	public static void main(String[] args) {

		Book B1 = new Book("On the Origin of Species", "Charles Darwin", "John Murray", "24 November 1859");
		Book B2 = new Book("A Brief History of Time", "Stephen Hawking", "Bantam Books", "1 March 1998");
		Book B3 = new Book("Philosophiæ Naturalis Principia Mathematica", "Isaac Newton", "Benjamin Motte", "5 July 1687");
		
		System.out.println("Books on the shelf: ");
		System.out.println();
		System.out.println("Book 1-\n"+B1);
		System.out.println();
		System.out.println("Book 2-\n"+B2);
		System.out.println();
		System.out.println("Book 3-\n"+B3);
		
	}

}
