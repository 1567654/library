package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book = new Book(1, "", "", "", "", 0);
		assertTrue(book.equals(book));
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book = new Book(1, "", "", "", "", 0);
		assertFalse(book.equals(new Book(2, "", "", "", "", 0)));
	}

}
