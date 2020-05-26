import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("The Dark Knight Returns", "Frank Miller", "Action");
        library = new Library();
    }


    @Test
    public void canCheckBorrowedSize(){
        assertEquals(0, borrower.countBorrowsBooks());
    }

    @Test
    public void canAddBookToBorrower(){
        borrower.borrowsBook(library, book);
        assertEquals(1, borrower.countBorrowsBooks());
    }

}
