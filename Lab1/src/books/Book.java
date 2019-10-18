package books;

import java.time.LocalDate;

public class Book {

	private String title, author, publisher;
	LocalDate copyrightDate;
	
	public Book(String title, String author, String publisher, String copyrightString) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		String date[] = copyrightString.split("/");
		int [] dateInt = new int[date.length];
		for (int i=0;i<3;i++) dateInt[i] = Integer.parseInt(date[i]);
		copyrightDate = LocalDate.of(dateInt[2],dateInt[1],dateInt[0]);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public LocalDate getCopyrightDate() {
		return copyrightDate;
	}
	
	public String timePassed(LocalDate copyrightDate) {
		LocalDate ld = LocalDate.now();
		
		int year = ld.getYear()-copyrightDate.getYear();
		int month = Math.abs(ld.getMonthValue()-copyrightDate.getMonthValue());
		int date = Math.abs(ld.getDayOfMonth()-copyrightDate.getDayOfMonth());
		return String.format("%04d", year)+"-"+String.format("%02d", month)+"-"+String.format("%02d", date);
	}

	public String toString() {
		return "Book title: " + getTitle() + "\nBook author: " + getAuthor() + "\nPublisher: " + getPublisher()
				+ "\nCopyright Date: " + getCopyrightDate() + "\nTime Passed: " + timePassed(getCopyrightDate());
	}

}
