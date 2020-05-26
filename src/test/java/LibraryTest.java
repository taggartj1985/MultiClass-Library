import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("It", "Stephen King", "Horror");
        book2 = new Book("Dracula", "Bram Stoker", "Horror");
        book3 = new Book("The Dark Knight Returns", "Frank Miller", "Action");
    }

    @Test
    public void addBooksInLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacity(){
        assertEquals(5,library.getCapacity());
    }

    @Test
    public void addBookIfNotFull(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void cantAddBookIfFull(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void removeBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canGetGenre(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addGenres(book1);
        assertEquals(2, library.getGenre());
    }
}
