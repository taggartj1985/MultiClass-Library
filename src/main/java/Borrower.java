import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }

    public void borrowsBook(Library library, Book book){
        this.booksBorrowed.add(library.removeBook(book));
    }

}
