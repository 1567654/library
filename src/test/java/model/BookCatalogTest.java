package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		bc.addBook(new Book(2,null,"","","",0));
	}

	//G
	@Test
	public void testFindBook() {
        assertDoesNotThrow(() -> bc.findBook(book1.getTitle()));
    }

	//G
	@Test
	public void testFindBookIgnoringCase() {
        assertDoesNotThrow(() -> bc.findBook("lEarnIng jAva"));
    }

	//G
	@Test
	public void testFindBookWithExtraSpaces() {
		assertThrows(BookNotFoundException.class, () -> bc.findBook(" Learning   Java "));
    }

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		assertThrows(BookNotFoundException.class, () -> bc.findBook("Learn"));
	}

}
