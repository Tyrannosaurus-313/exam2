package problem1;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public void setTitle(String title) 		{ this.title = title; }
	public void setAuthor(String author) 	{ this.author = author; }
	public void setPrice(double price) {
		if (price >= 0 && price <= 200)
			this.price = price;
	}
	
	public String getTitle() 	{ return title; }
	public String getAuthor() 	{ return author; }
	public double getPrice() 	{ return price; }
	
	public Book() {
		setTitle("UnKnown");
		setAuthor("UnKnown");
		setPrice(0);
	}

	public Book(String title, String author, double price) {
		setTitle(title);
		setAuthor(author);
		setPrice(price);
	}
	
	public void show() {
		System.out.printf("%-26s - By %-16s for %6.2f\n", title, author, price);
	}
}
