package model;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Loan loan = new Loan(0, new Customer("", "", "",
				"", "", "", 0, GenderType.UNKNOWN),
					new Book(0, "", "", "", "", 0));
		assertTrue(loan.getDueDate().isAfter(LocalDate.now()));
   }
}