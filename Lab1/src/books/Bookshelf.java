package books;

import java.lang.StringBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bookshelf {

	public static void main(String[] args) throws IOException {

		Book[] Books = new Book[5];
		int bookNum = 1;
		StringBuilder sb = new StringBuilder();

		Books[0] = new Book("On the Origin of Species", "Charles Darwin", "John Murray", "24/11/1859");
		Books[1] = new Book("A Brief History of Time", "Stephen Hawking", "Bantam Books", "01/03/1998");
		Books[2] = new Book("Philosophiæ Naturalis Principia Mathematica", "Isaac Newton", "Benjamin Motte",
				"05/07/1687");
		Books[3] = new Book("Pride and Prejudice", "Jane Austen", "Thomas Egerton", "28/01/1813");
		Books[4] = new Book("Gulliver's Travels", "Jonathan Swift", "Benjamin Motte", "28/10/1726");

		System.out.println("Books on the shelf: ");
		System.out.println();
		for (Book b : Books) {
			System.out.println("Book " + bookNum + " -");
			System.out.println(b);
			System.out.println();
			bookNum++;
		}

		File table = new File("table.html");
		if (table.exists()) {
			table.delete();
			table.createNewFile();
		} else {
			table.createNewFile();
		}
		System.out.println("File Created");
		FileWriter writer = new FileWriter("table.html");
		writer.write(
				"<html><head><style>caption{font-size:20pt;margin-bottom:20px;margin-top:40px;}th{background-color: #4CAF50;color: white;}th,td{padding: 15px;text-align: left;border-bottom: 1px solid #ddd;}tr:hover {background-color: #f5f5f5;}table{border-collapse: collapse;font-family: Calibri;font-size:large;}tr:nth-child(even) {background-color: #f2f2f2;}</style><title>BookShelf</title></head><body><table align=\"center\"><caption>Books</caption><thead><tr><th>Title</th><th>Author</th><th>Publisher</th><th>Copyright date</th></tr></thead><tbody>");

		for (Book b : Books) {
			sb.append("<tr>");
			sb.append("<td>" + b.getTitle() + "</td>");
			sb.append("<td>" + b.getAuthor() + "</td>");
			sb.append("<td>" + b.getPublisher() + "</td>");
			sb.append("<td>" + b.getCopyrightDate() + "</td>");
			sb.append("</tr>");
		}
		writer.write(sb + "</tbody></table></body></html>");
		writer.close();

	}

}
