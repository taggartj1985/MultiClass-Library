import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;
    private Book book;
    private Library library;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }

    public void borrowsBook(Library library, Book book){
        library.removeBook(book);
        booksBorrowed.add(book);
    }

    public int countBorrowsBooks(){
        return this.booksBorrowed.size();
    }
}
