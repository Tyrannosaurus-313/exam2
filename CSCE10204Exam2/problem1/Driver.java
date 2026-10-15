package problem1;

public class Driver {

	public static void main(String[] args) {
		Book[] catalogue = new Book[20];
		catalogue[0] = new Book("Tis a Book", "J. J. Jonah", 9.99);
		catalogue[1] = new Book("Nota Book", "R. M. Willson", 10.99);
		catalogue[2] = new Book("Is a very long titled Book", "J. J. Jonah", 100);
		catalogue[3] = new Book("A book", "Test", 999.99);
		catalogue[4] = new Book("", "", -10);
		catalogue[5] = new Book();
		
		int i = 0;
		for (; i < catalogue.length; i++) {
			if (catalogue[i] != null) {
				catalogue[i].show();
			}
		}
	}
}
